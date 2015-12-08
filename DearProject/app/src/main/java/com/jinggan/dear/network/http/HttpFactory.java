package com.jinggan.dear.network.http;

import android.app.Activity;
import android.app.Dialog;

import com.jinggan.dear.common.dialog.IDialogFactory;
import com.jinggan.dear.network.http.Interface.HttpRequestCallBack;
import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest;

/**
 * @Package: com.jinggan.dear.network.http
 * @Description: Http请求工厂类
 * @author: Aaron
 * @date: 2015-11-19
 * @Time: 11:55
 * @version: V1.0
 */
public class HttpFactory {
  private static   HttpUtils httpUtils;
    private static Dialog dialog;

    private static HttpUtils getInstance(){
        if (httpUtils==null){
            httpUtils=new HttpUtils();
            httpUtils.configDefaultHttpCacheExpiry(0);
        }
        return  httpUtils;
    }

    /**
     * Http GET 请求
     * @param activity
     * @param url
     * @param isShowDialog
     * @param msg
     * @param callBack
     */
    public static void HttpGet(final Activity activity, String url, final boolean isShowDialog, final String msg, final HttpRequestCallBack callBack){
        httpUtils.send(HttpRequest.HttpMethod.GET, url, new RequestCallBack<Object>() {

            @Override
            public void onStart() {
                callBack.onStart();
                if (isShowDialog){
                  dialog=  IDialogFactory.createLoadingDialog(activity,msg);
                }
            }

            @Override
            public void onSuccess(ResponseInfo<Object> responseInfo) {
                callBack.onSuccess(responseInfo.result);
                callBack.onFinish();
            }

            @Override
            public void onFailure(HttpException e, String s) {
                callBack.onFailure(s);
                callBack.onFinish();
            }

            @Override
            public void onCancelled() {
                IDialogFactory.dimissDialog(dialog);
            }
        });
    }

}
