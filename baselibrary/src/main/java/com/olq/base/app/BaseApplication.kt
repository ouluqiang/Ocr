package com.olq.base.app

import android.app.Application
import androidx.multidex.MultiDex
import com.alibaba.android.arouter.launcher.ARouter
import com.kingja.loadsir.callback.SuccessCallback
import com.kingja.loadsir.core.LoadSir
import com.olq.base.BuildConfig
import com.olq.base.status.EmptyCallback
import com.olq.base.status.ErrorCallBack
import com.olq.base.status.LoadingCallBack

/**
 * create 2020/11/21 14:41
 *  create admin
 **/
abstract class BaseApplication : Application() {


    override fun onCreate() {
        super.onCreate()
        //分包
        MultiDex.install(this);
        //界面状态
        LoadSir.beginBuilder()
            .addCallback(ErrorCallBack())
            .addCallback(EmptyCallback())
            .addCallback(LoadingCallBack())
            .setDefaultCallback(SuccessCallback::class.java)
            .commit()

        if (BuildConfig.DEBUG) {           // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(this); // 尽可能早，推荐在Application中初始化



    }

}