package com.exam.metering;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ClassDBHelper extends SQLiteOpenHelper {
    final static String DB_NAME = "class.db";
    public final static String TABLE_NAME = "class_table";
    public final static String COL_CLASSID = "classId";
    public final static String COL_CATEGORYID = "categoryId";
    public final static String COL_USERID = "userId";
    public final static String COL_CLASSNAME = "className";
    public final static String COL_ISONLINE = "isOnline";
    public final static String COL_CLASSMNUM = "classMNum";
    public final static String COL_CLASSIMG = "clasImg";
    public final static String COL_CLASSPERHOUR = "classPerHour";
    public final static String COL_CLASSWEEK = "classWeek";
    public final static String COL_CLASSPERCOUNT = "classPerCount";
    public final static String COL_CLASSPRICE = "classPrice";
    public final static String COL_CLASSSCHEDULE = "ClassSchedule";

    public ClassDBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE " + TABLE_NAME
                + " (" + COL_CLASSID + " integer primary key autoincrement, "
                + COL_CATEGORYID + " TEXT, " + COL_USERID + " TEXT, " + COL_CLASSNAME + " TEXT, " + COL_ISONLINE + " TEXT, " +  COL_CLASSMNUM + " TEXT, "
                + COL_CLASSIMG + " TEXT, " + COL_CLASSPERHOUR + " TEXT, " + COL_CLASSWEEK + " TEXT, " + COL_CLASSPERCOUNT + " TEXT, " + COL_CLASSPRICE + " TEXT, "
                + COL_CLASSSCHEDULE + " TEXT )";
        db.execSQL(sql);

        //샘플데이터
        db.execSQL("INSERT INTO " + ClassDBHelper.TABLE_NAME + " VALUES (NULL, 5, 'kimcumgong', 'C언어 기본 문법', 'TRUE', '3', NULL, '1', '1', '12000', '스케쥴 1 2 3 4 5');");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE " + TABLE_NAME);
        onCreate(db);
    }
}
