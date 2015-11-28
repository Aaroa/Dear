package com.jinggan.dear.storage.database.operate;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.jinggan.dear.storage.database.JGDatabaseManage;

/**
 * @Package: com.jinggan.dear.storage.database.operate
 * @Description:Database 操作类
 * @author: Aaron
 * @date: 2015-11-20
 * @Time: 14:03
 * @version: V1.0
 */
public class JGDatabaseOperate {
    protected JGDatabaseManage databaseManage;

    protected SQLiteDatabase db;

    public JGDatabaseOperate(Context context){
        databaseManage=JGDatabaseManage.getDatabaseManage(context);
        db=databaseManage.writeDatabase();
    }

    /**
     * 检测数据库
     * @return
     */
    public synchronized boolean checkDbIsOpen(){
        if (db!=null&&db.isOpen()){
            return true;
        }
        return false;
    }

    /**
     * 执行SQL语句
     * @param sql
     */
    public void execSql(String sql){
        try {
            if (!checkDbIsOpen()){
                db=databaseManage.writeDatabase();
            }
            db.execSQL(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 执行带参数SQL语句
     * @param sql
     * @param args
     */
    public void execSql(String sql,Object[] args){
        if (!checkDbIsOpen()){
            db=databaseManage.writeDatabase();
        }
        db.execSQL(sql,args);
    }
}
