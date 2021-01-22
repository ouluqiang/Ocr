package com.olq.main.launch

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.alibaba.android.arouter.facade.annotation.Route
import com.olq.base.ViewPagerAdapter
import com.olq.base.app.BaseActivity
import com.olq.base.app.BaseViewModel
import com.olq.base.router.BaseRouter
import com.olq.main.R
import com.olq.main.databinding.MainActivityBinding
import com.olq.main.home.FoundFragment
import com.olq.main.home.HomeFragment
import com.olq.main.home.PersonalFragment

@Route(path = BaseRouter.MAIN,name = "首页")
class MainActivity : BaseActivity<BaseViewModel, MainActivityBinding>() {


    override fun getLayoutVb(): MainActivityBinding {
       return MainActivityBinding.inflate(layoutInflater)
    }

    override fun init(savedInstanceState: Bundle?) {

//        onBackPressedDispatcher.addCallback {
//
//        }

        bind. vpView.isUserInputEnabled=false
        //不可变list
//        var list= listOf<Fragment>(HomeFragment.newInstance(),PersonalFragment.newInstance())
        //可变list
        var list= arrayListOf<Fragment>().also {
            it+= HomeFragment.newInstance()
            it+= FoundFragment.newInstance()
            it+= HomeFragment.newInstance()
            it+= PersonalFragment.newInstance()
        }
        var adapter= ViewPagerAdapter(this, list)
        bind. vpView.adapter=adapter
        bind.  bnView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.it_main ->{
                    bind.  vpView.setCurrentItem(0,false)
                }
                R.id.it_classify ->{
                    bind. vpView.setCurrentItem(1,false)
                }
                R.id.it_found ->{
                    bind.  vpView.setCurrentItem(2,false)
                }
                R.id.it_personal ->{
                    bind.  vpView.setCurrentItem(3,false)
                }
            }
            return@setOnNavigationItemSelectedListener true
        }
    }




}