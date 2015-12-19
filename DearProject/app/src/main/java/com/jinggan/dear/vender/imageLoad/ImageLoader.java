package com.jinggan.dear.vender.imageLoad;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.lidroid.xutils.BitmapUtils;
import com.lidroid.xutils.bitmap.BitmapDisplayConfig;
import com.lidroid.xutils.bitmap.callback.BitmapLoadFrom;
import com.lidroid.xutils.bitmap.callback.DefaultBitmapLoadCallBack;

/*** 图片加载
 * Created by wuhezhi on 2015/12/19.
 */
public class ImageLoader {

    private  BitmapUtils mBitmapUtils;
    private  BitmapDisplayConfig bigPicDisplayConfig;

    private  ImageLoader instance;

    public  ImageLoader(Context context){
        mBitmapUtils=new BitmapUtils(context.getApplicationContext());
        bigPicDisplayConfig=new BitmapDisplayConfig();
        bigPicDisplayConfig.setBitmapConfig(Bitmap.Config.RGB_565);
//        bigPicDisplayConfig.set
    }

    /**
     * 设置图片加载失败时的默认图片
     *
     * @param resid
     */
    public void setDefaultLoadFailedImage(int resid) {
        mBitmapUtils.configDefaultLoadFailedImage(resid);
    }

    /**
     * 设置默认加载图片
     *
     * @param resid
     */
    public void setDefalutLoadImage(int resid) {
        mBitmapUtils.configDefaultLoadingImage(resid);
    }

    /**
     * 显示图片
     *
     * @param path
     * @param imageView
     */
    public void display(String path, ImageView imageView) {
        mBitmapUtils.display(imageView, path);
    }

    /**
     * 显示图片
     * @param path
     * @param imageView
     * @param loadCallBack
     */
    public void display(String path,ImageView imageView,DefaultBitmapLoadCallBack<ImageView> loadCallBack){
        mBitmapUtils.display(imageView,path,loadCallBack);
    }

    /**
     * 显示图片
     * @param path
     * @param imageView
     * @param config
     */
    public void display(String path,ImageView imageView,BitmapDisplayConfig config){
        mBitmapUtils.display(imageView,path,config);
    }

    /**
     * 显示图片
     * @param path
     * @param imageView
     * @param config
     * @param loadCallBack
     */
    public void dispaly(String path,ImageView imageView,BitmapDisplayConfig config,DefaultBitmapLoadCallBack<ImageView> loadCallBack){
        mBitmapUtils.display(imageView,path,config,loadCallBack);
    }
}
