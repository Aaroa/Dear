package com.jinggan.dear.utils;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Activity管理类
 * Created by wuhezhi on 2015/12/6.
 */
public class ActivityManage {

    private List<Activity> activities=new ArrayList<Activity>();

    private static  ActivityManage mActivityManage;

    public static  ActivityManage getInstance(){
        if (mActivityManage==null){
            mActivityManage=new ActivityManage();
        }
        return mActivityManage;
    }

    public void addActivity(Activity activity){
        if (activities==null)
            return;

        activities.add(activity);
    }

    public void removeActivity(Activity activity){
        if (activities==null)
            return;

        activities.remove(activity);
    }

    public void exit(){
        if (activities==null)
            return;

        for (Activity activity: activities) {
            if (activity!=null)
                activity.finish();
        }
    }

    public List<Activity> getActivities(){
        return activities;
    }
}
