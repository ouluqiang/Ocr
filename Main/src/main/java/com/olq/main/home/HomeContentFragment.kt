package com.olq.main.home

import android.os.Bundle
import com.olq.base.app.BaseFragment
import com.olq.main.databinding.HomeContentFragmentBinding

//私有构造函数
class HomeContentFragment private constructor(): BaseFragment<HomeContentViewModel,HomeContentFragmentBinding>() {

    val PARAM="id"

    companion object {
        fun newInstance(id:Int)=HomeContentFragment().apply {
           arguments= Bundle().apply {
                putInt(PARAM,id)
            }
        }
    }

    override fun getLayoutVb(): HomeContentFragmentBinding {
        return HomeContentFragmentBinding.inflate(layoutInflater)
    }

//    private lateinit var viewModel: HomeContentViewModel

//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        return inflater.inflate(R.layout.home_content_fragment, container, false)
//    }

//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProvider(this).get(HomeContentViewModel::class.java)
//        // TODO: Use the ViewModel
//    }

}