package com.olq.ocr

import cat.ereza.customactivityoncrash.config.CaocConfig
import com.olq.base.app.BaseApplication
import com.olq.main.launch.LaunchActivity

/**
 * create 2020/12/11 9:27
 *  create admin
 **/
class App : BaseApplication() {

    override fun onCreate() {
        super.onCreate()

        //防止项目崩溃，崩溃后打开错误界面
        CaocConfig.Builder.create()
            .backgroundMode(CaocConfig.BACKGROUND_MODE_SILENT) //default: CaocConfig.BACKGROUND_MODE_SHOW_CUSTOM
            .enabled(false) //是否启用CustomActivityOnCrash崩溃拦截机制 必须启用！不然集成这个库干啥？？？
            .showErrorDetails(false) //是否必须显示包含错误详细信息的按钮 default: true
            .showRestartButton(false) //是否必须显示“重新启动应用程序”按钮或“关闭应用程序”按钮default: true
            .logErrorOnRestart(false) //是否必须重新堆栈堆栈跟踪 default: true
            .trackActivities(true) //是否必须跟踪用户访问的活动及其生命周期调用 default: false
            .minTimeBetweenCrashesMs(2000) //应用程序崩溃之间必须经过的时间 default: 3000
//            .errorDrawable(R.drawable.ic_custom_drawable) //default: bug image
            .restartActivity(LaunchActivity::class.java)  // 重启的activity
            .errorActivity(LaunchActivity::class.java) //发生错误跳转的activity
                .eventListener(null) //允许你指定事件侦听器，以便在库显示错误活动 default: null
                .apply();
    }


}