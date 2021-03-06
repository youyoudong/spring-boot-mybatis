package com.wangz.springBoot.service;

import com.wangz.springBoot.bean.OperateType;
import com.wangz.springBoot.bean.User;
import com.wangz.springBoot.dao.OperateTypeDao;
import com.wangz.springBoot.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * 操作日志service
 * Created by wangz on 2017/10/24.
 */
@Service
public class OperateTypeService {

    @Autowired
    private OperateTypeDao operateTypeDao;

    /**
     * 插入操作日志
     * @param user
     * @param tableName
     * @param typeId
     * @param typeName
     * @return
     */
    public int insertOperateType(User user, String tableName, String typeId, String typeName){
        OperateType operateType = new OperateType();
        operateType.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        operateType.setUserId(user.getId());
        operateType.setOperateDate(new Date());
        operateType.setTableName(tableName);
        operateType.setOperateType(typeId);
        operateType.setRemark("用户：" + user.getName() + "于" + Utils.timeToString(new Date()) +
                "对表：" + tableName + "进行了" + typeName + "操作");

        return operateTypeDao.insertOperateType(operateType);
    }

    /**
     * 查询所有记录包括已删除
     * @return list<OperateType>
     */
    public List<OperateType> findAllWithDelete(){
        return operateTypeDao.findAllWithDelete();
    }

    /**
     * 查询所有未删除的数据
     * @return list<OperateType>
     */
    public List<OperateType> findAll(){
        return operateTypeDao.findAll();
    }
}
