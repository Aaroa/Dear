package com.jinggan.dear.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.jinggan.dear.R;
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
public abstract class BaseActivity extends FragmentActivity {
    private final String TAG="BaseActivity";

    /**
     * 布局实例器
     */
    private LayoutInflater mLayoutInflater;
    /**
     * 核心内容
     */
    private FrameLayout mLinearLayoutContent;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_base);

        findViewById();

        ActivityManage.getInstance().addActivity(this);
        PersistConnect.openPersist(Constants.IP,Constants.PORT);
    }

    private void findViewById(){
        mLayoutInflater = LayoutInflater.from(this);
        mLinearLayoutContent=(FrameLayout)findViewById(R.id.base_activity_container);
    };

    @Override
    public void setContentView(int layoutResID) {
        View view = mLayoutInflater.inflate(layoutResID, null);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        mLinearLayoutContent.removeAllViews();
        mLinearLayoutContent.addView(view, lp);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        mLinearLayoutContent.removeAllViews();
        mLinearLayoutContent.addView(view, params);
    }

    @Override
    public void setContentView(View view) {
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        mLinearLayoutContent.removeAllViews();
        mLinearLayoutContent.addView(view, lp);
    }
}
