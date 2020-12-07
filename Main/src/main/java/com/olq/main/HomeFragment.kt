package com.olq.main

import android.os.Bundle
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.olq.base.app.BaseFragment
import kotlinx.android.synthetic.main.home_fragment.*

class HomeFragment : BaseFragment<HomeViewModel>() {

    companion object {
        fun newInstance() = HomeFragment()
    }

//    private lateinit var viewModel: HomeViewModel
    //
    private  val viewModel: HomeViewModel by viewModels()

    override fun getLayout(): Int {
       return R.layout.home_fragment
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        // TODO: Use the ViewModel


        viewModel.liveDate.observe(viewLifecycleOwner, Observer<String> {
//            ivImage.glideLoad(this,it)
            text.text=it
        })

        ivImage.setOnClickListener {
//            var url="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1606068476821&di=78200ed8bf1729cff3c667131da92e5f&imgtype=0&src=http%3A%2F%2Fmedia-cdn.tripadvisor.com%2Fmedia%2Fphoto-s%2F01%2F3e%2F05%2F40%2Fthe-sandbar-that-links.jpg"
//            viewModel.liveDate.postValue(url)
//            viewModel.liveDate.value = url
            viewModel.getToken()
        }

    }

}