package com.exam.metering;

import java.io.Serializable;

public class CategoryDTO implements Serializable {
    String categoryId;
    String categoryName;

    public CategoryDTO(String categoryName) {
        this.categoryName = categoryName;
    }

    public CategoryDTO(String categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public String getCategoryId() { return categoryId; }
    public String getCategoryName() { return categoryName; }
}
