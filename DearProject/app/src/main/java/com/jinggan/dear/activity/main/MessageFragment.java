package com.jinggan.dear.activity.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jinggan.dear.R;
import com.jinggan.dear.activity.BaseFragment;
import com.jinggan.dear.activity.chat.ChatActivity;
import com.jinggan.dear.utils.ISkipActivityUtil;

/**
 * 消息列表
 * Created by wuhezhi on 2015/12/9.
 */
public class MessageFragment extends BaseFragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.main_message_layout,null);
        view.findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ISkipActivityUtil.startIntent(getActivity(), ChatActivity.class);
            }
        });
        return view;
    }
}
