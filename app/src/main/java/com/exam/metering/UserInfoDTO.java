package com.exam.metering;

import java.io.Serializable;
import java.util.Date;

public class UserInfoDTO implements Serializable {
    String userId;
    String pw;
    String userName;
    String nickName;
    String email;
    String phone;
    Date birthday;
    byte[] picture;
    String sex;
    String school;
    String major;
    byte[] certSchool;
    byte[] certScore;
    String introduction;

    public UserInfoDTO(String pw, String userName, String nickName, String email, String phone, Date birthday, byte[] picture, String sex, String school, String major, byte[] certSchool, byte[] certScore, String introduction) {
        this.pw = pw;
        this.userName = userName;
        this.nickName = nickName;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
        this.picture = picture;
        this.sex = sex;
        this.school = school;
        this.major = major;
        this.certSchool = certSchool;
        this.certScore = certScore;
        this.introduction = introduction;
    }

    public UserInfoDTO(String userId, String pw, String userName, String nickName, String email, String phone, Date birthday, byte[] picture, String sex, String school, String major, byte[] certSchool, byte[] certScore, String introduction) {
        this.userId = userId;
        this.pw = pw;
        this.userName = userName;
        this.nickName = nickName;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
        this.picture = picture;
        this.sex = sex;
        this.school = school;
        this.major = major;
        this.certSchool = certSchool;
        this.certScore = certScore;
        this.introduction = introduction;
    }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getPw() { return pw; }
    public void setPw(String pw) { this.pw = pw; }

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public String getNickName() { return nickName; }
    public void setNickName(String nickName) { this.nickName = nickName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public Date getBirthday() { return birthday; }
    public void setBirthday(Date birthday) { this.birthday = birthday; }

    public byte[] getPicture() { return picture; }
    public void setPicture(byte[] picture) { this.picture = picture; }

    public String getSex() { return sex; }
    public void setSex(String sex) { this.sex = sex; }

    public String getSchool() { return school; }
    public void setSchool(String school) { this.school = school; }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    public byte[] getCertSchool() { return certSchool; }
    public void setCertSchool(byte[] certSchool) { this.certSchool = certSchool; }

    public byte[] getCertScore() { return certScore; }
    public void setCertScore(byte[] certScore) { this.certScore = certScore; }

    public String getIntroduction() { return introduction; }
    public void setIntroduction(String introduction) { this.introduction = introduction; }
}
