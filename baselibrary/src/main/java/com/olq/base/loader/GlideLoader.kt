package com.olq.base

import android.widget.ImageView
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.widget.ImageViewCompat
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide

fun AppCompatImageView.glideLoad(fragment:Fragment,url:String){
    Glide.with(fragment)
        .load(url)
        .into(this);
}