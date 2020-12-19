package com.olq.main.home

import com.olq.base.app.BaseFragment
import com.olq.main.databinding.FragmentFoundBinding

class FoundFragment private constructor(): BaseFragment<FoundViewModel,FragmentFoundBinding>() {

    companion object {
        fun newInstance() = FoundFragment()
    }

    override fun getLayoutVb(): FragmentFoundBinding {
        return FragmentFoundBinding.inflate(layoutInflater)
    }




}