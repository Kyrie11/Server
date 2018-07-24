package com.challenage.server.server.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
    private String name;
    private int credit;//信用额
    private String phoneNumber;
    private String sex;

    private Long id;
    private String city;

    public User(String name,int credit,String phoneNumber,String sex,String city){
        this.name = name;
        this.credit = credit;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
        this.city = city;
    }

    public User(){super();}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
