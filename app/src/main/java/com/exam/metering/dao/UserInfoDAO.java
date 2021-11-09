package com.exam.metering.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.exam.metering.dto.UserInfo;

import java.util.List;

@Dao
public interface UserInfoDAO {
    @Insert
    void insertUserInfo(UserInfo userInfo);

    @Update
    void updateUserInfo(UserInfo userInfo);

    @Delete
    void deleteUserInfo(long userId);

    @Query("SELECT * FROM UserInfo")
    List<UserInfo> getUserInfoList();
}
