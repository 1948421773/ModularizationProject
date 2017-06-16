package com.baronzhang.android.commonbusiness.base.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.baronzhang.android.commonbusiness.R;
import com.baronzhang.android.commonbusiness.R2;
import com.baronzhang.android.commonbusiness.base.activity.CommonBaseActivity;
import com.baronzhang.android.commonbusiness.model.ConstantRouter;
import com.baronzhang.android.commonbusiness.model.DataCenter;

import butterknife.BindView;

@Route(path = "/common_business/LoginActivity")
public class LoginActivity extends CommonBaseActivity{

    @Autowired
    String targetUrl;
    @BindView(R2.id.progressBar)
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        if(targetUrl == null){
            //默认跳转到MainActivity
            targetUrl = ConstantRouter.APP_MAINACTIVITY;
        }
        //此处用来模拟登录事件
        progressBar.postDelayed(new Runnable() {
            @Override
            public void run() {
                DataCenter.getInstance().setLogin(true);
                ARouter.getInstance().build(targetUrl).navigation();
            }
        },2000);
    }
}
