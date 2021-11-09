package com.exam.metering.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.exam.metering.dao.ApplicationDAO;
import com.exam.metering.dto.Application;

@Database(entities = {Application.class}, version = 1)
public abstract class ApplicationDB extends RoomDatabase {
    private static ApplicationDB INSTANCE = null;
    public abstract ApplicationDAO applicationDAO();

    public static ApplicationDB getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    ApplicationDB.class, "application.db").build();

        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }
}
