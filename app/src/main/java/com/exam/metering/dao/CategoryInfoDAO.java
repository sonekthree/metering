package com.exam.metering.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.exam.metering.dto.CategoryInfo;

import java.util.List;

@Dao
public interface CategoryInfoDAO {
    @Insert
    void insertCategoryInfo(CategoryInfo categoryInfo);

    @Update
    void updateCategoryInfo(CategoryInfo categoryInfo);

    @Delete
    void deleteCategoryInfo(long categoryId);

    @Query("SELECT * FROM CategoryInfo")
    List<CategoryInfo> getCategoryInfoList();
}
