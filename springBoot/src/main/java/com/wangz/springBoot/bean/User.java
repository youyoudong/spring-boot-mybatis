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
}
