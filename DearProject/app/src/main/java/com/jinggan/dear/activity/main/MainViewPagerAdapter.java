package com.jinggan.dear.activity.main;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * 主界面适配器
 * Created by wuhezhi on 2015/12/9.
 */
public class MainViewPagerAdapter extends FragmentPagerAdapter {

    public MainViewPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        switch (position){
            case MainActivity.MAIN_DYNAMIC_VALUE:
                fragment=new DynamicFragment();
                break;
            case MainActivity.MAIN_MESSAGE_VALUE:
                fragment=new MessageFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
