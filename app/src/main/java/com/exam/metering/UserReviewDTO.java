package com.exam.metering;

import java.io.Serializable;

public class UserReviewDTO implements Serializable {
    String userReviewId;
    String userId;
    String reviewContent;

    public UserReviewDTO(String userId, String reviewContent) {
        this.userId = userId;
        this.reviewContent = reviewContent;
    }

    public UserReviewDTO(String userReviewId, String userId, String reviewContent) {
        this.userReviewId = userReviewId;
        this.userId = userId;
        this.reviewContent = reviewContent;
    }

    public String getUserReviewId() { return userReviewId; }
    public void setUserReviewId(String userReviewId) { this.userReviewId = userReviewId; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getReviewContent() { return reviewContent; }
    public void setReviewContent(String reviewContent) { this.reviewContent = reviewContent; }
}
