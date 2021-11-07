package com.exam.metering;

import java.io.Serializable;

public class ClassReviewTagDTO implements Serializable {
    String classReviewTagId;
    String classReviewId;
    String classTagId;

    public ClassReviewTagDTO(String classReviewId, String classTagId) {
        this.classReviewId = classReviewId;
        this.classTagId = classTagId;
    }

    public ClassReviewTagDTO(String classReviewTagId, String classReviewId, String classTagId) {
        this.classReviewTagId = classReviewTagId;
        this.classReviewId = classReviewId;
        this.classTagId = classTagId;
    }

    public String getClassReviewTagId() { return classReviewTagId; }
    public void setClassReviewTagId(String classReviewTagId) { this.classReviewTagId = classReviewTagId; }

    public String getClassReviewId() { return classReviewId; }
    public void setClassReviewId(String classReviewId) { this.classReviewId = classReviewId; }

    public String getClassTagId() { return classTagId; }
    public void setClassTagId(String classTagId) { this.classTagId = classTagId; }
}
