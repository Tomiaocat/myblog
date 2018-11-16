package cn.tomiaocat.common;


import cn.tomiaocat.util.Prop;
import cn.tomiaocat.util.PropKit;

import java.io.File;

/**
 * @param -a-
 * @author double
 * @date 2018/3/10 13:46
 * @return 配置文件加载类
 */
public class TomiaocatConfig {
 
    /**对应global.properties*/
    public static Prop globalProp;
    /**对应redis.properties*/
   // public static Prop redisProp;
    
    static {
        System.out.println("初始化配置。。。");
        File conifgFolder = new File(BaseConstants.CONFIG_PATH);
        File glabolFile = new File(BaseConstants.CONFIG_PATH+ "global.properties");
        //File redisFile = new File(BaseConstants.CONFIG_PATH+"redis.properties");
        if(conifgFolder.exists()){
            PropKit.clear();
            System.out.println("加载服务器配置。。。");
            globalProp = PropKit.use(glabolFile);
            //redisProp = PropKit.use(redisFile);
        }else{
            globalProp = PropKit.use("global.properties");
            //redisProp =  PropKit.use("redis.properties");
            System.out.println("加载本地配置。。。");
        }
    }
    
}
