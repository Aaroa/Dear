package com.jinggan.dear.common.config;

/**
 * @Package: com.jinggan.dear.common
 * @Description: 配制文件常类
 * @author: Aaron
 * @date: 2015-11-19
 * @Time: 14:46
 * @version: V1.0
 */
public class IConfigConstant {
    /*数据库版本与表版本号*/
    //数据库版本号
    public static final int DATABASE_VERSION= Integer.parseInt(IConfig.getConfig(IConfigTagValue.DATABASE_VERSION));
    //聊天消息表版本号
    public static final int CHAT_DATABASE_VERSION=Integer.parseInt(IConfig.getConfig(IConfigTagValue.CHAT_DATABASE_VERSION));
    //日志输入开关
    public static final boolean LOG_SWITCH=Boolean.parseBoolean(IConfig.getConfig(IConfigTagValue.LOG_SWITCH));
}
