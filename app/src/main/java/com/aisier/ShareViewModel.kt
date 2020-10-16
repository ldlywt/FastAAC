package com.aisier

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.aisier.architecture.base.BaseViewModel

/**
 * author : wutao
 * e-mail : 670831931@qq.com
 * time   : 2020/10/14
 * desc   : Application级别的ViewModel，全局通用
 * version: 1.0
 */
class ShareViewModel(application: Application) : BaseViewModel(application) {
    val msgLiveData = MutableLiveData<String>()

}