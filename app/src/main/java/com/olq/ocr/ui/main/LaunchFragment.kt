package com.olq.ocr.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.olq.ocr.R
import com.olq.ocr.base.BaseFragment
import com.olq.ocr.base.navigation
import kotlinx.android.synthetic.main.launch_fragment.*

class LaunchFragment : BaseFragment() {

    companion object {
        fun newInstance() = LaunchFragment()
    }

    private lateinit var viewModel: LaunchViewModel
    override fun getLayout(): Int {
        return R.layout.launch_fragment
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LaunchViewModel::class.java)
        // TODO: Use the ViewModel

        text.setOnClickListener {
//            var action=
            //页面跳转
//            findNavController().navigate(R.id.mainFragment)
            //页面跳转带参数
           LaunchFragmentDirections.actionLaunchFragmentToMainFragment("hello world",1111111).also {
               navigation(it)
           }
        }
    }

}