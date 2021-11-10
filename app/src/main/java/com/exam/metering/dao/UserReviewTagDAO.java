package com.exam.metering.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.exam.metering.dto.UserReviewTag;

import java.util.List;

@Dao
public interface UserReviewTagDAO {
    @Insert
    void insertUserReviewTag(UserReviewTag userReviewTag);

    @Update
    void updateUserReviewTag(UserReviewTag userReviewTag);

    @Delete
    void deleteUserReviewTag(UserReviewTag userReviewTag);

    @Query("SELECT * FROM UserReviewTag")
    List<UserReviewTag> getUserReviewTagList();
}
