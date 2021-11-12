package com.exam.metering.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.exam.metering.dao.UserInfoDAO;
import com.exam.metering.dto.UserInfo;

@Database(entities = {UserInfo.class}, version = 1,exportSchema = false)
public abstract class UserInfoDB extends RoomDatabase {
    private static UserInfoDB INSTANCE = null;
    public abstract UserInfoDAO userInfoDAO();

    public static UserInfoDB getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    UserInfoDB.class, "userinfo.db").build();

        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }
}
