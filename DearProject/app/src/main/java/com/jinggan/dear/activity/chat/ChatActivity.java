package com.jinggan.dear.activity.chat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.jinggan.dear.R;

/**
 * 聊天类
 * Created by wuhezhi on 2015/12/11.
 */
public class ChatActivity extends ChatBaseActivity implements View.OnClickListener {


    @Override
    public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
        findViewById();
        setListener();
        setHeadTitle("小东");
    }

    private void findViewById(){
        mKeyboardBtn=(ImageButton)findViewById(R.id.chat_keyboard_btn);
        mEmotioBtn=(ImageButton)findViewById(R.id.chat_emotion_btn);
        mMoreBtn=(ImageButton)findViewById(R.id.chat_more_btn);
        mEditText=(EditText)findViewById(R.id.chat_edit);
        mSendBtn=(Button) findViewById(R.id.chat_send_btn);
        mVoiceBtn=(Button)findViewById(R.id.chat_voice_btn);
        mEditLayout=(LinearLayout)findViewById(R.id.chat_edit_layout);
    }

    private void setListener(){
        mKeyboardBtn.setOnClickListener(this);
        mEmotioBtn.setOnClickListener(this);
        mMoreBtn.setOnClickListener(this);
        mSendBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.chat_keyboard_btn:
                if (isKeyboard){
                    mKeyboardBtn.setBackgroundResource(R.mipmap.message_icon_voice_un);
                    mVoiceBtn.setVisibility(View.VISIBLE);
                    mEditLayout.setVisibility(View.GONE);
                }else {
                    mKeyboardBtn.setBackgroundResource(R.mipmap.message_icon_keyboard_un);
                    mVoiceBtn.setVisibility(View.GONE);
                    mEditLayout.setVisibility(View.VISIBLE);
                }
                isKeyboard=!isKeyboard;
                break;
            case R.id.chat_emotion_btn:
                break;
            case R.id.chat_more_btn:
                break;
            case R.id.chat_send_btn:
                break;
        }
    }
}
