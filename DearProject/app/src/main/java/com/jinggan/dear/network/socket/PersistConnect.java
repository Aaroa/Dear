package com.jinggan.dear.network.socket;

import com.jinggan.dear.utils.ILog;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;

/**
 * 长链接处理类[基于netty5.0版本]
 * Created by wuhezhi on 2015/12/6.
 */
public class PersistConnect {
    private static  final String TAG="PersistConnect";

    public static void openPersist(String host,int port){
        ILog.d(TAG,"host="+host+", port=="+port);
//        Bootstrap bootstrap=new Bootstrap();
//
//        ChannelFuture future=bootstrap.connect(host,port);
    }
}
