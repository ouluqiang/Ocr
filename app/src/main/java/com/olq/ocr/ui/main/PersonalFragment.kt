package com.olq.ocr.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.olq.ocr.R
import com.olq.ocr.base.BaseFragment

class PersonalFragment : BaseFragment() {

    companion object {
        fun newInstance() = PersonalFragment()
    }

    private lateinit var viewModel: PersonalViewModel
    override fun getLayout(): Int {
        return R.layout.personal_fragment
    }

//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        return inflater.inflate(R.layout.personal_fragment, container, false)
//    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PersonalViewModel::class.java)
        // TODO: Use the ViewModel
    }

}