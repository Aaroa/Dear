package com.jinggan.dear.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.jinggan.dear.R;
import com.jinggan.dear.common.Constants;
import com.jinggan.dear.common.event.NoticeEvent;
import com.jinggan.dear.network.netty.ClientThreadPool;
import com.jinggan.dear.network.socket.PersistConnect;
import com.jinggan.dear.utils.ActivityManage;
import com.jinggan.dear.utils.IHandlerUtils;
import com.jinggan.dear.utils.ILog;
import com.jinggan.dear.utils.IToastUtils;
import com.jinggan.dear.widget.HeadView;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import de.greenrobot.event.EventBus;


/**
 * @Package: com.jinggan.dear.activity
 * @Description: Activity基类
 * @author: Aaron
 * @date: 2015-11-19
 * @Time: 11:55
 * @version: V1.0
 */
public abstract class BaseActivity extends FragmentActivity implements HeadView.HeadViewListener{
    private final String TAG="BaseActivity";

    private HeadView mHeadView;

    /**
     * 布局实例器
     */
    private LayoutInflater mLayoutInflater;
    /**
     * 核心内容
     */
    private FrameLayout mLinearLayoutContent;

    protected InputMethodManager mInput;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_base);
        mInput = (InputMethodManager) getApplication().getSystemService(Context.INPUT_METHOD_SERVICE);
        EventBus.getDefault().register(this);

        findViewById();
        setLeftOnClick();
        setRightOnClick();

        ActivityManage.getInstance().addActivity(this);
//        PersistConnect.openPersist(Constants.IP,Constants.PORT);

    }

    private void findViewById(){
        mHeadView=(HeadView)findViewById(R.id.base_activity_title);
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

    public  void onBackListener(){
        this.finish();
    }

    public void onRightListener(){}

    /**
     * 使用HANDLER 发送消息
     * @param handler
     * @param what
     * @param arg1
     * @param obj
     */
    public void sendHandlerMessage(Handler handler, int what, int arg1, Object obj) {
        IHandlerUtils.sendHandlerMessage(handler, what, arg1, obj);
    }

    /**
     * 使用HANDLER 发送消息
     * @param handler
     * @param what
     * @param arg1
     */
    public void sendHandlerMessage(Handler handler, int what, int arg1) {
        IHandlerUtils.sendHandlerMessage(handler,what,arg1);
    }

    /**
     * 使用HANDLER 发送消息
     * @param handler
     * @param what
     * @param arg1
     */
    public void sendHandlerMessage(Handler handler, int what, int arg1, int arg2) {
        IHandlerUtils.sendHandlerMessage(handler,what,arg1,arg2);
    }

    /**
     * 使用HANDLER 发送消息
     * @param handler
     * @param what
     * @param arg1
     */
    public void sendHandlerMessage(Handler handler, int what, int arg1, int arg2, Object obj) {
        IHandlerUtils.sendHandlerMessage(handler,what,arg1,arg2,obj);
    }

    public void showToast(int resid){
        IToastUtils.showToast(this, resid);
    }

    public void showToast(String msg){
        IToastUtils.showTost(this, msg);
    }

    public void onEvent(NoticeEvent event){

    }

    /**
     * 显示软键盘
     *
     * @param edittext
     */
    public void showSoftInput(final EditText edittext) {
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                edittext.requestFocus();
                if (mInput != null)
                    mInput.showSoftInput(edittext, 0);
            }
        }, 700);
    }

    /**
     * 收起软键盘
     *
     * @param et
     */
    public void hideSoftInput(EditText et) {
        if (null != mInput && mInput.isActive())
            mInput.hideSoftInputFromWindow(et.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
            this.finish();
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void setLeftOnClick(){
        mHeadView.setLeftBackOnClick(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackListener();
            }
        });
    }

    @Override
    public void setRightOnClick() {
        mHeadView.setRightOnClick(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                onRightListener();
            }
        });
    }

    @Override
    public void setHeadTitle(int resid) {
        mHeadView.setTitleText(resid);
    }

    @Override
    public void setHeadTitle(String str) {
        mHeadView.setTitleText(str);
    }

    @Override
    public void setRightText(int resid) {
        mHeadView.setRightText(resid);
    }

    @Override
    public void setRightText(String str) {
        mHeadView.setRightText(str);
    }

    @Override
    public void setRightImage(int resid) {
        mHeadView.setRightImage(resid);
    }

    @Override
    public void setRightImageVisibility(int visibility) {
        mHeadView.setRightImageVisility(visibility);
    }

    @Override
    public void setRightTextVisibility(int visibility) {
        mHeadView.setRightTextVisility(visibility);
    }

    @Override
    public void setHeadViewVisibility(int visibility) {
        mHeadView.setVisibility(visibility);
    }

    public void goneHeadView(){
        setHeadViewVisibility(View.GONE);
    }
}
