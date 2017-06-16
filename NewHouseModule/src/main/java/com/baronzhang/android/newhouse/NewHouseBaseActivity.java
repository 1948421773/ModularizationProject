package com.baronzhang.android.newhouse;

import android.support.annotation.LayoutRes;

import com.baronzhang.android.commonbusiness.base.activity.BaseActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by 龙衣 on 17-6-16.
 */

public class NewHouseBaseActivity extends BaseActivity {

    private Unbinder unbinder;

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        unbinder = ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
