package com.exam.metering.viewClassFragment;

public class Review_info_item{
    public float rating;
    public String content;
    public String tag;
    public static int size = 0;
    public static float totalRating = (float) 0.0;

    public Review_info_item(float rating, String content){
        this.rating = rating;
        this. content = content;
        this.size++;
        this.totalRating += rating;
    }

    public Review_info_item(String tag){
        this.tag = tag;
    }
}