package com.jinggan.dear.common;

import com.jinggan.dear.common.Enum.BaseEnum;
import com.jinggan.dear.common.config.IConfigConstant;

/**
 * @Package: com.jinggan.dear.common.config
 * @Description:
 * @author: Aaron
 * @date: 2015-11-19
 * @Time: 15:31
 * @version: V1.0
 */
public class Constants {
    //IP 地址
    public final static String IP= IConfigConstant.CURRENT_ENV== BaseEnum.CurrentEnvrironment.OFFICIAL_ENR.getValue()? IConfigConstant.IP:IConfigConstant.IP_TEST;
    //端口号
    public final static int PORT=IConfigConstant.CURRENT_ENV== BaseEnum.CurrentEnvrironment.OFFICIAL_ENR.getValue()? IConfigConstant.PORT:IConfigConstant.PORT_TEST;
}
