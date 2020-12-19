package com.olq.main.launch

import android.os.Bundle
import androidx.navigation.fragment.findNavController
import com.olq.base.app.BaseFragment
import com.olq.base.app.BaseViewModel
import com.olq.main.R
import com.olq.main.databinding.LaunchFragmentBinding

class LaunchFragment : BaseFragment<BaseViewModel,LaunchFragmentBinding>() {

    companion object {
        fun newInstance() = LaunchFragment()
    }

    override fun getLayoutVb(): LaunchFragmentBinding {
        return LaunchFragmentBinding.inflate(layoutInflater)
    }

//    private lateinit var viewModel: LaunchViewModel
//    override fun getLayout(): Int {
//        return R.layout.launch_fragment
//    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProvider(this).get(LaunchViewModel::class.java)
        // TODO: Use the ViewModel

        bind.text.setOnClickListener {
//            var action=
            //页面跳转
            findNavController().navigate(R.id.mainFragment)
            //页面跳转带参数
//           LaunchFragmentDirections.actionLaunchFragmentToMainFragment("hello world",1111111).also {
//               navigation(it)
//           }
        }
    }



}