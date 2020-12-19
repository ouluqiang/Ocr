package com.olq.main.home

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.olq.base.app.BaseFragment
import com.olq.main.bean.CategoryBean
import com.olq.main.databinding.FragmentFoundBinding

/**
 * 分类
 */
class FoundFragment private constructor(): BaseFragment<FoundViewModel,FragmentFoundBinding>() {

    var listFather= arrayListOf<CategoryBean>()
    var listChild= arrayListOf<CategoryBean>()
    var fatherAdapter: FatherAdapter? =null
    companion object {
        fun newInstance() = FoundFragment()
    }

    override fun getLayoutVb(): FragmentFoundBinding {
        return FragmentFoundBinding.inflate(layoutInflater)
    }

    override fun initView(view: View, savedInstanceState: Bundle?) {
        super.initView(view, savedInstanceState)

      fatherAdapter= context?.let { FatherAdapter(it,listFather) }
        bind.rvFather.layoutManager=LinearLayoutManager(context)
        bind.rvFather.adapter=fatherAdapter
    }

    override fun initViewModel() {
        super.initViewModel()
        viewModel.getArticleList()
        viewModel.categoryLiveDate.observe(viewLifecycleOwner, {
            listFather.clear()
            listChild.clear()
            it.forEach { item->
                    if (item.pid==0){
                        listFather.add(item)
                    }else {
                        listChild.add(item)
                    }
            }
            fatherAdapter?.notifyDataSetChanged()

        })
    }


}