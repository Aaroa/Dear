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
 * 朋友圈
 * Created by wuhezhi on 2015/12/9.
 */
public class DynamicFragment extends BaseFragment {

    private PullToRefreshListView mListView;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.main_dynamic_layout,null);
        findViewById(view);
        return view;
    }

    private void findViewById(View view){
        mListView=(PullToRefreshListView)view.findViewById(R.id.main_dynamic_listView);
    }
}
