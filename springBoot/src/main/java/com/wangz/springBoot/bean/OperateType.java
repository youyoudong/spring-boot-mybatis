package com.wangz.springBoot.bean;

import java.util.Date;

/**
 * 操作日志表operate_type
 * Created by wangz on 2017/10/22.
 */
public class OperateType {

    /*  主键ID  */
    private String id;

    /*  动作人ID  */
    private String userId;

    /*  动作时间  */
    private Date operateDate;

    /*  动作表名  */
    private String tableName;

    /*  动作类型  */
    private String operateType;

    /*  备注  */
    private String remark;

    /* 状态0正常1删除 */
    private int status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(Date operateDate) {
        this.operateDate = operateDate;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
