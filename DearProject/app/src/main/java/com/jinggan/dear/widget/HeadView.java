package com.jinggan.dear.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jinggan.dear.R;

/**
 * 标题栏
 * Created by wuhezhi on 2015/12/11.
 */
public class HeadView extends LinearLayout {

    private LinearLayout mBackLayout,mRightLayout;
    private TextView mTitleTv,mRightTv;
    private ImageView mRightIv;

    public HeadView(Context context) {
        super(context);
        init();
    }

    public HeadView(Context context, AttributeSet attri) {
        super(context, attri);
        init();
    }

    public void init(){
        View view = LayoutInflater.from(getContext()).inflate(
                R.layout.title_base_layout, null);
        addView(view);
        mBackLayout = (LinearLayout) view
                .findViewById(R.id.title_back_layout);
        mRightLayout = (LinearLayout) view
                .findViewById(R.id.title_right_layout);
        mTitleTv = (TextView) view
                .findViewById(R.id.title_tv);
        mRightTv=(TextView)view.findViewById(R.id.title_right_text);
        mRightIv=(ImageView)view.findViewById(R.id.title_right_iv);
    }

    public void setTitleText(int resid) {
        mTitleTv.setText(resid);
    }

    public void setTitleText(String str) {
        mTitleTv.setText(str);
    }

    public void setRightText(int resid) {
        mRightTv.setText(resid);
    }

    public void setRightText(String str) {
        mRightTv.setText(str);
    }

    public void setRightImage(int resid){
        mRightIv.setImageResource(resid);
    }

    public void setRightTextVisility(int visility){
        mRightTv.setVisibility(visility);
    }

    public void setRightImageVisility(int visility){
        mRightIv.setVisibility(visility);
    }

    public void setLeftBackOnClick(OnClickListener listener){
        mBackLayout.setOnClickListener(listener);
    }

    public void setRightOnClick(OnClickListener listener){
        mRightLayout.setOnClickListener(listener);
    }

    public interface HeadViewListener {
        public void setLeftOnClick();

        public void setRightOnClick();

        public void setHeadTitle(int resid);

        public void setHeadTitle(String str);

        public void setHeadViewVisibility(int visibility);

        public void setRightText(int resid);

        public void setRightText(String str);

        public void setRightImage(int resid);

        public void setRightTextVisibility(int visibility);

        public void setRightImageVisibility(int visibility);
    }

}
