package com.exam.metering;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ApplicationDBHelper extends SQLiteOpenHelper  {
    final static String DB_NAME = "application.db";
    public final static String TABLE_NAME = "application_table";
    public final static String COL_APPLIID = "appliId";
    public final static String COL_USERID = "userId";
    public final static String COL_CLASSID = "classId";
    public final static String COL_STARTDATE = "startDate";
    public final static String COL_ENDDATE = "endDate";
    public final static String COL_PAYMENTID = "paymentId";
    public final static String COL_PAYMENTCYCLE = "paymentCycle";

    public ApplicationDBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE " + TABLE_NAME
                + " (" + COL_APPLIID + " integer primary key autoincrement, "
                + COL_USERID + " TEXT, " + COL_CLASSID + " TEXT, " + COL_STARTDATE + " TEXT, " + COL_ENDDATE + " TEXT, " +  COL_PAYMENTID + " TEXT, "
                + COL_PAYMENTCYCLE + " TEXT )";
        db.execSQL(sql);

        //샘플데이터
        db.execSQL("INSERT INTO " + ApplicationDBHelper.TABLE_NAME + " VALUES (NULL, 'kimgukmun', 1, '21/11/01', '22/02/07', 1, '1s');");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE " + TABLE_NAME);
        onCreate(db);
    }
}
