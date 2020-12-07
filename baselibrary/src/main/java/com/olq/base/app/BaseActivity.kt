package com.olq.base.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.olq.base.getClassType
import java.lang.reflect.GenericArrayType
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type
import java.lang.reflect.TypeVariable

/**
 * create 2020/11/21 14:42
 *  create admin
 **/

abstract class BaseActivity<VM : BaseViewModel, VB : ViewBinding> : AppCompatActivity(){

    lateinit var bind:VB
    lateinit var viewModel:VM

//    open fun getLayout():Int{return 0}
    abstract fun getLayoutVb():VB


    abstract fun init(savedInstanceState: Bundle?)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind=getLayoutVb()
        setContentView(bind.root)
       viewModel= ViewModelProvider(this).get(getClassType(this,0))
        init(savedInstanceState)
//        if (savedInstanceState == null) {
//            supportFragmentManager.beginTransaction()
//                    .replace(R.id.container, MainFragment.newInstance())
//                    .commitNow()
//        }
    }



    fun getType(o: Any): Type {
       var type = o.javaClass.genericSuperclass
        when (type) {
            is ParameterizedType -> {
                return getGenericType(type)
            }
            is TypeVariable<*> -> {
                return getType(type.bounds[0])
            }
        }
        return type
    }

    fun getGenericType(type: ParameterizedType): Type {
        if (type.actualTypeArguments.isEmpty()) return type
        val actualType = type.actualTypeArguments[0]
        when (actualType) {
            is ParameterizedType -> {
                return actualType.rawType
            }
            is GenericArrayType -> {
                return actualType.genericComponentType
            }
            is TypeVariable<*> -> {
                return getType(actualType.bounds[0])
            }
        }
        return actualType
    }


}