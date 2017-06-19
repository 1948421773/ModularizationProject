package com.baronzhang.android.modularization;

import android.os.Bundle;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.baronzhang.android.commonbusiness.model.ConstantRouter;
import com.baronzhang.android.commonbusiness.model.HouseDetail;
import com.baronzhang.android.modularization.dagger.DaggerAppActivityComponment;

import java.util.ArrayList;


import javax.inject.Inject;

import butterknife.OnClick;

@Route(path = "/app/MainActivity")
public class MainActivity extends AppBaseActivity {


    @Inject
    HouseDetail houseDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_activity_main);
        DaggerAppActivityComponment.builder().build().inject(this);
        Log.d("longyi","main:"+houseDetail.toString());

    }

    @OnClick(R2.id.btn_goto_new_house)
    void startNewHouseActivity() {
        ARouter.getInstance().build(ConstantRouter.NEW_HOUSE_MAINACTIVITY).navigation();
    }

    @OnClick(R2.id.btn_goto_second_house)
    void startSecondHouseActivity() {
        ARouter.getInstance().build(ConstantRouter.SECOND_HOUSE_MAINACTIVITY).navigation();
    }

    @OnClick(R2.id.btn_goto_im)
    void startIMActivity() {
        ARouter.getInstance().build(ConstantRouter.IM_MAINACTIVITY)
                .withString("cityId","001")
                .withString("brokerIdList","haha,haha,haha")
                .navigation();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
