package com.olq.ocr.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.rxLifeScope
import rxhttp.toClass
import rxhttp.wrapper.param.RxHttp

/**
 * create 2020/11/23 17:28
 *  create admin
 **/



 fun <T> ViewModel.sendByGet(url:String,liveDate: MutableLiveData<T>){
//     rxLifeScope.launch({
////          var token = RxHttp.get(url).toClass<BaseBean<String>>().await()
////          liveDate.value=token.t
//
//     }, {
//        it.message
//     })
}
// fun ViewModel.sendByGet(url:String,){
//    var http= RxHttp.get(url).toClass<BaseBean<String>>()
//}