package com.wangz.springBoot.bean;

/**
 * 来源表source
 * @author wangz
 */
public class Source {

    /* 主键id */
    private String id;

    /* 名称 */
    private String name;

    /* 类型(来源类型，支出类型，，其他拓展类型等) */
    private int sourceType;

    /* 状态 */
    private int status;

    /* 关联用户id */
    private String userId;

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

    public int getSourceType() {
        return sourceType;
    }

    public void setSourceType(int sourceType) {
        this.sourceType = sourceType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
