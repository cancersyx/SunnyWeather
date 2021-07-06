package com.zsf.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * Created by EWorld
 * 2021/7/1
 *
 */
class SunnyWeatherApplication: Application() {
    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context

        // TODO: 2021/7/1  申请的令牌
        const val TOKEN = ""
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}