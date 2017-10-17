package com.wangz.springBoot.dao;

import com.wangz.springBoot.bean.Bill;
import org.apache.ibatis.annotations.Mapper;

/**
 * 账单DAO
 * Created by wangz on 2017/10/17.
 */
@Mapper
public interface BillDao {

    /**
     * insert data into bill
     * @param bill
     * @return
     */
    int insertBill(Bill bill);
}
