package com.olq.main

import androidx.lifecycle.MutableLiveData
import com.olq.base.app.BaseViewModel
import com.olq.base.bean.ArticleBean
import com.olq.base.bean.BaseBean
import com.olq.base.bean.CBean
import com.olq.base.bean.ListBean
import com.olq.base.loader.BaseUrl
import com.olq.base.loader.sendByGet

class HomeViewModel : BaseViewModel() {
    // TODO: Implement the ViewModel

    val liveDate: MutableLiveData<BaseBean<String>> by lazy {
        MutableLiveData<BaseBean<String>>()
    }
    val articleLiveDate: MutableLiveData<ListBean<ArticleBean>> by lazy {
        MutableLiveData<ListBean<ArticleBean>>()
    }
    val bannerLiveData: MutableLiveData<List<CBean>> by lazy {
        MutableLiveData<List<CBean>>()
    }
    val a: MutableLiveData<List<ArticleBean>> by lazy {
        MutableLiveData<List<ArticleBean>>()
    }


    fun getArticleList(){
        sendByGet(BaseUrl.ARTICLE_LIST,articleLiveDate)
//        sendByGet(BaseUrl.BANNER,liveDate);
//        sendByGet(BaseUrl.ARTICLE_LIST,articleLiveDate);
////        sendByGet(BaseUrl.TOP,liveDateBean);
//        sendByGet(BaseUrl.TOP,bannerLiveData);


    }


}