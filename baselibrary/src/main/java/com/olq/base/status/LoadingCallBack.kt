package com.olq.base.status

import com.kingja.loadsir.callback.Callback
import com.olq.base.R

/**
 * create 2020/12/7 10:40
 *  create admin
 **/
class LoadingCallBack : Callback() {
    override fun onCreateView(): Int {
        return R.layout.status_loading
    }
}