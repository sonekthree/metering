package com.exam.metering;

import java.io.Serializable;

public class UserReviewTagDTO implements Serializable {
    String userReviewTagId;
    String userReviewId;
    String userTagId;

    public UserReviewTagDTO(String userReviewId, String userTagId) {
        this.userReviewId = userReviewId;
        this.userTagId = userTagId;
    }

    public UserReviewTagDTO(String userReviewTagId, String userReviewId, String userTagId) {
        this.userReviewTagId = userReviewTagId;
        this.userReviewId = userReviewId;
        this.userTagId = userTagId;
    }

    public String getUserReviewTagId() { return userReviewTagId; }
    public void setUserReviewTagId(String userReviewTagId) { this.userReviewTagId = userReviewTagId; }

    public String getUserReviewId() { return userReviewId; }
    public void setUserReviewId(String userReviewId) { this.userReviewId = userReviewId; }

    public String getUserTagId() { return userTagId; }
    public void setUserTagId(String userTagId) { this.userTagId = userTagId; }
}
