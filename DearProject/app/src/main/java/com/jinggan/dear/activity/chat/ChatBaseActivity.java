package com.jinggan.dear.activity.chat;

import android.os.Bundle;

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

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

    }
}
