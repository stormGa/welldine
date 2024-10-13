package cn.lkh.welldine.model;

import lombok.Data;

import java.util.Date;

/**
 * 用户账号信息：
 * UserID (主键)
 * 用户名
 * 密码
 * 性别
 * 手机号
 * 注册地
 * 当前地址
 * 注册日期
 * 最后登录日期
 *
 */
@Data
public class User {
    private int userId;
    private String username;
    private String password;
    private boolean gender;
    private String phone;
    private String registerAddress;
    private String currentAddress;
    private Date registerDate;
    private Date loginDate;

    public String getUserHealthInfo(){
       return "姓名:" + username + " 性别:" + (isGender() ? "男" : "女") +
             " 当前住址:" + currentAddress;
    }
}
