package com.exam.metering;

import java.io.Serializable;

public class ClassDTO implements Serializable {
    String classId;
    String categoryId;
    String userId;
    String className;
    boolean isOnline;
    int classMNum;
    byte[] classImg;
    int classPerHour;
    int classWeek;
    int classPerCount;
    int classPrice;
    String[] ClassSchedule;

    public ClassDTO(String categoryId, String userId, String className, boolean isOnline, int classMNum, byte[] classImg, int classPerHour, int classWeek, int classPerCount, int classPrice, String[] classSchedule) {
        this.categoryId = categoryId;
        this.userId = userId;
        this.className = className;
        this.isOnline = isOnline;
        this.classMNum = classMNum;
        this.classImg = classImg;
        this.classPerHour = classPerHour;
        this.classWeek = classWeek;
        this.classPerCount = classPerCount;
        this.classPrice = classPrice;
        ClassSchedule = classSchedule;
    }

    public ClassDTO(String classId, String categoryId, String userId, String className, boolean isOnline, int classMNum, byte[] classImg, int classPerHour, int classWeek, int classPerCount, int classPrice, String[] classSchedule) {
        this.classId = classId;
        this.categoryId = categoryId;
        this.userId = userId;
        this.className = className;
        this.isOnline = isOnline;
        this.classMNum = classMNum;
        this.classImg = classImg;
        this.classPerHour = classPerHour;
        this.classWeek = classWeek;
        this.classPerCount = classPerCount;
        this.classPrice = classPrice;
        ClassSchedule = classSchedule;
    }

    public String getClassId() { return classId; }
    public void setClassId(String classId) { this.classId = classId; }

    public String getCategoryId() { return categoryId; }
    public void setCategoryId(String categoryId) { this.categoryId = categoryId; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getClassName() { return className; }
    public void setClassName(String className) { this.className = className; }

    public boolean isOnline() { return isOnline; }
    public void setOnline(boolean online) { isOnline = online; }

    public int getClassMNum() { return classMNum; }
    public void setClassMNum(int classMNum) { this.classMNum = classMNum; }

    public byte[] getClassImg() { return classImg; }
    public void setClassImg(byte[] classImg) { this.classImg = classImg; }

    public int getClassPerHour() { return classPerHour; }
    public void setClassPerHour(int classPerHour) { this.classPerHour = classPerHour; }

    public int getClassWeek() { return classWeek; }
    public void setClassWeek(int classWeek) { this.classWeek = classWeek; }

    public int getClassPerCount() { return classPerCount; }
    public void setClassPerCount(int classPerCount) { this.classPerCount = classPerCount; }

    public int getClassPrice() { return classPrice; }
    public void setClassPrice(int classPrice) { this.classPrice = classPrice; }

    public String[] getClassSchedule() { return ClassSchedule; }
    public void setClassSchedule(String[] classSchedule) { ClassSchedule = classSchedule; }
}
