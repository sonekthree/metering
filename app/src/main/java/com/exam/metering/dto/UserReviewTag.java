package com.exam.metering.dto;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class UserReviewTag implements Serializable {
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "userReview_tag_id") long userReviewTagId;
    @ColumnInfo(name = "userReview_id") long userReviewId;
    @ColumnInfo(name = "userTag_id") long userTagId;

    public UserReviewTag() { }

    public UserReviewTag(long userReviewTagId, long userReviewId, long userTagId) {
        this.userReviewTagId = userReviewTagId;
        this.userReviewId = userReviewId;
        this.userTagId = userTagId;
    }

    public long getUserReviewTagId() { return userReviewTagId; }
    public void setUserReviewTagId(long userReviewTagId) { this.userReviewTagId = userReviewTagId; }

    public long getUserReviewId() { return userReviewId; }
    public void setUserReviewId(long userReviewId) { this.userReviewId = userReviewId; }

    public long getUserTagId() { return userTagId; }
    public void setUserTagId(long userTagId) { this.userTagId = userTagId; }
}
