package com.baronzhang.android.commonbusiness.dagger;

import com.baronzhang.android.commonbusiness.base.login.LoginActivity;

import dagger.Component;

/**
 * Created by 龙衣 on 17-6-17.
 */

@Component(modules = ActivityModule.class)
public interface ActivityComponment {
    void inject(LoginActivity loginActivity);
}
