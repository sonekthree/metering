package com.exam.metering.dto;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class ClassReviewTag implements Serializable {
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "classreview_tag_id") long classReviewTagId;
    @ColumnInfo(name = "classreview_id") long classReviewId;
    @ColumnInfo(name = "classtag_id") long classTagId;

    public ClassReviewTag() { }

    public ClassReviewTag(long classReviewTagId, long classReviewId, long classTagId) {
        this.classReviewTagId = classReviewTagId;
        this.classReviewId = classReviewId;
        this.classTagId = classTagId;
    }

    public long getClassReviewTagId() { return classReviewTagId; }
    public void setClassReviewTagId(long classReviewTagId) { this.classReviewTagId = classReviewTagId; }

    public long getClassReviewId() { return classReviewId; }

    public void setClassReviewId(long classReviewId) { this.classReviewId = classReviewId; }

    public long getClassTagId() { return classTagId; }
    public void setClassTagId(long classTagId) { this.classTagId = classTagId; }
}
