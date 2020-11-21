package com.olq.ocr.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.olq.ocr.R

/**
 * create 2020/11/21 14:42
 *  create admin
 **/
abstract class BaseFragment : Fragment() {

    abstract fun getLayout():Int

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(getLayout(), container, false)
    }






}