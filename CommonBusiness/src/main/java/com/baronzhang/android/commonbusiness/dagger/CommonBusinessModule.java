package com.baronzhang.android.commonbusiness.dagger;

import com.baronzhang.android.commonbusiness.model.HouseDetail;

import dagger.Module;
import dagger.Provides;

/**
 * Created by 龙衣 on 17-6-17.
 */

@Module
public class CommonBusinessModule {
    @Provides
    public HouseDetail provideHouseDetail(){
        return new HouseDetail();
    }
}
