package com.olq.base

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

/**
 * create 2020/11/21 17:15
 *  create admin
 **/

class ViewPagerAdapter : FragmentStateAdapter {

    var list: List<Fragment> = arrayListOf()

    constructor(fragmentActivity:FragmentActivity,  list: List<Fragment>):super(fragmentActivity){
        this.list=list;
    }
    constructor(fragment:Fragment,  list: List<Fragment>):super(fragment){
        this.list=list;
    }

    override fun getItemCount(): Int {
        return list.size

    }

    override fun createFragment(position: Int): Fragment {
        return list[position]
    }



}