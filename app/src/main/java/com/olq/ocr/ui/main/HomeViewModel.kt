package com.olq.ocr.ui.main

import androidx.lifecycle.*
import com.olq.base.app.BaseUrl
import com.olq.base.app.BaseViewModel
import com.olq.base.sendByGet

class HomeViewModel : BaseViewModel() {
    // TODO: Implement the ViewModel

    val liveDate: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
//        get() {}
//        set(value) {
//             value="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1606068476821&di=78200ed8bf1729cff3c667131da92e5f&imgtype=0&src=http%3A%2F%2Fmedia-cdn.tripadvisor.com%2Fmedia%2Fphoto-s%2F01%2F3e%2F05%2F40%2Fthe-sandbar-that-links.jpg"
//
//        }


    fun getToken(){
        sendByGet(BaseUrl.BASE_TOKEN,liveDate);

    }


}