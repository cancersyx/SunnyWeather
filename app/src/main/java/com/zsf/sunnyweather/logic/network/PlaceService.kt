package com.zsf.sunnyweather.logic.network

import com.zsf.sunnyweather.SunnyWeatherApplication
import com.zsf.sunnyweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by EWorld
 * 2021/7/1
 *
 */
interface PlaceService {

    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String):Call<PlaceResponse>
}