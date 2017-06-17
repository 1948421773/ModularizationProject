package com.baronzhang.android.commonbusiness.base.login;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.ProgressBar;

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

    private String targetUrl;
    @BindView(R2.id.progressBar)
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        targetUrl = getCurModuleUrl();
        if(targetUrl == null){
            targetUrl = ConstantRouter.APP_MAINACTIVITY;
        }
        //此处用来模拟登录事件
        progressBar.postDelayed(new Runnable() {
            @Override
            public void run() {
                DataCenter.getInstance().setLogin(true);
                ARouter.getInstance().build(targetUrl).navigation();
                LoginActivity.this.finish();
            }
        },2000);
    }

    /**
     * 获取当前登录完毕要跳转到哪个模块首页
     * @return
     */
    private String getCurModuleUrl(){
        String label = null;
        try {
            label = getResources().getString(
                    getPackageManager().getApplicationInfo(getPackageName(), 0).labelRes);
            return ConstantRouter.getCurRouter(label);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
