package com.example.demo.helloworld.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * FileName: UserInfo
 * Author:   RollerRunning
 * Date:     2019/8/6 6:02 PM
 * Description:
 */
public class UserInfo implements Serializable {
    private Integer id;

    private String userName;

    private String address;

    private Date addTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                ", addTime=" + addTime +
                '}';
    }
}
