package com.exam.metering.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.exam.metering.dao.CategoryInfoDAO;
import com.exam.metering.dto.CategoryInfo;

@Database(entities = {CategoryInfo.class}, version = 1)
public abstract class CategoryInfoDB extends RoomDatabase {
    private static CategoryInfoDB INSTANCE = null;
    public abstract CategoryInfoDAO categoryInfoDAO();

    public static CategoryInfoDB getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    CategoryInfoDB.class, "categoryinfo.db").build();

        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }
}
