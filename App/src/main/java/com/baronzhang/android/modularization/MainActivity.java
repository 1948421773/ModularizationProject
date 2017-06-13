package com.baronzhang.android.modularization;

import android.os.Bundle;

import com.alibaba.android.arouter.launcher.ARouter;
import com.baronzhang.android.commonbusiness.base.activity.BaseActivity;
import com.baronzhang.android.commonbusiness.model.HouseDetail;
import com.baronzhang.android.router.Router;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class MainActivity extends BaseActivity {


    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_activity_main);
        unbinder = ButterKnife.bind(this);

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
        ARouter.getInstance().build("/im/main")
                .navigation();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (unbinder != null)
            unbinder.unbind();
    }
}
