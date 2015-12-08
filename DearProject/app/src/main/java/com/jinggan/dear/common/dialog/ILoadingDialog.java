package com.jinggan.dear.common.dialog;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.jinggan.dear.R;

/**
 * Created by wuhezhi on 2015/12/6.
 */
public class ILoadingDialog extends Dialog {
    /**
     * 提示内容控件
     */
    private TextView tipText;
    /**
     * &#x70b9;&#x51fb;&#x8fd4;&#x56de;&#x662f;&#x5426;&#x53d6;&#x6d88;&#x5bf9;&#x8bdd;&#x6846;[true&#x4e0d;&#x53d6;&#x6d88;&#xff0c;false&#x53d6;&#x6d88;]
     */
    private boolean backPressCancel;

    public ILoadingDialog(Context context) {
        super(context);
        init();
    }

    private void init() {
        this.getContext().setTheme(R.style.dialog);
        super.setContentView(R.layout.dialog_progress_layout);

        tipText = (TextView) findViewById(R.id.loading_tv);

        Window window = getWindow();
        WindowManager.LayoutParams attributesParams = window.getAttributes();
        attributesParams.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        attributesParams.dimAmount = 0.4f;
        int width = (int) (window.getWindowManager().getDefaultDisplay()
                .getWidth() * 0.8f);
        window.setLayout(width, WindowManager.LayoutParams.WRAP_CONTENT);
    }

    /**
     * 设置内容
     *
     * @param msg
     */
    public void setTipText(String msg) {
        if (TextUtils.isEmpty(msg))
            return;
        
        tipText.setText(msg);
    }

    /**
     * 设置内容
     *
     * @param resid
     */
    public void setTipText(int resid) {
        if (resid <= 0) {
            return;
        }
        tipText.setText(resid);
    }

    public void setBackPressCancel(boolean backPressCancel) {
        this.backPressCancel = backPressCancel;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK
                || keyCode == KeyEvent.KEYCODE_SEARCH) {
            if (backPressCancel) {
                return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return true;
    }

}
