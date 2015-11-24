package com.jinggan.dear.activity.main;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.jinggan.dear.R;
import com.jinggan.dear.common.config.IConfigConstant;
import com.jinggan.dear.storage.database.Entity.ChatDataBaseEntity;
import com.jinggan.dear.storage.database.operate.ChatOperate;
import com.jinggan.dear.utils.ILog;

/**
 * @Package: com.jinggan.dear.activity
 * @Description:
 * @author: Aaron
 * @date: 2015-11-19
 * @Time: 11:48
 * @version: V1.0
 */
public class MainActivity extends Activity {

    private final String TAG=this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ChatOperate operate=new ChatOperate(this);

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
    }
}
