package com.olq.main.launch

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.olq.base.app.BaseFragment
import com.olq.base.app.BaseViewModel
import com.olq.main.home.HomeFragment
import com.olq.main.MainFragmentArgs
import com.olq.main.home.PersonalFragment
import com.olq.main.R
import com.olq.main.databinding.MainFragmentBinding
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : BaseFragment<BaseViewModel,MainFragmentBinding>() {

    companion object {
        fun newInstance() = MainFragment()
    }

    override fun getLayoutVb(): MainFragmentBinding {
        return MainFragmentBinding.inflate(layoutInflater)
    }

    //接收传值
    val args: MainFragmentArgs by navArgs()



    override fun initView(view: View, savedInstanceState: Bundle?) {
        super.initView(view, savedInstanceState)
        vpView.isUserInputEnabled=false
        //不可变list
//        var list= listOf<Fragment>(HomeFragment.newInstance(),PersonalFragment.newInstance())
        //可变list
        var list= arrayListOf<Fragment>().also {
            it+= HomeFragment.newInstance()
            it+= PersonalFragment.newInstance()
        }
        var adapter= com.olq.base.ViewPagerAdapter(this, list)
        vpView.adapter=adapter
        bnView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.it_main ->{
                    vpView.setCurrentItem(0,false)
                }
                R.id.it_classify ->{
                    vpView.setCurrentItem(1,false)
                }
                R.id.it_found ->{
                    vpView.setCurrentItem(2,false)
                }
                R.id.it_personal ->{
                    vpView.setCurrentItem(3,false)
                }
            }
            return@setOnNavigationItemSelectedListener true
        }
    }





}