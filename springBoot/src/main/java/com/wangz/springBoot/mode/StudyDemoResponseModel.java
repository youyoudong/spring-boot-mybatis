package com.wangz.springBoot.mode;

import java.util.Map;

public class StudyDemoResponseModel {

    private String name;

    private int age;

    private Map<String, Object> source;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Object> getSource() {
        return source;
    }

    public void setSource(Map<String, Object> source) {
        this.source = source;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
