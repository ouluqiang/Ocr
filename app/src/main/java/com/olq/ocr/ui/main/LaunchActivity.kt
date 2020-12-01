package com.olq.ocr.ui.main

import android.content.Intent
import android.os.Bundle
import com.olq.ocr.R
import com.olq.base.app.BaseActivity
import com.olq.base.app.BaseViewModel
import kotlinx.android.synthetic.main.activity_launch.*

class LaunchActivity : BaseActivity<BaseViewModel>() {

    override fun getLayout(): Int {
        return R.layout.activity_launch
    }

    override fun init(savedInstanceState: Bundle?) {

        button.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }

    }
}