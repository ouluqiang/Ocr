package com.olq.main

import android.os.Bundle
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.olq.base.app.BaseFragment
import com.olq.main.databinding.PersonalFragmentBinding
import kotlinx.android.synthetic.main.personal_fragment.*

class PersonalFragment : BaseFragment<PersonalViewModel,PersonalFragmentBinding>() {

    companion object {
        fun newInstance() = PersonalFragment()
    }


    override fun getLayoutVb(): PersonalFragmentBinding {
        return PersonalFragmentBinding.inflate(layoutInflater)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProvider(this).get(PersonalViewModel::class.java)
        // TODO: Use the ViewModel

        val viewModel: PersonalViewModel by viewModels()
        viewModel.getUser().observe(viewLifecycleOwner,Observer<String>{
            text.text=it
        })
        val homeView: HomeViewModel by viewModels()
        text.setOnClickListener {
            homeView.liveDate.postValue("")
            viewModel.getUser()
        }
    }


}