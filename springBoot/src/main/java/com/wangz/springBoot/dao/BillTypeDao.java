package com.wangz.springBoot.dao;

import com.wangz.springBoot.bean.BillType;
import org.apache.ibatis.annotations.Mapper;

/**
 * 账单分类DAO
 * Created by wangz on 2017/10/16.
 */
@Mapper
public interface BillTypeDao {

    /**
     * 插入账单分类信息
     * @param bt
     */
    void insertBillType(BillType bt);
}
