package com.jinggan.dear.storage.database.sql;

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

    public static final String TABLENAME="chatTable";
    /**
     * 表创建
     * @return
     */
    public static String createTablSql(){
        String sql=null;
        sql="CREATE TABLE IF NOT EXISTS "+TABLENAME+" ( "+
                ChatTable.TableVersion+" INTEGER NOT NULL, "+
                ChatTable.Id+" INTEGER PRIMARY KEY, "+
                ChatTable.FROMUID+" INTEGER NOT NULL, "+
                ChatTable.TOUID+" INTEGER NOT NULL, "+
                ChatTable.NICK+" TEXT NOT NULL, "+
                ChatTable.SEX+" INTEGER NOT NULL, "+
                ChatTable.MESSAGE+" TEXT NOT NULL, "+
                ChatTable.TYPE+" INTEGER NOT NULL, "+
                ChatTable.CREATETIME+" INTEGER NOT NULL, "+
                ChatTable.STATUS+" INTEGER NOT NULL, "+
                ChatTable.MESSAGELOCALID+" INTEGER NOT NULL, "+
                ChatTable.MESSAGESERVEID+" INTEGER NOT NULL, "+
                ChatTable.DES+" INTEGER NOT NULL, "+
                ChatTable.PROGRESS+" INTEGER NOT NULL, "+
                ChatTable.RevInt0+" INTEGER NOT NULL, "+
                ChatTable.RevInt1+" INTEGER NOT NULL, "+
                ChatTable.RevInt2+" INTEGER NOT NULL, "+
                ChatTable.RevInt3+" INTEGER NOT NULL, "+
                ChatTable.RevStr0+" TEXT NOT NULL, "+
                ChatTable.RevStr1+" TEXT NOT NULL, "+
                ChatTable.RevStr2+" TEXT NOT NULL, "+
                ChatTable.RevStr3+" TEXT NOT NULL "+" ) ";

        ILog.d(TAG,"chat create table sql=="+sql);
        return sql;
    }
}