package com.jinggan.dear.storage.database.sql;

import android.text.TextUtils;

import com.jinggan.dear.storage.database.table.ChatTable;
import com.jinggan.dear.utils.ILog;

/**
 * @Package: com.jinggan.dear.storage.database.sql
 * @Description:聊表信息表SQL语句
 * @author: Aaron
 * @date: 2015-11-20
 * @Time: 10:59
 * @version: V1.0
 */
public class ChatSql {

    private final static String TAG="ChatSql";

    public static  String TABLENAME;
    /**
     * 表创建
     * @return
     */
    public static String createTablSql(String tableName){
        String sql=null;
        if (TextUtils.isEmpty(tableName)){
            TABLENAME="chatTable";
        }else {
            TABLENAME=tableName;
        }
        sql="CREATE TABLE IF NOT EXISTS "+TABLENAME+" ( "+
                ChatTable.TableVersion+" INTEGER NOT NULL, "+
                ChatTable.Id+" INTEGER PRIMARY KEY, "+
                ChatTable.FROMUID+" INTEGER , "+
                ChatTable.TOUID+" INTEGER , "+
                ChatTable.NICK+" TEXT NOT NULL, "+
                ChatTable.SEX+" INTEGER NOT NULL, "+
                ChatTable.MESSAGE+" TEXT NOT NULL, "+
                ChatTable.TYPE+" INTEGER NOT NULL, "+
                ChatTable.CREATETIME+" INTEGER NOT NULL, "+
                ChatTable.STATUS+" INTEGER NOT NULL, "+
                ChatTable.MESSAGELOCALID+" INTEGER , "+
                ChatTable.MESSAGESERVEID+" INTEGER , "+
                ChatTable.DES+" INTEGER NOT NULL, "+
                ChatTable.PROGRESS+" INTEGER , "+
                ChatTable.RevInt0+" INTEGER , "+
                ChatTable.RevInt1+" INTEGER , "+
                ChatTable.RevInt2+" INTEGER , "+
                ChatTable.RevInt3+" INTEGER , "+
                ChatTable.RevStr0+" TEXT , "+
                ChatTable.RevStr1+" TEXT , "+
                ChatTable.RevStr2+" TEXT , "+
                ChatTable.RevStr3+" TEXT  "+" ) ";

        ILog.d(TAG,"chat create table sql=="+sql);
        return sql;
    }

    /**
     * 获取Chat表名
     * @return
     */
    public  static String getChatTableName(){
        return TABLENAME;
    }
}