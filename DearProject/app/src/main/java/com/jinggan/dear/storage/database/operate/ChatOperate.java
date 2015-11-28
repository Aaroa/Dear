package com.jinggan.dear.storage.database.operate;

import android.content.ContentValues;
import android.content.Context;

import com.jinggan.dear.storage.database.Entity.ChatDataBaseEntity;
import com.jinggan.dear.storage.database.sql.ChatSql;
import com.jinggan.dear.storage.database.table.ChatTable;

/**
 * @Package: com.jinggan.dear.storage.database.operate
 * @Description: 聊天表操作类
 * @author: Aaron
 * @date: 2015-11-20
 * @Time: 13:55
 * @version: V1.0
 */
public class ChatOperate extends JGDatabaseOperate{

    public ChatOperate(Context context,int uid){
        super(context);
        this.execSql(ChatSql.createTablSql(createTableName(uid)));
    }

    public static ChatOperate getInstance(Context context,int uid){
        return new ChatOperate(context,uid);
    }

    /**
     * 插入
     * @param entity
     */
    public void insert(ChatDataBaseEntity entity){
        if (db==null)
            db=databaseManage.writeDatabase();

        ContentValues values=new ContentValues();
        values.put(ChatTable.TableVersion,entity.tableVer);
        values.put(ChatTable.FROMUID,entity.getFromUid());
        values.put(ChatTable.TOUID,entity.toUid);
        values.put(ChatTable.NICK,entity.getNick());
        values.put(ChatTable.SEX,entity.getSex());
        values.put(ChatTable.MESSAGE,entity.getMessage());
        values.put(ChatTable.TYPE,entity.getType());
        values.put(ChatTable.CREATETIME,entity.getCreateTime());
        values.put(ChatTable.STATUS,entity.getStatus());
        values.put(ChatTable.MESSAGELOCALID,entity.getMessageLocalId());
        values.put(ChatTable.MESSAGESERVEID,entity.getMessageServeId());
        values.put(ChatTable.DES,entity.getDes());
        values.put(ChatTable.PROGRESS,entity.getProgress());
        values.put(ChatTable.RevInt0,entity.getRevInt0());
        values.put(ChatTable.RevInt1,entity.getRevInt1());
        values.put(ChatTable.RevInt2,entity.getRevInt2());
        values.put(ChatTable.RevInt3,entity.getRevInt3());
        values.put(ChatTable.RevStr0,entity.getRevStr0());
        values.put(ChatTable.RevStr1,entity.getRevStr1());
        values.put(ChatTable.RevStr2,entity.getRevStr2());
        values.put(ChatTable.RevStr3,entity.getRevStr3());

        db.insert(ChatSql.TABLENAME,null,values);
    }

    /**
     * 通过uid创建表名
     * @param uid
     * @return
     */
    private String createTableName(int uid){
        if (uid>0){
            return "chat_"+uid;
        }else{
            return "chat_default_tab";
        }
    }
}
