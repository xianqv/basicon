package com.base.basicon.pojo;

/**
 * 人员基本信息模板
 */
public class EmployeeInfo {
    private int Id ;
    private GenderEnum gender;
    private String username;
    private String age;
    private int idcard;
    private String address;
    private String phonenumbers;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getIdcard() {
        return idcard;
    }

    public void setIdcard(int idcard) {
        this.idcard = idcard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumbers() {
        return phonenumbers;
    }

    public void setPhonenumbers(String phonenumbers) {
        this.phonenumbers = phonenumbers;
    }

    @Override
    public String toString() {
        return "employeeInfo{" +
                "Id=" + Id +
                ", gender=" + gender +
                ", username='" + username + '\'' +
                ", age='" + age + '\'' +
                ", idcard=" + idcard +
                ", address='" + address + '\'' +
                ", phonenumbers='" + phonenumbers + '\'' +
                '}';
    }
}
