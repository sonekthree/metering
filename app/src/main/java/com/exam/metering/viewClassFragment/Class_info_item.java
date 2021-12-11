package com.exam.metering.viewClassFragment;

public class Class_info_item {
    public long classId;
    //public Drawable classPic;
    public String className;
    public String classType; // 온라인오프라인
    public int classCurNum;// 현재 인원
    public int classAllNum; //총인원
    public String classUser; // 클래스 선생
    public int classWeekCount; //주간 횟수
    public int classHourTime;// 시간
    public int classMNum; // 총 클래스횟수
    public int classPrice;// 1회당 class가격
    //public Drawable personImg;

    public Class_info_item(long classId, String className, String classType, int classCurNum, int classAllNum, String classUser, int classWeekCount, int classHourTime, int classMNum, int classPrice) {
        this.classId = classId;
        //this.classPic = classPic;
        this.className = className;
        this.classType = classType;
        this.classCurNum = classCurNum;
        this.classAllNum = classAllNum;
        this.classUser = classUser;
        this.classWeekCount = classWeekCount;
        this.classHourTime = classHourTime;
        this.classMNum = classMNum;
        this.classPrice = classPrice;
       // this.personImg = personImg;
    }

}

//class image
