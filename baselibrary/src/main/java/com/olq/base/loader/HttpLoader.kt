package com.olq.base.loader

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.rxLifeScope
import com.olq.ocr.utils.logE
import rxhttp.retry
import rxhttp.timeout
import rxhttp.wrapper.param.RxHttp
import rxhttp.wrapper.param.toResponse
import java.net.ConnectException

/**
 * create 2020/11/23 17:28
 *  create admin
 **/


// fun ViewModel.sendByGet(url: String, liveDate: MutableLiveData<String>) {
//    rxLifeScope.launch({
//        //协程代码块
//        val students = RxHttp.get(url)
//            .toStr()
//            .await()
//        liveDate.postValue(students)
//        //可以直接更新UI
//    }, {
//        //异常回调，这里可以拿到Throwable对象
//       logE("${it.message}++++")
//
//    }, {
//        //开始回调，可以开启等待弹窗
//        logE("开启等待弹窗++++")
//    }, {
//        //结束回调，可以销毁等待弹窗
//        logE("销毁等待弹窗++++")
//    })
//
//}

val TIME_OUT = 30 * 1000L
val PERIOD = 1000 * 2L

/**
 *  suspend 协程中使用
 *   inline   reified 泛型被智能替换成对应的类型
 */
  inline fun <reified T : Any> ViewModel.sendByGet(url: String, liveDate: MutableLiveData<T>) {
    rxLifeScope.launch({
        var bean=RxHttp.get(url).toResponse<T>()
            .timeout(TIME_OUT)      //超时时长为3s
            .retry(2, PERIOD) {            //重试2次，每次间隔1s
                it is ConnectException   //如果是网络异常就重试
            }
            .await()
        logE("$url 返回：${bean.toString()}")
        liveDate.postValue(bean)
    }, {
        //异常回调，这里可以拿到Throwable对象
        logE("异常 ${it.message}")
    }, {
        //开始回调，可以开启等待弹窗
        logE("开启等待弹窗")
    }, {
        //结束回调，可以销毁等待弹窗
        logE("销毁等待弹窗")
    })
  }


//  suspend inline fun <reified T : Any> sendByGet(url: String, liveDate: MutableLiveData<T>): T {
//
//
//    var bean=RxHttp.get(url).toResponse<T>()
//        .timeout(TIME_OUT)      //超时时长为3s
//        .retry(2, PERIOD) {            //重试2次，每次间隔1s
//            it is ConnectException   //如果是网络异常就重试
//        }
//        .await()
//        logE("$url 返回：${bean.toString()}")
//      return  bean
//  }



///*
//	 * 获取泛型类Class对象，不是泛型类则返回null
//	 */
//fun getActualTypeArgument(clazz: Class<*>): Class<*>? {
//    var entitiClass: Class<*>? = null
//    val genericSuperclass: Type = clazz.genericSuperclass
//    if (genericSuperclass is ParameterizedType) {
//        val actualTypeArguments: Array<Type> = (genericSuperclass as ParameterizedType)
//            .getActualTypeArguments()
//        if (actualTypeArguments != null && actualTypeArguments.size > 0) {
//            entitiClass = actualTypeArguments[0] as Class<*>
//        }
//    }
//    return entitiClass
//}