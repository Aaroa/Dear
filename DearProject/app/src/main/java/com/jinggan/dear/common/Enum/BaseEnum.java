package com.jinggan.dear.common.Enum;

/**
 * Created by wuhezhi on 2015/12/6.
 */
public final class BaseEnum {
    /**
     * 当前运行环境
     */
    public enum CurrentEnvrironment {
       OFFICIAL_ENR(1), TEST_ENR(2);

    private int value;

    public int getValue(){
        return value;
    }

    private CurrentEnvrironment(int value){
        this.value=value;
        }
    }
}
