package com.jinggan.dear.activity;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.jinggan.dear.common.event.NoticeEvent;
import com.jinggan.dear.utils.IHandlerUtils;
import com.jinggan.dear.utils.IToastUtils;

/**
 * Created by wuhezhi on 2015/12/7.
 */
public class BaseFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

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
        IToastUtils.showToast(getActivity(), resid);
    }

    public void showToast(String msg){
        IToastUtils.showTost(getActivity(), msg);
    }
}
