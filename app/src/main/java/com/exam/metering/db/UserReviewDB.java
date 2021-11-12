package com.exam.metering.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.exam.metering.dao.UserReviewDAO;
import com.exam.metering.dto.UserReview;

@Database(entities = {UserReview.class}, version = 1,exportSchema = false)
public abstract class UserReviewDB extends RoomDatabase {
    private static UserReviewDB INSTANCE = null;
    public abstract UserReviewDAO userReviewDAO();

    public static UserReviewDB getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    UserReviewDB.class, "user_review.db").build();

        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }
}
