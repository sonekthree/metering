package com.exam.metering.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.exam.metering.dto.ClassInfo;

import java.util.List;

@Dao
public interface ClassInfoDAO {
    @Insert
    void insertClassInfo(ClassInfo classInfo);

    @Update
    void updateClassInfo(ClassInfo classInfo);

    @Delete
    void deleteClassInfo(ClassInfo classInfo);

    @Query("SELECT * FROM ClassInfo")
    List<ClassInfo> getClassInfoList();
}
