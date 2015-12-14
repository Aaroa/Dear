package com.jinggan.dear.activity.chat;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.jinggan.dear.R;
import com.jinggan.dear.activity.BaseActivity;

/**
 * @Package: com.jinggan.dear.activity.chat
 * @Description: 聊天基类
 * @author: Aaron
 * @date: 2015-11-19
 * @Time: 11:55
 * @version: V1.0
 */
public class ChatBaseActivity extends BaseActivity {

    protected ImageButton mKeyboardBtn,mEmotioBtn,mMoreBtn;
    protected EditText mEditText;
    protected Button mSendBtn,mVoiceBtn;
    protected LinearLayout mEditLayout;

    protected boolean isKeyboard=true;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
    }

    @Override
    public void onBackListener() {
        super.onBackListener();
    }
}
