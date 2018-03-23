package com.wangz.springBoot.dao;

import com.wangz.springBoot.bean.OperateType;
import org.apache.ibatis.annotations.Mapper;

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
}
