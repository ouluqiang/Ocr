package com.olq.base.status

import com.kingja.loadsir.callback.Callback
import com.olq.base.R

/**
 * create 2020/12/7 10:33
 *  create admin
 **/
class ErrorCallBack : Callback() {
    override fun onCreateView(): Int {
        return R.layout.status_error
    }
}