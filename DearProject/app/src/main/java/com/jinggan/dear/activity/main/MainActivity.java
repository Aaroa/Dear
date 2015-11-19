package com.jinggan.dear.activity.main;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.jinggan.dear.R;
import com.jinggan.dear.common.config.IConfigConstant;
import com.jinggan.dear.utils.ILog;

/**
 * @Package: com.jinggan.dear.activity
 * @Description:
 * @author: Aaron
 * @date: 2015-11-19
 * @Time: 11:48
 * @version: V1.0
 */
public class MainActivity extends Activity {

    private final String TAG=this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
