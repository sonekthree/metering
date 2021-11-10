package com.exam.metering.dto;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class ClassReview implements Serializable {
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "classReview_id") long classReviewId;
    @ColumnInfo(name = "class_id") long classId;
    @ColumnInfo(name = "user_id") long userId;
    @ColumnInfo(name = "review_rating") int reviewRating;
    @ColumnInfo(name = "review_content") String reviewContent;

    public ClassReview() { }

    public ClassReview(long classReviewId, long classId, long userId, int reviewRating, String reviewContent) {
        this.classReviewId = classReviewId;
        this.classId = classId;
        this.userId = userId;
        this.reviewRating = reviewRating;
        this.reviewContent = reviewContent;
    }

    public long getClassReviewId() { return classReviewId; }
    public void setClassReviewId(long classReviewId) { this.classReviewId = classReviewId; }

    public long getClassId() { return classId; }
    public void setClassId(long classId) { this.classId = classId; }

    public long getUserId() { return userId; }
    public void setUserId(long userId) { this.userId = userId; }

    public int getReviewRating() { return reviewRating; }
    public void setReviewRating(int reviewRating) { this.reviewRating = reviewRating; }

    public String getReviewContent() { return reviewContent; }
    public void setReviewContent(String reviewContent) { this.reviewContent = reviewContent; }
}
