package com.exam.metering.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.exam.metering.dto.Application;

import java.util.List;

@Dao
public interface ApplicationDAO {
    @Insert
    void insertApplication(Application application);

    @Update
    void updateApplication(Application application);

    @Delete
    void deleteApplication(long appliId);

    @Query("SELECT * FROM Application")
    List<Application> getApplicationList();
}
