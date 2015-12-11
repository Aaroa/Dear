package com.jinggan.dear.activity.account;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.jinggan.dear.R;
import com.jinggan.dear.activity.BaseActivity;
import com.jinggan.dear.activity.main.MainActivity;
import com.jinggan.dear.utils.ISkipActivityUtil;

/**
 * @Package: com.jinggan.dear.activity.account
 * @Description:登录界面
 * @author: Aaron
 * @date: 2015-12-10
 * @Time: 12:44
 * @version: V1.0
 */
public class LoginActivity extends BaseActivity implements View.OnClickListener{

    private final String TAG=this.getClass().getSimpleName();

    private ImageView headIv;
    private EditText mAccountEt,mPwdEt;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_login);
        findViewById();
        setLeftOnClick();
        goneHeadView();
    }

    private void findViewById(){
        headIv=(ImageView)findViewById(R.id.login_head_iv);
        mAccountEt=(EditText)findViewById(R.id.login_account_edit);
        mPwdEt=(EditText)findViewById(R.id.login_pwd_edit);

        findViewById(R.id.login_btn).setOnClickListener(this);
        findViewById(R.id.login_regist_text).setOnClickListener(this);
        findViewById(R.id.login_forget_pwd_text).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.login_btn:
                ISkipActivityUtil.startIntent(this,MainActivity.class);
                finish();
                break;
            case R.id.login_regist_text:

                break;
            case R.id.login_forget_pwd_text:

                break;
        }
    }
}
