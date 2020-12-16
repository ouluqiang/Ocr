package com.olq.base

import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type

/**
 * create 2020/11/21 15:25
 *  create admin
 *  扩展函数
 **/



fun  getType(o: Any,i:Int): Type {
    val type = o.javaClass.genericSuperclass as ParameterizedType
    if (type is ParameterizedType) {
        return type.actualTypeArguments[i]
    }else{
        return Any::class.java
    }
}
fun <T> getClassType(o: Any,i:Int): T {
    val type = o.javaClass.genericSuperclass as ParameterizedType
    return type.actualTypeArguments[i] as T
}
//fun <T> getClassType(o: Any): T {
//    val type = o.javaClass.genericSuperclass
//    if(type is ParameterizedType){
//        return type.actualTypeArguments[1] as T
//    }else{
//        return (type.javaClass) as T
//    }
//}

fun Fragment.navigation(rId : Int){
    findNavController().navigate(rId)
}
fun Fragment.navigation(nav : NavDirections){
    findNavController().navigate(nav)
}


