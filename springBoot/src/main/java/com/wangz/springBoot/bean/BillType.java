package com.wangz.springBoot.bean;

/**
 * 账单分类表bill_type
 * Created by wangz on 2017/10/16.
 */
public class BillType {

    /* id */
    private String id;

    /* 账单分类名称 */
    private String name;

    /* 上级ID */
    private String parentId;

    private BillType billType;

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

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public BillType getBillType() {
        return billType;
    }

    public void setBillType(BillType billType) {
        this.billType = billType;
    }
}
