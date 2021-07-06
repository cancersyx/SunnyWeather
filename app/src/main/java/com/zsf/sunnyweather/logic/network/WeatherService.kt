package com.zsf.sunnyweather.logic.network

import com.zsf.sunnyweather.SunnyWeatherApplication
import com.zsf.sunnyweather.logic.model.DailyResponse
import com.zsf.sunnyweather.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by EWorld
 * 2021/7/7
 *
 */
interface WeatherService {
    //用于获取实时天气信息
    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(
        @Path("lng") lng: String,
        @Path("lat") lat: String
    ): Call<RealtimeResponse>

    //用于获取未来的天气信息
    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/daily.json")
    fun getDailyWeather(@Path("lng") lng: String, @Path("lat") lat: String): Call<DailyResponse>
}