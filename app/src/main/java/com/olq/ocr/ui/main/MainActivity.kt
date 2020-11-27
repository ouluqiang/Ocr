package com.olq.ocr.ui.main

import android.os.Bundle
import com.olq.ocr.R
import com.olq.ocr.base.BaseActivity
import com.olq.ocr.base.BaseViewModel

class MainActivity : BaseActivity<BaseViewModel>() {

    override fun getLayout(): Int {
       return R.layout.main_activity
    }

    override fun init(savedInstanceState: Bundle?) {

    }


}