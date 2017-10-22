package com.wangz.springBoot.util;

/**
 * TABLE枚举
 * Created by wangz on 2017/10/22.
 */
public enum TableEnum {

    BILL("bill"),
    BILLTYPE("bill_type"),
    USER("user"),
    OPERATELOG("operate_log");

    private final String key;

    private String getKey() {
        return key;
    }

    TableEnum(String key) {
        this.key = key;
    }

}
