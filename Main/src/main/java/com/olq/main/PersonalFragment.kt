package com.olq.main

import android.os.Bundle
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.olq.base.app.BaseFragment
import kotlinx.android.synthetic.main.personal_fragment.*

class PersonalFragment : BaseFragment<PersonalViewModel>() {

    companion object {
        fun newInstance() = PersonalFragment()
    }

//    private lateinit var viewModel: PersonalViewModel
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