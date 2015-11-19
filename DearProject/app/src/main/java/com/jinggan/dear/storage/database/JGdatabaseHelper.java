package com.jinggan.dear.storage.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * @Package: com.jinggan.dear.storage.database
 * @Description: 数据库辅助类
 * @author: Aaron
 * @date: 2015-11-19
 * @Time: 11:57
 * @version: V1.0
 */
public class JGdatabaseHelper extends SQLiteOpenHelper {



    public JGdatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
