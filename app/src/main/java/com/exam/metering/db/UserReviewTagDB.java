package com.exam.metering.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.exam.metering.dao.UserReviewTagDAO;
import com.exam.metering.dto.UserReviewTag;

@Database(entities = {UserReviewTag.class}, version = 1)
public abstract class UserReviewTagDB extends RoomDatabase {
    private static UserReviewTagDB INSTANCE = null;
    public abstract UserReviewTagDAO userReviewTagDAO();

    public static UserReviewTagDB getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    UserReviewTagDB.class, "user_review_tag.db").build();

        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }
}
