package com.wangz.springBoot.bean;

import java.util.Date;

/**
 * 账单表bill
 * Created by wangz on 2017/10/17.
 */
public class Bill {

    /* id */
    private String id;

    /* 账单名称 */
    private String name;

    /* 账单金额 */
    private double billMoney;

    /* 账单时间 */
    private Date billDate;

    /* 账单分类id */
    private String billTypeId;

    /* 用户id */
    private String userId;

    /*支出类型id*/
    private String payTypeId;

    /* 账单分类信息 */
    private BillType billType;

    /* 用户信息 */
    private User user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBillMoney() {
        return billMoney;
    }

    public void setBillMoney(double billMoney) {
        this.billMoney = billMoney;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getBillTypeId() {
        return billTypeId;
    }

    public void setBillTypeId(String billTypeId) {
        this.billTypeId = billTypeId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPayTypeId() {
        return payTypeId;
    }

    public void setPayTypeId(String payTypeId) {
        this.payTypeId = payTypeId;
    }

    public BillType getBillType() {
        return billType;
    }

    public void setBillType(BillType billType) {
        this.billType = billType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

