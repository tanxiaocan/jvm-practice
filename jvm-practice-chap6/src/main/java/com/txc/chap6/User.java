package com.txc.chap6;

/**
 * Created by tanxiaocan on 2016/9/16.
 */
public class User {
    private static String staticField="100";
    private int userId;
    private String username;
    private String mobile;
    private byte sex;

    private static String getStaticField(){
        return staticField;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public byte getSex() {
        return sex;
    }

    public void setSex(byte sex) {
        this.sex = sex;
    }
}
