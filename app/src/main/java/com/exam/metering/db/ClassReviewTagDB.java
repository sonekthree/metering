package com.exam.metering.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.exam.metering.dao.ClassReviewTagDAO;
import com.exam.metering.dto.ClassReviewTag;

@Database(entities = {ClassReviewTag.class}, version = 1)
public abstract class ClassReviewTagDB extends RoomDatabase {
    private static ClassReviewTagDB INSTANCE = null;
    public abstract ClassReviewTagDAO classReviewTagDAO();

    public static ClassReviewTagDB getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    ClassReviewTagDB.class, "class_review_tag.db").build();

        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }
}
