package com.olq.base.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.olq.base.getClassType

/**
 * create 2020/11/21 14:42
 *  create admin
 **/
abstract class BaseFragment<VM : BaseViewModel, VB : ViewBinding> : Fragment() {

    lateinit var bind:VB
    lateinit var viewModel:VM
    abstract fun getLayoutVb():VB

    //open 表示允许创建任意的子类并重写方法
    //控件初始化
    open fun initView(view: View, savedInstanceState: Bundle?){}
    //activity初始化完成
    open fun initViewModel(){}

    init {

    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        bind=getLayoutVb()
        return bind.root
//        return inflater.inflate(getLayout(), container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView(view, savedInstanceState)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel= ViewModelProvider(this).get(getClassType(this,0))
        initViewModel()
    }


}