package com.olq.base.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * create 2020/11/21 14:42
 *  create admin
 **/

abstract class BaseActivity<vm : BaseViewModel> : AppCompatActivity(){


    abstract fun getLayout():Int

    abstract fun init(savedInstanceState: Bundle?)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
        init(savedInstanceState)
//        if (savedInstanceState == null) {
//            supportFragmentManager.beginTransaction()
//                    .replace(R.id.container, MainFragment.newInstance())
//                    .commitNow()
//        }
    }




}