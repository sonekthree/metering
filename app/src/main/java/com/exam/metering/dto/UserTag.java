package com.exam.metering.dto;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class UserTag implements Serializable {
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "usertag_id") long userTagId;
    @ColumnInfo(name = "usertag_name") String userTagName;

    public UserTag() { }

    public UserTag(long userTagId, String userTagName) {
        this.userTagId = userTagId;
        this.userTagName = userTagName;
    }

    public long getUserTagId() { return userTagId; }

    public String getUserTagName() { return userTagName; }
}
