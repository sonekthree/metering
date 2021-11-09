package com.exam.metering.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.exam.metering.dao.PaymentDAO;
import com.exam.metering.dto.Payment;

@Database(entities = {Payment.class}, version = 1)
public abstract class PaymentDB extends RoomDatabase {
    private static PaymentDB INSTANCE = null;
    public abstract PaymentDAO paymentDAO();

    public static PaymentDB getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    PaymentDB.class, "payment.db").build();

        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }
}
