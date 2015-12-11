package com.jinggan.dear.utils;

import android.app.Activity;
import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

/**
 * @Package: com.jinggan.dear.utils
 * @Description:
 * @author: Aaron
 * @date: 2015-12-11
 * @Time: 13:10
 * @version: V1.0
 */
public class IToastUtils {

    private static final String TAG="IToastUtils";

    public static void showToast(Context context,int resId){
        if (context==null||((Activity)context).isFinishing()){
            return;
        }
        showTost(context,context.getString(resId));
    }

    public static void showTost(Context context, String msg) {
        Toast mToast=null;
        try {
            if (context == null) {
                return;
            }
            if (mToast == null) {
                synchronized (IToastUtils.class) {
                    if (mToast == null) {
                        mToast = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
                    } else {
                        mToast.setText(msg);
                        mToast.setDuration(Toast.LENGTH_SHORT);
                    }
                }
            } else {
                mToast.setText(msg);
                mToast.setDuration(Toast.LENGTH_SHORT);
            }
            mToast.setGravity(Gravity.CENTER, 0, 0);
            mToast.show();
        } catch (Exception e) {
            e.printStackTrace();
            ILog.e(TAG,e.getMessage());
        }
    }

}
