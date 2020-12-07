package com.olq.base.app

import android.app.Application
import androidx.multidex.MultiDex
import com.kingja.loadsir.callback.SuccessCallback
import com.kingja.loadsir.core.LoadSir
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

    }

}