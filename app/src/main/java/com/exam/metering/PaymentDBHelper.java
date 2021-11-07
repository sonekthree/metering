package com.exam.metering;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class PaymentDBHelper extends SQLiteOpenHelper {
    final static String DB_NAME = "payment.db";
    public final static String TABLE_NAME = "payment_table";
    public final static String COL_PAYMENTID = "paymentId";
    public final static String COL_USERID = "userId";
    public final static String COL_CARDNUM = "cardNum";
    public final static String COL_CARDNAME = "cardName";
    public final static String COL_CARDDATE = "cardDate";

    public PaymentDBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE " + TABLE_NAME
                + " (" + COL_PAYMENTID + " integer primary key autoincrement, "
                + COL_USERID + " TEXT, " + COL_CARDNUM + " TEXT, " + COL_CARDNAME
                + COL_CARDDATE + " TEXT )";
        db.execSQL(sql);

        //샘플데이터
        db.execSQL("INSERT INTO " + PaymentDBHelper.TABLE_NAME + " VALUES (NULL, 'kimgukmun', '123456789', '국민카드', '04/23');");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE " + TABLE_NAME);
        onCreate(db);
    }
}
