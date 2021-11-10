package com.exam.metering.dto;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class ClassInfo implements Serializable {
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "class_id") long classId;
    @ColumnInfo(name="category_id") long categoryId;
    @ColumnInfo(name="user_id") long userId;
    @ColumnInfo(name="class_name") String className;
    @ColumnInfo(name="class_type") String classType;
    @ColumnInfo(name="class_mnum") int classMNum;
    @ColumnInfo(name="class_img") byte[] classImg;
    @ColumnInfo(name="class_perhour") int classPerHour;
    @ColumnInfo(name="class_week") int classWeek;
    @ColumnInfo(name="class_percount") int classPerCount;
    @ColumnInfo(name="class_price") int classPrice;
    @ColumnInfo(name="class_plan") String classPlan;
    @ColumnInfo(name="class_schedule") String ClassSchedule;

    public ClassInfo() { }

    public ClassInfo(long classId, long categoryId, long userId, String className, String classType, int classMNum, byte[] classImg, int classPerHour, int classWeek, int classPerCount, int classPrice, String classPlan, String classSchedule) {
        this.classId = classId;
        this.categoryId = categoryId;
        this.userId = userId;
        this.className = className;
        this.classType = classType;
        this.classMNum = classMNum;
        this.classImg = classImg;
        this.classPerHour = classPerHour;
        this.classWeek = classWeek;
        this.classPerCount = classPerCount;
        this.classPrice = classPrice;
        this.classPlan = classPlan;
        ClassSchedule = classSchedule;
    }

    public long getClassId() { return classId; }
    public void setClassId(long classId) { this.classId = classId; }

    public long getCategoryId() { return categoryId; }
    public void setCategoryId(long categoryId) { this.categoryId = categoryId; }

    public long getUserId() { return userId; }
    public void setUserId(long userId) { this.userId = userId; }

    public String getClassName() { return className; }
    public void setClassName(String className) { this.className = className; }

    public String getClassType() { return classType; }
    public void setClassType(String classType) { this.classType = classType; }

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

    public String getClassPlan() { return classPlan; }
    public void setClassPlan(String classPlan) { this.classPlan = classPlan; }

    public String getClassSchedule() { return ClassSchedule; }
    public void setClassSchedule(String classSchedule) { ClassSchedule = classSchedule; }
}
