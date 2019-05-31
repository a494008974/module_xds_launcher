package com.mylove.module_xds_launcher.mvp.presenter;

import android.app.Application;

import com.jess.arms.integration.AppManager;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.mvp.BasePresenter;
import com.jess.arms.http.imageloader.ImageLoader;

import me.jessyan.rxerrorhandler.core.RxErrorHandler;

import javax.inject.Inject;

import com.mylove.commonbusiness.common.CommonContract;
import com.mylove.commonbusiness.common.CommonModel;
import com.mylove.commonbusiness.common.CommonPresenter;
import com.mylove.module_xds_launcher.mvp.contract.MainContract;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 05/22/2019 10:05
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@ActivityScope
public class MainPresenter extends CommonPresenter<CommonContract.Model, CommonContract.View> {
    @Inject
    public MainPresenter(CommonContract.Model model, CommonContract.View rootView) {
        super(model, rootView);
    }

}
