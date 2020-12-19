package com.olq.main.launch

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.olq.base.ViewPagerAdapter
import com.olq.base.app.BaseFragment
import com.olq.base.app.BaseViewModel
import com.olq.main.R
import com.olq.main.databinding.MainFragmentBinding
import com.olq.main.home.FoundFragment
import com.olq.main.home.HomeFragment
import com.olq.main.home.PersonalFragment

class MainFragment : BaseFragment<BaseViewModel,MainFragmentBinding>() {

    companion object {
        fun newInstance() = MainFragment()
    }

    override fun getLayoutVb(): MainFragmentBinding {
        return MainFragmentBinding.inflate(layoutInflater)
    }

    //接收传值
//    val args: MainFragmentArgs by navArgs()



    override fun initView(view: View, savedInstanceState: Bundle?) {
        super.initView(view, savedInstanceState)
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