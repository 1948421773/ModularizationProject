package com.baronzhang.android.commonbusiness.model;

/**
 * Created by 龙衣 on 17-6-16.
 */

public class DataCenter {
    private volatile static DataCenter instance;
    /**
     * 是否登录
     */
    private boolean isLogin;
    private DataCenter(){}
    public static DataCenter getInstance(){
        if(instance == null){
            synchronized (DataCenter.class){
                if(instance == null){
                    instance = new DataCenter();
                }
            }
        }
        return instance;
    }

    public boolean isLogin() {
        return isLogin;
    }

    public void setLogin(boolean login) {
        isLogin = login;
    }
}
