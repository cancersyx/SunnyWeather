package com.zsf.sunnyweather.logic.model

/**
 * Created by EWorld
 * 2021/7/7
 *
 */
data class Weather(val realtime: RealtimeResponse.Realtime, val daily: DailyResponse.Daily)
