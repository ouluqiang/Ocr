package com.olq.ocr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.olq.ocr.base.BaseActivity
import com.olq.ocr.base.BaseViewModel
import com.olq.ocr.ui.main.MainFragment

class MainActivity : BaseActivity<BaseViewModel>() {
    override fun getLayout(): Int {
       return R.layout.main_activity
    }


}