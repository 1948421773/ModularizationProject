package com.baronzhang.android.im;

import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.baronzhang.android.commonbusiness.base.activity.BaseActivity;
import com.baronzhang.android.commonbusiness.model.HouseDetail;
import com.baronzhang.android.im.dagger.DaggerImComponenment;

import javax.inject.Inject;

import butterknife.BindView;

@Route(path="/im/InstantMessagingMainActivity")
public class InstantMessagingMainActivity extends BaseActivity{

    @Autowired
    public String cityId;
    @Autowired
    public String brokerIdList;

    @BindView(R2.id.textView1)
    TextView tv1;
    @BindView(R2.id.textView2)
    TextView tv2;

    @Inject
    SecondHouse secondHouse;

    @Inject
    HouseDetail houseDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.im_activity_instant_messaging_main);
        DaggerImComponenment.builder().build().inject(this);
        tv1.setText(secondHouse.toString());
        tv2.setText(houseDetail.toString());
    }
}
