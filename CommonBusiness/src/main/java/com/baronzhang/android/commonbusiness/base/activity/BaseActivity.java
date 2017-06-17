package com.baronzhang.android.commonbusiness.base.activity;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;

import com.alibaba.android.arouter.launcher.ARouter;
import com.baronzhang.android.commonbusiness.model.ConstantRouter;
import com.baronzhang.android.commonbusiness.model.DataCenter;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com ==>> baronzhang.com)
 */
public abstract class BaseActivity extends AppCompatActivity {

    /*
     * 解决Vector兼容性问题
     *
     * First up, this functionality was originally released in 23.2.0,
     * but then we found some memory usage and Configuration updating
     * issues so we it removed in 23.3.0. In 23.4.0 (technically a fix
     * release) we’ve re-added the same functionality but behind a flag
     * which you need to manually enable.
     *
     * http://www.jianshu.com/p/e3614e7abc03
     */
    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ARouter.getInstance().inject(this);
    }

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
