package com.olq.base.status

import com.kingja.loadsir.callback.Callback
import com.olq.base.R

/**
 * create 2020/12/7 10:38
 *  create admin
 **/
class EmptyCallback : Callback() {
    override fun onCreateView(): Int {
        return R.layout.status_empty
    }
}