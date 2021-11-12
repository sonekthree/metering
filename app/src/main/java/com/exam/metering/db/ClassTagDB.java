package com.exam.metering.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.exam.metering.dao.ClassTagDAO;
import com.exam.metering.dto.ClassTag;

@Database(entities = {ClassTag.class}, version = 1,exportSchema = false)
public abstract class ClassTagDB extends RoomDatabase {
    private static ClassTagDB INSTANCE = null;
    public abstract ClassTagDAO classTagDAO();

    public static ClassTagDB getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    ClassTagDB.class, "class_tag.db").build();

        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }
}
