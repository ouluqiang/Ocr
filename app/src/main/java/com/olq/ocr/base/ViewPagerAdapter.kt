package com.olq.ocr.base

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

/**
 * create 2020/11/21 17:15
 *  create admin
 **/

class ViewPagerAdapter(fragment: Fragment, var list: List<Fragment>) : FragmentStateAdapter(fragment) {


    override fun getItemCount(): Int {
        return list.size

    }

    override fun createFragment(position: Int): Fragment {
        return list[position]
    }


}