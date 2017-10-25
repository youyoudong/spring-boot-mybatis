package com.wangz.springBoot.bean;

import java.util.Date;

/**
 * 资金变更表fund_change
 * Created by wangz on 2017/10/26.
 */
public class FundChange {

    /* id */
    private String id;

    /* 变更金额 */
    private double changeMoney;

    /* 变更类型0、支出1、收入 */
    private String changeType;

    /* 变更时间 */
    private Date changeDate;

    /* 资金来源表关联id */
    private String sourcesId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getChangeMoney() {
        return changeMoney;
    }

    public void setChangeMoney(double changeMoney) {
        this.changeMoney = changeMoney;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    public String getSourcesId() {
        return sourcesId;
    }

    public void setSourcesId(String sourcesId) {
        this.sourcesId = sourcesId;
    }
}