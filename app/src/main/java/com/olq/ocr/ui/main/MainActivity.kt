package com.olq.ocr.ui.main

import android.os.Bundle
import androidx.activity.addCallback
import com.olq.base.app.BaseActivity
import com.olq.base.app.BaseViewModel
import com.olq.ocr.databinding.MainActivityBinding

class MainActivity : BaseActivity<BaseViewModel,MainActivityBinding>() {

//    override fun getLayout(): Int {
//       return R.layout.main_activity
//    }

    override fun getLayoutVb(): MainActivityBinding {
       return MainActivityBinding.inflate(layoutInflater)
    }

    override fun init(savedInstanceState: Bundle?) {

        onBackPressedDispatcher.addCallback {

        }

    }




}