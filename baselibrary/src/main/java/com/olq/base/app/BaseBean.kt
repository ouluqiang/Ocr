package com.olq.base.app

/**
 * create 2020/11/23 17:14
 *  create admin
 **/
data class BaseBean<T>(var code:Int=0,var message:String?=null,var t:T) {
}