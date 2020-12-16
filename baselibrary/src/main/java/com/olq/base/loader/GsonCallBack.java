package com.olq.base.loader;


import com.olq.base.bean.BaseBean;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import rxhttp.wrapper.utils.GsonUtil;


/**
 * Created by Administrator on 2016/10/20 0020.
 */

public abstract   class GsonCallBack<T> {

    private Type type;



    public Type getType() {
        return type;
    }

//    public GsonCallBack(Type type) {
//        // TODO Auto-generated constructor stub
//        this.type=type;
//    }
    public GsonCallBack() {
        // TODO Auto-generated constructor stub
        //getClass().getGenericSuperclass()返回表示此 Class 所表示的实体（类、接口、基本类型或 void）的直接超类的 Type
        //然后将其转换ParameterizedType。。
        //getActualTypeArguments()返回表示此类型实际类型参数的 Type 对象的数组。
        //[0]就是这个数组中第一个了。。
        //简而言之就是获得超类的泛型参数的实际类型。。
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            this.type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
        } else {
            this.type = Object.class;
        }
    }

    public void onBody(String json) {
        BaseBean bean = GsonUtil.fromJson(json, type);
//        LogExtKt.logE(bean.getErrorCode()+"");
    }


//    @Override
//    public void onBody(String json) {
//        LogUtils.e("接口返回json："+json);
//        if (CharacterUtils.isEmpty(json)){
//            onSuccess((T)json);
//            return;
//        }
//         if (type instanceof Class) {
//            String name =((Class) type).getSimpleName();
//            if (name.equals(String.class.getSimpleName())||name.equals(Object.class.getSimpleName())) {
//                onSuccess((T) json);
//                return;
//            }
//        }
//        T t=GsonUtils.getBeanFromJson(json,type);
//        LogUtils.e("接口返回gson："+t.toString());
//        if (t != null) {
//            onSuccess(t);
//        } else {
//
//        }
//
//    }
//
//    public abstract void onSuccess(T t);
//
//    public void onEmptyData(){
//
//    }
//
//    public void onUploadProgress(long currentSize, long totalSize, float progress){
//        //这里回调下载进度(该回调在主线程,可以直接更新ui)
//
//    }

}
