package com.jinggan.dear.storage.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.jinggan.dear.common.config.IConfig;
import com.jinggan.dear.common.config.IConfigConstant;

/**
 * @Package: com.jinggan.dear.storage.database
 * @Description: 数据库管理
 * @author: Aaron
 * @date: 2015-11-20
 * @Time: 11:03
 * @version: V1.0
 */
public class JGDatabaseManage {
    private static JGdatabaseHelper helper;

    private static JGDatabaseManage databaseManage=null;

    /**
     * 构造器
     * @param context
     */
    public JGDatabaseManage(Context context){
        if (helper==null){
            helper=new JGdatabaseHelper(context,JGdatabaseHelper.DATABASE_NAME,null, IConfigConstant.DATABASE_VERSION);
        }
    }

    /**
     * 获取数据库管理类
     * @param context
     * @return
     */
    public static JGDatabaseManage getDatabaseManage(Context context){
        if (databaseManage==null){
            databaseManage=new JGDatabaseManage(context);
        }
        return databaseManage;
    }

    /**
     * 表创建
     * @param db
     */
    public void creataAllTable(SQLiteDatabase db){
        if (db!=null&&db.isOpen()){

        }
    }

    /**
     * 获取写数据库权限
     */
    public  SQLiteDatabase writeDatabase(){
        SQLiteDatabase database=null;
        if (helper!=null){
           database= helper.getWritableDatabase();
        }
        return database;
    }

    /**
     * 获取读数据库权限
     */
    public  SQLiteDatabase readDatabase(){
        SQLiteDatabase database=null;
        if (helper!=null){
            database=helper.getReadableDatabase();
        }
        return database;
    }
    /**
     * 关闭数据库
     */
    public static void closeDatabase(){
        if (helper!=null){
            helper.close();
            helper=null;
        }
        if (databaseManage!=null){
            databaseManage=null;
        }
    }
}
