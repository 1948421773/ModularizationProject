package com.baronzhang.android.commonbusiness.model;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;

import com.baronzhang.android.commonbusiness.R;
import com.baronzhang.android.commonbusiness.base.BaseApplication;
import com.baronzhang.android.commonbusiness.base.activity.BaseActivity;
import com.baronzhang.android.commonbusiness.base.login.LoginActivity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 龙衣 on 17-6-13.
 */

public class ConstantRouter {
    //各个模块首页和跳转地址的映射
    public static Map<String,String>activityRouterMap = new HashMap<>();
    //主页
    public static final String APP_MAINACTIVITY = "/app/MainActivity";
    //即时通讯首页
    public static final String IM_MAINACTIVITY = "/im/InstantMessagingMainActivity";
    //新房首页
    public static final String NEW_HOUSE_MAINACTIVITY = "/new_house/NewHouseMainActivity";

    //二手房首页
    public static final String SECOND_HOUSE_MAINACTIVITY = "/second_house/SecondHouseMainActivity";

    /**
     * 登录
     */
    public static final String LOGIN_ACTIVITY = "/common_business/LoginActivity";

    static{
        activityRouterMap.put(BaseApplication.getApplication().getString(R.string.label_app),APP_MAINACTIVITY);
        activityRouterMap.put(BaseApplication.getApplication().getString(R.string.label_instant_messaging),IM_MAINACTIVITY);
        activityRouterMap.put(BaseApplication.getApplication().getString(R.string.label_second_house),SECOND_HOUSE_MAINACTIVITY);
        activityRouterMap.put(BaseApplication.getApplication().getString(R.string.label_new_house),NEW_HOUSE_MAINACTIVITY);
    }


    public static String getCurRouter(String label){
        return activityRouterMap.get(label);
    }
}
