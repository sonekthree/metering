package com.exam.metering.dto;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class UserReview implements Serializable {
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "userreview_id") long userReviewId;
    @ColumnInfo(name = "user_id") long userId;
    @ColumnInfo(name = "review_content") String reviewContent;

    public UserReview() { }

    public UserReview(long userReviewId, long userId, String reviewContent) {
        this.userReviewId = userReviewId;
        this.userId = userId;
        this.reviewContent = reviewContent;
    }

    public long getUserReviewId() { return userReviewId; }
    public void setUserReviewId(long userReviewId) { this.userReviewId = userReviewId; }

    public long getUserId() { return userId; }
    public void setUserId(long userId) { this.userId = userId; }

    public String getReviewContent() { return reviewContent; }
    public void setReviewContent(String reviewContent) { this.reviewContent = reviewContent; }
}
