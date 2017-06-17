package com.baronzhang.android.commonbusiness.base;

import android.app.Application;

import com.alibaba.android.arouter.*;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by 龙衣 on 17-6-6.
 */

public class BaseApplication extends Application {
    private static BaseApplication application;
    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(this); // 尽可能早，推荐在Application中初始化
        application = this;
    }

    public static BaseApplication getApplication(){
        return application;
    }
}
