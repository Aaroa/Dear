package com.jinggan.dear.activity.main;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;

import com.jinggan.dear.R;
import com.jinggan.dear.activity.BaseActivity;
import com.jinggan.dear.common.Constants;
import com.jinggan.dear.common.config.IConfig;
import com.jinggan.dear.common.config.IConfigConstant;
import com.jinggan.dear.common.config.IConfigTagValue;
import com.jinggan.dear.common.dialog.IDialogFactory;
import com.jinggan.dear.storage.database.Entity.ChatDataBaseEntity;
import com.jinggan.dear.storage.database.operate.ChatOperate;
import com.jinggan.dear.utils.ILog;
import com.jinggan.dear.view.ITextView;

/**
 * @Package: com.jinggan.dear.activity
 * @Description:
 * @author: Aaron
 * @date: 2015-11-19
 * @Time: 11:48
 * @version: V1.0
 */
public class MainActivity extends BaseActivity {

    private final String TAG=this.getClass().getSimpleName();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ChatOperate operate=new ChatOperate(this,1023);

        ChatDataBaseEntity entity=new ChatDataBaseEntity();
        entity.setTableVer(IConfigConstant.CHAT_DATABASE_VERSION);
        entity.setFromUid(32);
        entity.setToUid(433);
        entity.setNick("王老五");
        entity.setSex(1);
        entity.setMessage("你知道是为什么吗");
        entity.setType(1);
        entity.setCreateTime(System.currentTimeMillis());
        entity.setStatus(2);
        entity.setMessageLocalId(1);
        entity.setMessageServeId(123);
        entity.setDes(0);
        entity.setProgress(0);
        if (operate!=null){
            operate.insert(entity);
        }

//       Dialog dialog= IDialogFactory.showMsgDialog(this, "标题", "这是消息", null, null);
//        IDialogFactory.showDialog(dialog);
//
//        ITextView textView=(ITextView)findViewById(R.id.itext);
//        textView.setText("洛杉矶加工厂23412321‘；；。。、。撒了地方八3=朸？、ladfija离开萨芬囙。、、、同788喝酒为恨120--0恨");
   IDialogFactory.createLoadingDialog(this,"登录中...");
    }
}
