package com.exam.metering.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.exam.metering.dto.ClassReview;

import java.util.List;

@Dao
public interface ClassReviewDAO {
    @Insert
    void insertClassReview(ClassReview classReview);

    @Update
    void updateClassReview(ClassReview classReview);

    @Delete
    void deleteClassReview(ClassReview classReview);

    @Query("SELECT * FROM ClassReview")
    List<ClassReview> getClassReviewList();
}
