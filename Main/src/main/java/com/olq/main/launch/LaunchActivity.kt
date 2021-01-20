package com.olq.main.launch

import android.content.Intent
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.olq.base.app.BaseActivity
import com.olq.base.app.BaseViewModel
import com.olq.base.router.BaseRouter
import com.olq.main.databinding.ActivityLaunchBinding

@Route(path = BaseRouter.LAUNCH ,name = "启动页")
class LaunchActivity : BaseActivity<BaseViewModel, ActivityLaunchBinding>() {


    override fun getLayoutVb(): ActivityLaunchBinding {
       return ActivityLaunchBinding.inflate(layoutInflater)
    }

    override fun init(savedInstanceState: Bundle?) {
        //防止出现按Home键回到桌面时，再次点击重新进入该界面bug
        if (intent.flags and Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT != 0) {
            finish()
            return
        }

        bind.button.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }


}