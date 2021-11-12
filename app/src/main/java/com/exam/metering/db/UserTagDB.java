package com.exam.metering.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.exam.metering.dao.UserTagDAO;
import com.exam.metering.dto.UserTag;

@Database(entities = {UserTag.class}, version = 1,exportSchema = false)
public abstract class UserTagDB extends RoomDatabase {
    private static UserTagDB INSTANCE = null;
    public abstract UserTagDAO userTagDAO();

    public static UserTagDB getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    UserTagDB.class, "user_tag.db").build();

        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }
}
