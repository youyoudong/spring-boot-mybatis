package com.wangz.springBoot.bean;

/**
 * 用户表user
 * Created by wangz on 2017/10/14.
 */
public class User {

    /* id */
    private String id;

    /* 用户名 */
    private String name;

    /* 状态0正常1删除 */
    private int status;

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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
