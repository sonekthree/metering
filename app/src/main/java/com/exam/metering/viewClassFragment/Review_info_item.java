package com.exam.metering.viewClassFragment;

public class Review_info_item{
    float rating;
    String content;
    static int size = 0;
    static float totalRating = (float) 0.0;
    Review_info_item(float rating, String content){
        this.rating = rating;
        this. content = content;
        this.size++;
        this.totalRating += rating;
    }
}