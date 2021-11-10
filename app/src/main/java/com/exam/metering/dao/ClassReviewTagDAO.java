package com.exam.metering.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.exam.metering.dto.ClassReviewTag;

import java.util.List;

@Dao
public interface ClassReviewTagDAO {
    @Insert
    void insertClassReviewTag(ClassReviewTag classReviewTag);

    @Update
    void updateClassReviewTag(ClassReviewTag classReviewTag);

    @Delete
    void deleteClassReviewTag(ClassReviewTag classReviewTag);

    @Query("SELECT * FROM ClassReviewTag")
    List<ClassReviewTag> getClassReviewTagList();
}
