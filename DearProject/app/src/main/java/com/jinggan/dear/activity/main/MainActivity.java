package com.jinggan.dear.activity.main;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.jinggan.dear.R;
import com.jinggan.dear.activity.BaseActivity;

/**
 * @Package: com.jinggan.dear.activity
 * @Description:主界面
 * @author: Aaron
 * @date: 2015-11-19
 * @Time: 11:48
 * @version: V1.0
 */
public class MainActivity extends BaseActivity implements View.OnClickListener,ViewPager.OnPageChangeListener{

    private final String TAG=this.getClass().getSimpleName();

    public final static  int MAIN_DYNAMIC_VALUE=0;
    public final static  int MAIN_MESSAGE_VALUE=1;

    private ViewPager mViewPager;
    private TextView mDynamicTitelText,mTalkTitleText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById();
        initView();
        setTabText(MAIN_DYNAMIC_VALUE);
        goneHeadView();
    }

    private void findViewById(){
        mViewPager=(ViewPager)findViewById(R.id.main_viewPage);

        mDynamicTitelText=(TextView)findViewById(R.id.main_dynamic_tv);
        mTalkTitleText=(TextView)findViewById(R.id.main_talk_tv);
    }

    private void initView() {
        mViewPager.setAdapter(new MainViewPagerAdapter(getSupportFragmentManager()));
        mViewPager.addOnPageChangeListener(this);
    }

    @Override
    public void onClick(View v) {
    }

    private void setTabText(int position){
        switch (position){
            case MAIN_MESSAGE_VALUE:
                mDynamicTitelText.setBackgroundColor(getResources().getColor(R.color.main_title_normal));
                mTalkTitleText.setBackgroundColor(getResources().getColor(R.color.main_title_press));
                break;
            case MAIN_DYNAMIC_VALUE:
                mDynamicTitelText.setBackgroundColor(getResources().getColor(R.color.main_title_press));
                mTalkTitleText.setBackgroundColor(getResources().getColor(R.color.main_title_normal));
                break;
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override
    public void onPageSelected(int position) {
        setTabText(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return super.onKeyDown(keyCode, event);
    }
}
