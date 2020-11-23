package com.olq.ocr.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.olq.ocr.R

/**
 * create 2020/11/21 14:42
 *  create admin
 **/

abstract class BaseActivity<vm : BaseViewModel> : AppCompatActivity(){


    abstract fun getLayout():Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
//        if (savedInstanceState == null) {
//            supportFragmentManager.beginTransaction()
//                    .replace(R.id.container, MainFragment.newInstance())
//                    .commitNow()
//        }
    }




}