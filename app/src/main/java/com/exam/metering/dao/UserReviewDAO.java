package com.exam.metering.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.exam.metering.dto.UserReview;

import java.util.List;

@Dao
public interface UserReviewDAO {
    @Insert
    void insertUserReview(UserReview userReview);

    @Update
    void updateUserReview(UserReview userReview);

    @Delete
    void deleteUserReview(UserReview userReview);

    @Query("SELECT * FROM UserReview")
    List<UserReview> getUserReviewList();
}
