package com.olq.ocr.utils

import android.util.Log
import com.olq.base.BuildConfig

/**
 * create 2020/11/23 18:15
 *  create admin
 **/


var isDubug =! BuildConfig.DEBUG

var TAG="test"

private enum class LEVEL {
    V,
    D,
    I,
    W,
    E,
    A,
}


fun logV(msg: String) = logV(TAG,msg)
fun logV(tag: String = TAG, msg: String) = log(LEVEL.V, tag, msg)

fun logD(msg: String) = logD(TAG,msg)
fun logD(tag: String = TAG, msg: String) = log(LEVEL.D, tag, msg)

fun logI(msg: String) = logI(TAG,msg)
fun logI(tag: String = TAG, msg: String) = log(LEVEL.I, tag, msg)

fun logW(msg: String) = logW(TAG,msg)
fun logW(tag: String = TAG, msg: String) = log(LEVEL.W, tag, msg)

fun logE(msg: String) = logE(TAG,msg)
fun logE(tag: String = TAG, msg: String) = log(LEVEL.E, tag, msg)


private fun log(type: LEVEL, tag: String, msg: String) {
    if (isDubug) {
        return
    }
    when (type) {
        LEVEL.V -> Log.v(tag, msg)
        LEVEL.D -> Log.d(tag, msg)
        LEVEL.I -> Log.i(tag, msg)
        LEVEL.W -> Log.w(tag, msg)
        LEVEL.E -> Log.e(tag, msg)
//            A-> Log.(tag, msg)
    }
}

