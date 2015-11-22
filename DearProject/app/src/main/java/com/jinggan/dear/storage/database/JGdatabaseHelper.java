package com.jinggan.dear.storage.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.jinggan.dear.common.config.IConfigConstant;

/**
 * @Package: com.jinggan.dear.storage.database
 * @Description: 数据库辅助类
 * @author: Aaron
 * @date: 2015-11-19
 * @Time: 11:57
 * @version: V1.0
 */
public class JGdatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="jgDear.db";

    public JGDatabaseManage databaseManage;

    public JGdatabaseHelper(Context context){
        super(context,DATABASE_NAME,null, IConfigConstant.DATABASE_VERSION);
    }

    public JGdatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        if (databaseManage!=null){
            databaseManage.creataAllTable(db);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
