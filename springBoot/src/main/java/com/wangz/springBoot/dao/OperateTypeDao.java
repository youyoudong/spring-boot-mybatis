package com.wangz.springBoot.dao;

import com.wangz.springBoot.bean.OperateType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 操作日志表DAO
 * Created by wangz on 2017/10/23.
 */
@Mapper
public interface OperateTypeDao {

    /**
     * 插入数据
     * @return
     */
    int insertOperateType(OperateType operateType);

    /**
     * 查询所有记录包括已删除
     * @return list<OperateType>
     */
    List<OperateType> findAllWithDelete();

    /**
     * 查询未删除的所有记录
     * @return list<OperateType>
     */
    List<OperateType> findAll();
}
