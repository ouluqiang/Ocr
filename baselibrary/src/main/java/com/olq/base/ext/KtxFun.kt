package com.olq.base

import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import java.lang.reflect.ParameterizedType

/**
 * create 2020/11/21 15:25
 *  create admin
 *  扩展函数
 **/



fun <T> getType(o: Any,i:Int): T {
    val type = o.javaClass.genericSuperclass as ParameterizedType
    return (type.actualTypeArguments[i] as Class<T>).newInstance()
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


