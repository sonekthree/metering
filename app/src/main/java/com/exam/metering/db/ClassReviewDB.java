package com.exam.metering.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.exam.metering.dao.ClassReviewDAO;
import com.exam.metering.dto.ClassReview;

@Database(entities = {ClassReview.class}, version = 1)
public abstract class ClassReviewDB extends RoomDatabase {
    private static ClassReviewDB INSTANCE = null;
    public abstract ClassReviewDAO classReviewDAO();

    public static ClassReviewDB getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    ClassReviewDB.class, "class_review.db").build();

        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }
}
