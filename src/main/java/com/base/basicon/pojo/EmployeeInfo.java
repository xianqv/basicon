package com.base.basicon.pojo;

/**
 * 人员基本信息模板
 */
public class EmployeeInfo {
    private int Id ;
    private GenderEnum gender;
    private String username;
    private String age;
    private int idCard;
    private String address;
    private String phoneNumbers;

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

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String phonenumbers) {
        this.phoneNumbers = phonenumbers;
    }

    @Override
    public String toString() {
        return "employeeInfo{" +
                "Id=" + Id +
                ", gender=" + gender +
                ", username='" + username + '\'' +
                ", age='" + age + '\'' +
                ", idcard=" + idCard +
                ", address='" + address + '\'' +
                ", phonenumbers='" + phoneNumbers + '\'' +
                '}';
    }
}
