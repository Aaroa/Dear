package com.jinggan.dear.activity;

import android.app.Application;

import com.jinggan.dear.common.config.IConfig;

/**
 * @Package: PACKAGE_NAME
 * @Description:
 * @author: Aaron
 * @date: 2015-11-19
 * @Time: 11:52
 * @version: V1.0
 */
public class JGApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化配制文件
        IConfig.init(getApplicationContext());
    }
}
