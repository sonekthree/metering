package com.exam.metering.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.exam.metering.dao.ClassInfoDAO;
import com.exam.metering.dto.ClassInfo;

@Database(entities = {ClassInfo.class}, version = 1,exportSchema = false)
public abstract class ClassInfoDB extends RoomDatabase {
    private static ClassInfoDB INSTANCE = null;
    public abstract ClassInfoDAO classInfoDAO();

    public static ClassInfoDB getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    ClassInfoDB.class, "classinfo.db").build();

        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }
}
