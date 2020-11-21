package com.olq.ocr.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.olq.ocr.R
import kotlinx.android.synthetic.main.launch_fragment.*

class LaunchFragment : Fragment() {

    companion object {
        fun newInstance() = LaunchFragment()
    }

    private lateinit var viewModel: LaunchViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.launch_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LaunchViewModel::class.java)
        // TODO: Use the ViewModel

        text.setOnClickListener {
            var a="hello world"
//            var action=
            //页面跳转
            findNavController().navigate(R.id.mainFragment)
        }
    }

}