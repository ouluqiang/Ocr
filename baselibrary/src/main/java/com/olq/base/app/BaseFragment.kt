package com.olq.base.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * create 2020/11/21 14:42
 *  create admin
 **/
abstract class BaseFragment<vm : BaseViewModel> : Fragment() {

    //布局
    abstract fun getLayout():Int
    //open 表示允许创建任意的子类并重写方法
    //控件初始化
    open fun initView(view: View, savedInstanceState: Bundle?){}
    //activity初始化完成
    open fun initViewModel(savedInstanceState: Bundle?){}

    init {

    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(getLayout(), container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView(view, savedInstanceState)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initViewModel(savedInstanceState)
    }


}