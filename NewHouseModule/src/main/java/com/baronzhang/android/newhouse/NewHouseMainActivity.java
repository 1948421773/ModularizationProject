package com.baronzhang.android.newhouse;

import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;

import butterknife.BindView;

@Route(path = "/new_house/NewHouseMainActivity")
public class NewHouseMainActivity extends NewHouseBaseActivity{

    @BindView(R2.id.textView1)
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_house_activity_new_house_main);


        tv1.setText("hello wor");

    }

}
