package com.jiangwei.test.testjava.user.domain;

import java.util.Date;

/**
 * Created by weijiang
 * Date: 2016/10/27
 * Desc: 用户
 */
public class SyUser {
    private Integer id;
    private String userName;
    private String userCode;
    private Integer age;
    private String sex;
    private String email;
    private String tel;
    private Integer degree;
    private String duty;
    private String bornCity;
    private String passWord;
    private Date createTime;
    private Date modifyTime;
    private Integer delFlag;
    private String modifyUser;

    public SyUser() {

    }

    public SyUser(Integer id, String userName, String userCode, Integer age, String sex, String email, String tel,
                  Integer degree, String duty, String bornCity, String passWord, Date createTime, Date modifyTime,
                  Integer delFlag, String modifyUser) {
        this.id = id;
        this.userName = userName;
        this.userCode = userCode;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.tel = tel;
        this.degree = degree;
        this.duty = duty;
        this.bornCity = bornCity;
        this.passWord = passWord;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.delFlag = delFlag;
        this.modifyUser = modifyUser;
    }

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

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getDegree() {
        return degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getBornCity() {
        return bornCity;
    }

    public void setBornCity(String bornCity) {
        this.bornCity = bornCity;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }
}
