package com.jinggan.dear.activity;

import android.app.Activity;
import android.os.Bundle;

import com.jinggan.dear.common.Constants;
import com.jinggan.dear.network.socket.PersistConnect;
import com.jinggan.dear.utils.ActivityManage;


/**
 * @Package: com.jinggan.dear.activity
 * @Description: Activity基类
 * @author: Aaron
 * @date: 2015-11-19
 * @Time: 11:55
 * @version: V1.0
 */
public class BaseActivity extends Activity {
    private final String TAG="BaseActivity";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityManage.getInstance().addActivity(this);

        PersistConnect.openPersist(Constants.IP,Constants.PORT);
    }
}
