package com.olq.main.home

import androidx.lifecycle.MutableLiveData
import com.olq.base.app.BaseViewModel
import com.olq.main.bean.CategoryBean

class FoundViewModel : BaseViewModel() {
    // TODO: Implement the ViewModel

    val categoryLiveDate: MutableLiveData<List<CategoryBean>> by lazy {
        MutableLiveData<List<CategoryBean>>()
    }


    fun getArticleList(){
//        sendByGet(BaseUrl.CATEGORY,categoryLiveDate)

    }

//   private val user:MutableLiveData<String> by lazy {
//        MutableLiveData<String>().also{
//            loadUser()
//        }
//    }
//
//    fun getUser():LiveData<String>{
//        return user
//    }
//
//    fun loadUser(){
////       user.value="aaaa"
//    }


}