package com.olq.base.bean
//
///**
// * create 2020/11/23 17:14
// *  create admin
// **/
//data class BaseBean<T>(var code:Int=0,var message:String?=null,var t:T) {
//}

/**
 * 基类
 */
//data class BaseBean<T>(
//    var data: T,
//    var errorCode: Int,
//    var errorMsg: String
//)

data class BaseBean<T>(
    val code: Int,
    val data:T,
    val msg: String
)