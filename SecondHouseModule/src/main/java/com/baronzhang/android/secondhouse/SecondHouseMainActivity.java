package com.baronzhang.android.secondhouse;

import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.baronzhang.android.commonbusiness.base.activity.BaseActivity;
import com.baronzhang.android.commonbusiness.model.HouseDetail;

import java.util.ArrayList;

import butterknife.BindView;

@Route(path = "/second_house/SecondHouseMainActivity")
public class SecondHouseMainActivity extends BaseActivity{

    @Autowired
    String cityId;
    ArrayList<HouseDetail> houseList;

    @BindView(R2.id.textView1)
    TextView tvCityId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_house_activity_second_house_main);

        tvCityId.setText("城市ID: " + cityId);
    }
}
