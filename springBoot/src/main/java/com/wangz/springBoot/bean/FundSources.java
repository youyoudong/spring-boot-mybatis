package com.wangz.springBoot.bean;

import java.util.Date;

/**
 * 资金来源表fund_sources
 * Created by wangz on 2017/10/26.
 */
public class FundSources {

    /* id */
    private String id;

    /* 来源名称 */
    private String sourceName;

    /* 初始金额 */
    private double initMoney;

    /* 当前金额 */
    private double currnetMoney;

    /* 更新时间 */
    private Date updateDate;

    /* 状态0正常1删除 */
    private int status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public double getInitMoney() {
        return initMoney;
    }

    public void setInitMoney(double initMoney) {
        this.initMoney = initMoney;
    }

    public double getCurrnetMoney() {
        return currnetMoney;
    }

    public void setCurrnetMoney(double currnetMoney) {
        this.currnetMoney = currnetMoney;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
