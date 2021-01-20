package com.olq.main.launch

import android.os.Bundle
import androidx.activity.addCallback
import com.alibaba.android.arouter.facade.annotation.Route
import com.olq.base.app.BaseActivity
import com.olq.base.app.BaseViewModel
import com.olq.base.router.BaseRouter
import com.olq.main.databinding.MainActivityBinding

@Route(path = BaseRouter.MAIN,name = "首页")
class MainActivity : BaseActivity<BaseViewModel, MainActivityBinding>() {


    override fun getLayoutVb(): MainActivityBinding {
       return MainActivityBinding.inflate(layoutInflater)
    }

    override fun init(savedInstanceState: Bundle?) {

        onBackPressedDispatcher.addCallback {

        }

    }




}