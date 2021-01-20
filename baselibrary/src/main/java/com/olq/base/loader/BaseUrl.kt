package com.olq.base.loader

/**
 * create 2020/12/8 16:39
 *  create admin
 **/
object BaseUrl {

//    @DefaultDomain //通过该注解设置默认域名
//    val URL="https://www.wanandroid.com/"

    // name 参数在这会生成 setDomainToGoogleIfAbsent方法，可随意指定名称
    // className 参数在这会生成RxGoogleHttp类，可随意指定名称
    //@Domain(name = "", className = "Google")
    val URL="https://www.wanandroid.com/"


    // 首页文章列表
    var ARTICLE_LIST="${URL}article/list/0/json"
//    // 首页banner
    var BANNER="${URL}banner/json"
//    //top
//    var TOP="${URL}article/top/json"


//    val URL="http://api.rubymmm.com/api/"

    //获取全部类目
//    val CATEGORY="${URL}Client/Category"
}