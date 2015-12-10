package com.jinggan.dear.activity.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jinggan.dear.R;
import com.jinggan.dear.activity.BaseFragment;
import com.jinggan.dear.vender.pulltoprefresh.PullToRefreshListView;

/**
 * 好友列表
 * Created by wuhezhi on 2015/12/9.
 */
public class FriendFragment extends BaseFragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.main_friend_layout,null);
        return view;
    }


}
