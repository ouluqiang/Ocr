package com.olq.ocr.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.olq.ocr.R
import com.olq.ocr.base.BaseFragment
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : BaseFragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    //接收传值
    val args:MainFragmentArgs by navArgs()


    override fun getLayout(): Int {
        return R.layout.main_fragment
    }

    override fun initView(view: View, savedInstanceState: Bundle?) {
        super.initView(view, savedInstanceState)
        vpView.isUserInputEnabled=false
        var list= arrayListOf<Fragment>().also {
            it.add(HomeFragment.newInstance())
            it.add(PersonalFragment.newInstance())
        }
        var adapter=FragmentAdapter(this,list)
        vpView.adapter=adapter
        bnView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.it_main->{
                    vpView.setCurrentItem(0,false)
                }
                R.id.it_personal->{
                    vpView.setCurrentItem(1,false)
                }
            }
            return@setOnNavigationItemSelectedListener true
        }
    }

    override fun initViewModel(savedInstanceState: Bundle?) {
        super.initViewModel(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }




}