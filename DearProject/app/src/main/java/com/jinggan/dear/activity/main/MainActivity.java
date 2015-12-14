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

    public final int MAIN_MESSAGE_VALUE=0;
    public final int MAIN_DYNAMIC_VALUE=1;
    public final int MAIN_FRIEND_VALUE=2;
    public final int MAIN_MINE_VALUE=3;

    private ViewPager mViewPager;
    private RelativeLayout mMessageLayout, mDynamicLayout, mFriendLayout, mMineLayout;
    private TextView titleTv;

    private TextView mMsgTv,mDynamicTv,mFriendTv,mMineTv;
    private ImageView mMsgIv,mDynamicIv,mFriendIv,mMineIv;
    private TextView mMsgCountTv,mDynamicCountTv,mFriendCountTv,mMineCountTv;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById();
        initView();
        setListener();
        setMainTitle(MAIN_MESSAGE_VALUE);
        setTabText(MAIN_MESSAGE_VALUE);
        goneHeadView();
    }

    private void findViewById(){
        mViewPager=(ViewPager)findViewById(R.id.main_viewPage);
        mMessageLayout=(RelativeLayout)findViewById(R.id.main_message_layout);
        mDynamicLayout =(RelativeLayout)findViewById(R.id.main_dynamic_layout);
        mFriendLayout =(RelativeLayout)findViewById(R.id.main_friend_layout);
        mMineLayout =(RelativeLayout)findViewById(R.id.main_me_layout);
        titleTv=(TextView)findViewById(R.id.main_title_tv);

        mMsgTv=(TextView) findViewById(R.id.main_msg).findViewById(R.id.main_tab_text);
        mDynamicTv=(TextView)findViewById(R.id.main_dynamic).findViewById(R.id.main_tab_text);
        mFriendTv=(TextView)findViewById(R.id.main_friend).findViewById(R.id.main_tab_text);
        mMineTv=(TextView)findViewById(R.id.main_mine).findViewById(R.id.main_tab_text);

        mMsgIv=(ImageView)findViewById(R.id.main_msg).findViewById(R.id.main_tab_icon);
        mDynamicIv=(ImageView)findViewById(R.id.main_dynamic).findViewById(R.id.main_tab_icon);
        mFriendIv=(ImageView)findViewById(R.id.main_friend).findViewById(R.id.main_tab_icon);
        mMineIv=(ImageView)findViewById(R.id.main_mine).findViewById(R.id.main_tab_icon);

        mMsgCountTv=(TextView)findViewById(R.id.main_msg).findViewById(R.id.main_tab_msg_count_tv);
        mDynamicCountTv=(TextView)findViewById(R.id.main_dynamic).findViewById(R.id.main_tab_msg_count_tv);
        mFriendCountTv=(TextView)findViewById(R.id.main_friend).findViewById(R.id.main_tab_msg_count_tv);
        mMineCountTv=(TextView)findViewById(R.id.main_mine).findViewById(R.id.main_tab_msg_count_tv);

        mMsgTv.setText(R.string.main_tab_message);
        mDynamicTv.setText(R.string.main_tab_dynamic);
        mFriendTv.setText(R.string.main_tab_friend);
        mMineTv.setText(R.string.main_tab_mine);
    }

    private void initView(){
        mViewPager.setAdapter(new MainViewPagerAdapter(getSupportFragmentManager()));
        mViewPager.addOnPageChangeListener(this);
    }

    private void setListener(){
        mMessageLayout.setOnClickListener(this);
        mDynamicLayout.setOnClickListener(this);
        mFriendLayout.setOnClickListener(this);
        mMineLayout.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.main_message_layout:
                mViewPager.setCurrentItem(MAIN_MESSAGE_VALUE);
                setMainTitle(MAIN_MESSAGE_VALUE);
                break;
            case R.id.main_dynamic_layout:
                mViewPager.setCurrentItem(MAIN_DYNAMIC_VALUE);
                setMainTitle(MAIN_DYNAMIC_VALUE);
                break;
            case R.id.main_friend_layout:
                mViewPager.setCurrentItem(MAIN_FRIEND_VALUE);
                setMainTitle(MAIN_FRIEND_VALUE);
                break;
            case R.id.main_me_layout:
                mViewPager.setCurrentItem(MAIN_MINE_VALUE);
                setMainTitle(MAIN_MINE_VALUE);
                break;
        }
    }

    private void setMainTitle(int currentPager){
        switch (currentPager){
            case MAIN_MESSAGE_VALUE:
                titleTv.setText(R.string.main_tab_message);
                break;
            case MAIN_DYNAMIC_VALUE:
                titleTv.setText(R.string.main_tab_dynamic);
                break;
            case MAIN_FRIEND_VALUE:
                titleTv.setText(R.string.main_tab_friend);
                break;
            case MAIN_MINE_VALUE:
                titleTv.setText(R.string.main_tab_mine);
                break;
        }
    }

    private void setTabText(int position){
        switch (position){
            case MAIN_MESSAGE_VALUE:
//                mMsgTv.setBackgroundColor(getResources().getColor(R.color.main_tab_press_color));
//                mDynamicTv.setBackgroundColor(getResources().getColor(R.color.main_tab_normal_color));
//                mFriendTv.setBackgroundColor(getResources().getColor(R.color.main_tab_normal_color));
//                mMineTv.setBackgroundColor(getResources().getColor(R.color.main_tab_normal_color));
                break;
            case MAIN_DYNAMIC_VALUE:
//                mMsgTv.setBackgroundColor(getResources().getColor(R.color.main_tab_normal_color));
//                mDynamicTv.setBackgroundColor(getResources().getColor(R.color.main_tab_press_color));
//                mFriendTv.setBackgroundColor(getResources().getColor(R.color.main_tab_normal_color));
//                mMineTv.setBackgroundColor(getResources().getColor(R.color.main_tab_normal_color));
                break;
            case MAIN_FRIEND_VALUE:
//                mMsgTv.setBackgroundColor(getResources().getColor(R.color.main_tab_normal_color));
//                mDynamicTv.setBackgroundColor(getResources().getColor(R.color.main_tab_normal_color));
//                mFriendTv.setBackgroundColor(getResources().getColor(R.color.main_tab_press_color));
//                mMineTv.setBackgroundColor(getResources().getColor(R.color.main_tab_normal_color));
                break;
            case MAIN_MINE_VALUE:
//                mMsgTv.setBackgroundColor(getResources().getColor(R.color.main_tab_normal_color));
//                mDynamicTv.setBackgroundColor(getResources().getColor(R.color.main_tab_normal_color));
//                mFriendTv.setBackgroundColor(getResources().getColor(R.color.main_tab_normal_color));
//                mMineTv.setBackgroundColor(getResources().getColor(R.color.main_tab_press_color));
                break;
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        setMainTitle(position);
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
