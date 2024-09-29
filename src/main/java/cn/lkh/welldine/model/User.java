package cn.lkh.welldine.model;

import java.util.Date;

/**
 *  用户账号信息：
 *
 *  UserID (主键)
 * 用户名
 * 密码
 * 性别
 * 注册地
 * 当前地址
 * 注册日期
 * 最后登录日期
 *
 */
public class User {
    private int userId;
    private String username;
    private String password;
    private boolean gender;
    private String registerAddress;
    private String currentAddress;
    private Date registerDate;
    private Date loginDate;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", registerAddress='" + registerAddress + '\'' +
                ", currentAddress='" + currentAddress + '\'' +
                ", registerDate=" + registerDate +
                ", loginDate=" + loginDate +
                '}';
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }
}

