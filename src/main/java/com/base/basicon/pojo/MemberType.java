package com.base.basicon.pojo;

public enum MemberType {
    FORMAL("正式"),INFORMAL("非正式");

    String value;

    private MemberType(String value){
        this.value = value;
    }
}
