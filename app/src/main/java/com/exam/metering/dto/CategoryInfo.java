package com.exam.metering.dto;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class CategoryInfo implements Serializable {
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "category_id") long categoryId;
    @ColumnInfo(name = "category_name") String categoryName;

    public CategoryInfo() { }

    public CategoryInfo(long categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public long getCategoryId() { return categoryId; }

    public String getCategoryName() { return categoryName; }
}
