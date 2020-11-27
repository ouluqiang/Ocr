package com.olq.ocr.base

import android.app.Application
import androidx.multidex.MultiDex

/**
 * create 2020/11/21 14:41
 *  create admin
 **/
abstract class BaseApplication : Application() {


    override fun onCreate() {
        super.onCreate()
        MultiDex.install(this);
    }

}