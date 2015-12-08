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
    //当前环境
    public static final int CURRENT_ENV=Integer.parseInt(IConfig.getConfig(IConfigTagValue.CURRENT_ENV));

    /*=========================================数据库版本与表版本号======================================*/
    //数据库版本号
    public static final int DATABASE_VERSION= Integer.parseInt(IConfig.getConfig(IConfigTagValue.DATABASE_VERSION));
    //聊天消息表版本号
    public static final String  CHAT_DATABASE_VERSION=IConfig.getConfig(IConfigTagValue.CHAT_DATABASE_VERSION);
    /*=========================================数据库版本与表版本号======================================*/

    //日志输入开关
    public static final boolean LOG_SWITCH=Boolean.parseBoolean(IConfig.getConfig(IConfigTagValue.LOG_SWITCH));
    //测试环境IP
    public static final String IP_TEST=IConfig.getConfig(IConfigTagValue.IP_TEST);
    //测试环境端口
    public static final int PORT_TEST=Integer.parseInt(IConfig.getConfig(IConfigTagValue.PORT_TEST));
    //正式环境IP
    public static final String IP=IConfig.getConfig(IConfigTagValue.IP);
    //正式环境端口
    public static final int PORT=Integer.parseInt(IConfig.getConfig(IConfigTagValue.PORT));

}
