package com.jinggan.dear.storage.database.table;

/**
 * @Package: com.jinggan.dear.storage.database.table
 * @Description: 聊天表
 * @author: Aaron
 * @date: 2015-11-19
 * @Time: 14:02
 * @version: V1.0
 */
public class ChatTable extends BaseTable {

    public static final String FROMUID="FromUid";//对方id
    public static final String TOUID="ToUid";//发给对方id
    public static final String NICK="Nick";//昵称
    public static final String SEX="Sex";//性别
    public static final String MESSAGE="Message";//消息内容
    public static final String TYPE="Type";//消息类型
    public static final String CREATETIME="CreateTime";//消息创建时间
    public static final String STATUS="Status";//发送状态
    public static final String MESSAGELOCALID="MesLocalId";//消息本地id
    public static final String MESSAGESERVEID="MesServeId";//消息服务器id
    public static final String DES="Des";//消息来自
    public static final String PROGRESS="Progress";//进度

}
