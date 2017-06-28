package com.baronzhang.android.modularization.dagger;

import com.baronzhang.android.modularization.MainActivity;

import dagger.Component;

/**
 * Created by 龙衣 on 17-6-19.
 */

@Component(modules = AppCommonBusinessModule.class)
public interface AppActivityComponment {
    void inject(MainActivity activity);
}
