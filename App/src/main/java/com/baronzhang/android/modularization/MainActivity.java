package com.baronzhang.android.modularization;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.baronzhang.android.commonbusiness.model.ConstantRouter;
import com.baronzhang.android.commonbusiness.model.HouseDetail;

import java.util.ArrayList;

import butterknife.OnClick;

@Route(path = "/app/main_activity")
public class MainActivity extends AppBaseActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_activity_main);

    }

    @OnClick(R2.id.btn_goto_new_house)
    void startNewHouseActivity() {
    }

    @OnClick(R2.id.btn_goto_second_house)
    void startSecondHouseActivity() {

        ArrayList<HouseDetail> houseDetailList = new ArrayList<>();
        houseDetailList.add(new HouseDetail("10001", "潍坊一村", 88));
        houseDetailList.add(new HouseDetail("10002", "潍坊二村", 120));
        houseDetailList.add(new HouseDetail("10003", "潍坊二村", 99));
        houseDetailList.add(new HouseDetail("10004", "潍坊三村", 86));
        houseDetailList.add(new HouseDetail("10005", "潍坊五村", 80));

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
