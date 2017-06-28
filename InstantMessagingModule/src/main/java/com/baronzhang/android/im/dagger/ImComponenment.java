package com.baronzhang.android.im.dagger;

import com.baronzhang.android.commonbusiness.dagger.CommonBusinessModule;
import com.baronzhang.android.im.InstantMessagingMainActivity;

import dagger.Component;

/**
 * Created by 龙衣 on 17-6-28.
 */

@Component(modules = {ImModule.class, CommonBusinessModule.class})
public  interface ImComponenment {
    void inject(InstantMessagingMainActivity activity);
}
