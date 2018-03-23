package com.wangz.springBoot.util;

/**
 * TABLE枚举
 * Created by wangz on 2017/10/22.
 */
public enum TableEnum {

    BILL("bill"),
    BILLTYPE("bill_type"),
    USER("user"),
    OPERATETYPE("operate_type");

    private final String key;

    public String getKey() {
        return key;
    }

    TableEnum(String key) {
        this.key = key;
    }
}
