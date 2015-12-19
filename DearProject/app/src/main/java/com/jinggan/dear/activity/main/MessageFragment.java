package com.jinggan.dear.activity.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.jinggan.dear.R;
import com.jinggan.dear.activity.BaseFragment;
import com.jinggan.dear.activity.chat.ChatActivity;
import com.jinggan.dear.network.netty.ClientThreadPool;
import com.jinggan.dear.utils.ISkipActivityUtil;
import com.jinggan.dear.vender.imageLoad.ImageLoader;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 消息列表
 * Created by wuhezhi on 2015/12/9.
 */
public class MessageFragment extends BaseFragment {

    private ImageLoader loader;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loader=new ImageLoader(getActivity());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.main_message_layout,null);
        view.findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ExecutorService es = Executors.newCachedThreadPool();
//                es.execute(new ClientThreadPool());
                ISkipActivityUtil.startIntent(getActivity(), ChatActivity.class);
            }
        });
        ImageView imageView=(ImageView)view.findViewById(R.id.imageview);
        loader.display("http://a1.att.hudong.com/81/12/01300000291746124529125355806.jpg",imageView);
        return view;
    }
}
