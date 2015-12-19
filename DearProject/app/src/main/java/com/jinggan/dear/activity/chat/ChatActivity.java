package com.jinggan.dear.activity.chat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.jinggan.dear.R;
import com.jinggan.dear.vender.pulltoprefresh.PullToRefreshListView;

/**
 * 聊天类
 * Created by wuhezhi on 2015/12/11.
 */
public class ChatActivity extends ChatBaseActivity implements View.OnClickListener,TextWatcher {


    @Override
    public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
        findViewById();
        setListener();
        setHeadTitle("小东");
    }

    private void findViewById(){
        mListView=(PullToRefreshListView)findViewById(R.id.chat_listview);
        mBgLayout=(RelativeLayout)findViewById(R.id.chat_layout);

        mVoiceImageBtn =(ImageButton)findViewById(R.id.chat_voice_iamge_btn);
        mEmotioBtn=(ImageButton)findViewById(R.id.chat_emotion_image_btn);
        mMoreBtn=(ImageButton)findViewById(R.id.chat_more_image_btn);
        mEditText=(EditText)findViewById(R.id.chat_edit);
        mSendBtn=(Button) findViewById(R.id.chat_send_btn);
        mVoiceBtn=(Button)findViewById(R.id.chat_voice_btn);
        mEditLayout=(LinearLayout)findViewById(R.id.chat_edit_layout);
    }

    private void setListener(){
        mVoiceImageBtn.setOnClickListener(this);
        mEmotioBtn.setOnClickListener(this);
        mMoreBtn.setOnClickListener(this);
        mSendBtn.setOnClickListener(this);
        mEditText.addTextChangedListener(this);
        mBgLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.chat_voice_iamge_btn:
                if (isKeyboard){
                    mVoiceImageBtn.setBackgroundResource(R.mipmap.message_icon_voice_un);
                    mVoiceBtn.setVisibility(View.GONE);
                    mEditLayout.setVisibility(View.VISIBLE);
                }else {
                    mVoiceImageBtn.setBackgroundResource(R.mipmap.message_icon_keyboard_un);
                    mVoiceBtn.setVisibility(View.VISIBLE);
                    mEditLayout.setVisibility(View.GONE);
                }
                isKeyboard=!isKeyboard;
                break;
            case R.id.chat_emotion_image_btn:
                break;
            case R.id.chat_more_image_btn:
                break;
            case R.id.chat_send_btn:
                break;
            case R.id.chat_layout:
                showToast("click");
                hideSoftInput(mEditText);
                break;
        }
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if (TextUtils.isEmpty(s)){
            mVoiceImageBtn.setVisibility(View.VISIBLE);
            mSendBtn.setVisibility(View.GONE);
        }else{
            mVoiceImageBtn.setVisibility(View.GONE);
            mSendBtn.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}
