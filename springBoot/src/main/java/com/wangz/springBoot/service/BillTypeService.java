package com.wangz.springBoot.service;

import com.wangz.springBoot.bean.BillType;
import com.wangz.springBoot.dao.BillTypeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.UUID;

/**
 * 账单分类Service
 * Created by wangz on 2017/10/17.
 */
@Service
public class BillTypeService {

    @Autowired
    private BillTypeDao billTypeDao;

    /**
     * 插入账单分类信息
     * @param bt
     */
    public void insertBillType(BillType bt){
        String id = UUID.randomUUID().toString().replaceAll("-", "");
        bt.setId(id);
        billTypeDao.insertBillType(bt);
    }
}
