//package com.olq.base.loader
//
//import com.olq.base.bean.BaseBean
//import com.olq.base.getType
//import rxhttp.wrapper.utils.GsonUtil
//
///**
// * create 2020/12/11 9:54
// *  create admin
// **/
// class GsonCallBack<T>(val s: String) {
//
////    val mType:Type?=null
//
////    init {
////        val  mType = getType(this,0)
////    }
//
//    constructor( s: String,block:(t:T) -> Unit):this(s) {
//        val  mType = getType(this,0)
//        var bean = GsonUtil.fromJson<BaseBean<T>>(s, mType)
//        block(bean.data)
//    }
//
////     fun getGson(block:(t:T) -> Unit){
////
////          var bean=GsonUtil.fromJson<BaseBean<T>>(s,mType)
////          block(bean.data)
////     }
//
//
//}