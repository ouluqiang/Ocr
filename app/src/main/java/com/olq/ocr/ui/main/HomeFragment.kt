package com.olq.ocr.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.olq.ocr.R
import com.olq.ocr.base.BaseFragment
import com.olq.ocr.base.glideLoad
import kotlinx.android.synthetic.main.home_fragment.*

class HomeFragment : BaseFragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    private lateinit var viewModel: HomeViewModel
    override fun getLayout(): Int {
       return R.layout.home_fragment
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        // TODO: Use the ViewModel
        var url="https://ouluqiang.github.io//post/markdown-bian-ji-qi-jiao-cheng"
        ivImage.glideLoad(this,url)
    }

}