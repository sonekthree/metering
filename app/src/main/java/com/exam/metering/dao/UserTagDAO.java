package com.exam.metering.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.exam.metering.dto.UserTag;

import java.util.List;

@Dao
public interface UserTagDAO {
    @Insert
    void insertUserTag(UserTag userTag);

    @Update
    void updateUserTag(UserTag userTag);

    @Delete
    void deleteUserTag(long userTagId);

    @Query("SELECT * FROM UserTag")
    List<UserTag> getUserTagList();
}
