package com.olq.ocr.base

import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController

/**
 * create 2020/11/21 15:25
 *  create admin
 *  扩展函数
 **/

fun Fragment.navigation(rId : Int){
    findNavController().navigate(rId)
}
fun Fragment.navigation(nav : NavDirections){
    findNavController().navigate(nav)
}