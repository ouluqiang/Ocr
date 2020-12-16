package com.olq.main.home

import android.os.Bundle
import com.olq.base.app.BaseFragment
import com.olq.main.databinding.HomeFragmentBinding
import kotlinx.android.synthetic.main.home_fragment.*

class HomeFragment : BaseFragment<HomeViewModel,HomeFragmentBinding>() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    override fun getLayoutVb(): HomeFragmentBinding {
        return HomeFragmentBinding.inflate(layoutInflater)
    }

//    private  val viewModel: HomeViewModel by viewModels()

//    override fun getLayout(): Int {
//       return R.layout.home_fragment
//    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)





        viewModel.getArticleList()

    }

    override fun initViewModel() {
        super.initViewModel()
        viewModel.categoryLiveDate.observe(viewLifecycleOwner, {
//            ivImage.glideLoad(this,it)
            text.text=it.toString()
        })
    }

}