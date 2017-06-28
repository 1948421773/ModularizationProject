package com.baronzhang.android.im;

import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.baronzhang.android.commonbusiness.base.activity.BaseActivity;
import com.baronzhang.android.router.RouterInjector;

import butterknife.BindView;

@Route(path="/im/InstantMessagingMainActivity")
public class InstantMessagingMainActivity extends BaseActivity{

    @Autowired
    public String cityId;
    @Autowired
    public String brokerIdList;

    @BindView(R2.id.textView1)
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.im_activity_instant_messaging_main);


        TextView textView2 = (TextView) findViewById(R.id.textView2);
        tv1.setText("hello world");

//        textView1.setText("城市ID: " + cityId);
//        textView2.setText("经纪人ID列表: " + brokerIdList);

    }
}
