package com.baronzhang.android.commonbusiness.model;

import android.util.Log;

import com.baronzhang.android.commonbusiness.base.login.LoginActivity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 龙衣 on 17-6-13.
 */

public class ConstantRouter {
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
        activityRouterMap.put(getActivityName(APP_MAINACTIVITY),APP_MAINACTIVITY);
        activityRouterMap.put(getActivityName(IM_MAINACTIVITY),IM_MAINACTIVITY);
        activityRouterMap.put(getActivityName(NEW_HOUSE_MAINACTIVITY),NEW_HOUSE_MAINACTIVITY);
        activityRouterMap.put(getActivityName(SECOND_HOUSE_MAINACTIVITY),SECOND_HOUSE_MAINACTIVITY);
        activityRouterMap.put(getActivityName(LOGIN_ACTIVITY),LOGIN_ACTIVITY);
    }

    private static String getActivityName(String routerUrl){
        int pos = routerUrl.lastIndexOf("/");
        return routerUrl.substring(pos+1);
    }

    public static String getCurRouter(String activityName){
        return activityRouterMap.get(activityName);
    }
}
