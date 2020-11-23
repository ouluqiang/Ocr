package com.olq.ocr.base

import rxhttp.toClass
import rxhttp.wrapper.param.RxHttp

/**
 * create 2020/11/23 17:28
 *  create admin
 **/



suspend fun  sendByGet(url:String,){
    var http= RxHttp.get(url).toClass<BaseBean<String>>().await()
}