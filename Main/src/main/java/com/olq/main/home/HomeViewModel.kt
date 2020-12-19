package com.olq.main.home

import androidx.lifecycle.MutableLiveData
import com.olq.base.app.BaseViewModel
import com.olq.base.bean.BaseBean
import com.olq.base.loader.BaseUrl
import com.olq.base.loader.sendByGet
import com.olq.main.bean.CategoryBean

class HomeViewModel : BaseViewModel() {
    // TODO: Implement the ViewModel

    val liveDate: MutableLiveData<BaseBean<String>> by lazy {
        MutableLiveData<BaseBean<String>>()
    }

    val categoryLiveDate: MutableLiveData<List<CategoryBean>> by lazy {
        MutableLiveData<List<CategoryBean>>()
    }


    fun getArticleList(){
        sendByGet(BaseUrl.CATEGORY,categoryLiveDate)

    }


}