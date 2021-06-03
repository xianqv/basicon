package com.base.basicon.pojo;

public enum CoachType {

    PRIMARY ("初级"),
    MIDDLE("初级"),
    HIGH("高级");

    String value;

    private CoachType(String value){
        this.value = value;
    }
}
