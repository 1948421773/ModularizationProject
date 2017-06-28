package com.baronzhang.android.im.dagger;

import com.baronzhang.android.im.SecondHouse;

import dagger.Module;
import dagger.Provides;

/**
 * Created by 龙衣 on 17-6-28.
 */

@Module
public class ImModule {
    @Provides
    public SecondHouse provideSecond(){
        return new SecondHouse();
    }
}
