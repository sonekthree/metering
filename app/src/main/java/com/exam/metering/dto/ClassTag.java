package com.exam.metering.dto;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class ClassTag implements Serializable {
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "classtag_id") long classTagId;
    @ColumnInfo(name = "classtag_name") String classTagName;

    public ClassTag() { }

    public ClassTag(long classTagId, String classTagName) {
        this.classTagId = classTagId;
        this.classTagName = classTagName;
    }

    public long getClassTagId() { return classTagId; }
    public void setClassTagId(long classTagId) { this.classTagId = classTagId; }

    public String getClassTagName() { return classTagName; }
    public void setClassTagName(String classTagName) { this.classTagName = classTagName; }
}
