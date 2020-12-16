package com.olq.main.home

import androidx.lifecycle.MutableLiveData
import com.olq.base.app.BaseViewModel
import com.olq.base.bean.ArticleBean
import com.olq.base.bean.BaseBean
import com.olq.base.bean.CBean
import com.olq.base.bean.ListBean
import com.olq.base.loader.BaseUrl
import com.olq.base.loader.sendByGet
import com.olq.main.bean.CategoryBean

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
    val categoryLiveDate: MutableLiveData<List<CategoryBean>> by lazy {
        MutableLiveData<List<CategoryBean>>()
    }


    fun getArticleList(){
        sendByGet(BaseUrl.CATEGORY,categoryLiveDate)
//        sendByGet(BaseUrl.BANNER,liveDate);
//        sendByGet(BaseUrl.ARTICLE_LIST,articleLiveDate);
////        sendByGet(BaseUrl.TOP,liveDateBean);
//        sendByGet(BaseUrl.TOP,bannerLiveData);

//        sendByGetString(BaseUrl.CATEGORY)

    }


}