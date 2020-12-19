package com.olq.main.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import com.olq.base.ViewPagerAdapter
import com.olq.base.app.BaseFragment
import com.olq.main.databinding.HomeFragmentBinding

class HomeFragment private constructor(): BaseFragment<HomeViewModel,HomeFragmentBinding>() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    override fun getLayoutVb(): HomeFragmentBinding {
        return HomeFragmentBinding.inflate(layoutInflater)
    }

    var list:MutableList<Fragment> = arrayListOf()
    var title:MutableList<String> = arrayListOf()

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
            list.clear()
            title.clear()
            it.forEach { item->
                list.add(HomeContentFragment.newInstance(item.id))
                title.add(item.name)
                bind.tlLayout.addTab(bind.tlLayout.newTab().setText(item.name))
            }
            bind.vpView.adapter=ViewPagerAdapter(this,list)
            TabLayoutMediator(bind.tlLayout,bind.vpView) { tab, position ->
                tab.text=title[position]

            }.attach()

        })
    }

}