package com.wangz.springBoot.util;

/**
 * 用户操作枚举
 * Created by wangz on 2017/10/22.
 */
public enum TypeEnum {

    LOGIN(1, "登录"),
    LOGOUT(2, "登出"),
    SELECT(3, "查询"),
    ADD(4, "新增"),
    UPDATE(5, "修改"),
    DELETE(6, "删除");

    private final int key;
    private final String value;

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    TypeEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }
}
