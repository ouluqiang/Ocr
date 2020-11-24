package com.olq.ocr.utils

import android.util.Log
import com.olq.ocr.BuildConfig

/**
 * create 2020/11/23 18:15
 *  create admin
 **/


object LogUtils{

    var isDubug=BuildConfig.DEBUG

    val V="Verbose"
    val D="Debug"
    val I="Info"
    val W="Warn"
    val E="Error"
    val A="Assert"


    fun v(tag:String="test",msg:String){
        log(V,tag, msg)
    }
    fun d(tag:String="test",msg:String){
        log(D,tag, msg)
    }
    fun i(tag:String="test",msg:String){
        log(I,tag, msg)
    }
    fun w(tag:String="test",msg:String){
        log(W,tag, msg)
    }
    fun e(tag:String="test",msg:String){
        log(E,tag, msg)
    }


    fun log(type:String,tag:String,msg:String){
        if (isDubug){
            return
        }
        when(type){
            V-> Log.v(tag, msg)
            D-> Log.d(tag, msg)
            I-> Log.i(tag, msg)
            W-> Log.w(tag, msg)
            E-> Log.e(tag, msg)
//            A-> Log.(tag, msg)
        }
    }


}