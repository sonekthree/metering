package com.exam.metering.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.exam.metering.dto.ClassTag;

import java.util.List;

@Dao
public interface ClassTagDAO {
    @Insert
    void insertClassTag(ClassTag classTag);

    @Update
    void updateClassTag(ClassTag classTag);

    @Delete
    void deleteClassTag(long classTagId);

    @Query("SELECT * FROM ClassTag")
    List<ClassTag> getClassTagList();
}
