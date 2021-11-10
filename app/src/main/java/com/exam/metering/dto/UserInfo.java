package com.exam.metering.dto;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class UserInfo implements Serializable {
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "user_id") long userId;
    @ColumnInfo(name="pw") String pw;
    @ColumnInfo(name="user_name") String userName;
    @ColumnInfo(name="nick_name") String nickName;
    @ColumnInfo(name="email") String email;
    @ColumnInfo(name="phone") String phone;
    @ColumnInfo(name="birthday") String birthday;
    @ColumnInfo(name="picture") byte[] picture;
    @ColumnInfo(name="sex") String sex;
    @ColumnInfo(name="school") String school;
    @ColumnInfo(name="major") String major;
    @ColumnInfo(name="cert_school") byte[] certSchool;
    @ColumnInfo(name="cert_score") byte[] certScore;
    @ColumnInfo(name="introduction") String introduction;

    public UserInfo() { }

    public UserInfo(long userId, String pw, String userName, String nickName, String email, String phone, String birthday, byte[] picture, String sex, String school, String major, byte[] certSchool, byte[] certScore, String introduction) {
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

    public long getUserId() { return userId; }
    public void setUserId(long userId) { this.userId = userId; }

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

    public String getBirthday() { return birthday; }
    public void setBirthday(String birthday) { this.birthday = birthday; }

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
