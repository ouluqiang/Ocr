package com.olq.main.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.olq.base.app.BaseViewModel

class FoundViewModel : BaseViewModel() {
    // TODO: Implement the ViewModel

   private val user:MutableLiveData<String> by lazy {
        MutableLiveData<String>().also{
            loadUser()
        }
    }

    fun getUser():LiveData<String>{
        return user
    }

    fun loadUser(){
//       user.value="aaaa"
    }


}