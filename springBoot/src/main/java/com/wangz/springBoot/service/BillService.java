package com.wangz.springBoot.service;

import com.wangz.springBoot.bean.Bill;
import com.wangz.springBoot.dao.BillDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

/**
 * 账单Service
 * Created by wangz on 2017/10/17.
 */
@Service
public class BillService {

    @Autowired
    private BillDao billDao;

    /**
     * insert 账单信息
     * @param params
     * @return
     */
    public int insertBill(Map<String, Object> params){

        String id = UUID.randomUUID().toString().replaceAll("-", "");
        String name = params.get("name") != null ? (String) params.get("name") : "";
        double billMoney = params.get("billMoney") != null ? Double.valueOf( (String) params.get("billMoney")).doubleValue()  : 0.00;
        Date date = new Date();
        String billTypeId = params.get("billTypeId") != null ? (String) params.get("billTypeId") : "";
        String userId = params.get("userId") != null ? (String) params.get("userId") : "";

        Bill bill = new Bill();
        bill.setId(id);
        bill.setName(name);
        bill.setBillMoney(billMoney);
        bill.setBillDate(date);
        bill.setBillTypeId(billTypeId);
        bill.setUserId(userId);
        return billDao.insertBill(bill);
    }
}
