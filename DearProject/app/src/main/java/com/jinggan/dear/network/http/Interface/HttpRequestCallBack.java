package com.jinggan.dear.network.http.Interface;


/**
 * Created by wuhezhi on 2015/12/6.
 */
public interface HttpRequestCallBack {
    public void onStart();

    public void onSuccess(Object obj);

    public void onFailure(String msg);

    public void onFinish();
}
