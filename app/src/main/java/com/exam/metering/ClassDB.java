package com.exam.metering;

import java.sql.Blob;

public class ClassDB {
    private String class_id;
    private String category_id;
    private String user_id;
    private String class_name;
    private Boolean class_online;
    private Blob class_img;
    private int class_mnum;
    private int class_perhour;
    private int class_percount;
    private int class_price;
    private String class_schedule;

    public String getClass_id(){
        return class_id;
    }

    public String getCategory_id(){
        return category_id;
    }

    public String getUser_id(){
        return user_id;
    }

    public String getClass_name(){
        return class_name;
    }

    public Boolean getClass_online(){
        return class_online;
    }

    public void setClass_id(String class_id){
        this.class_id = class_id;
    }

    public void setCategory_id(String category_id){
        this.category_id = category_id;
    }

    public void setClass_name(String class_name){
        this.class_name = class_name;
    }

    public void setClass_online(Boolean class_online){
        this.class_online = class_online;
    }

    public Blob getClass_img() {
        return class_img;
    }

    public int getClass_mnum() {
        return class_mnum;
    }

    public int getClass_percount() {
        return class_percount;
    }

    public int getClass_perhour() {
        return class_perhour;
    }

    public int getClass_price() { return class_price; }

    public String getClass_schedule() {
        return class_schedule;
    }

    public void setUser_id(String user_id){
        this.user_id = user_id;
    }

    public void setClass_img(Blob class_img) {
        this.class_img = class_img;
    }

    public void setClass_mnum(int class_mnum) {
        this.class_mnum = class_mnum;
    }

    public void setClass_percount(int class_percount) {
        this.class_percount = class_percount;
    }

    public void setClass_perhour(int class_perhour) {
        this.class_perhour = class_perhour;
    }

    public void setClass_price(int class_price) {
        this.class_price = class_price;
    }

    public void setClass_schedule(String class_schedule) {
        this.class_schedule = class_schedule;
    }
}
