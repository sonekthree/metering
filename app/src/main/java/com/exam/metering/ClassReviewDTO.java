package com.exam.metering;

import java.io.Serializable;

public class ClassReviewDTO implements Serializable {
    String classReviewId;
    String classId;
    String userId;
    int reviewRating;
    String reviewContent;

    public ClassReviewDTO(String classId, String userId, int reviewRating, String reviewContent) {
        this.classId = classId;
        this.userId = userId;
        this.reviewRating = reviewRating;
        this.reviewContent = reviewContent;
    }

    public ClassReviewDTO(String classReviewId, String classId, String userId, int reviewRating, String reviewContent) {
        this.classReviewId = classReviewId;
        this.classId = classId;
        this.userId = userId;
        this.reviewRating = reviewRating;
        this.reviewContent = reviewContent;
    }

    public String getClassReviewId() { return classReviewId; }
    public void setClassReviewId(String classReviewId) { this.classReviewId = classReviewId; }

    public String getClassId() { return classId; }
    public void setClassId(String classId) { this.classId = classId; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public int getReviewRating() { return reviewRating; }
    public void setReviewRating(int reviewRating) { this.reviewRating = reviewRating; }

    public String getReviewContent() { return reviewContent; }
    public void setReviewContent(String reviewContent) { this.reviewContent = reviewContent; }
}
