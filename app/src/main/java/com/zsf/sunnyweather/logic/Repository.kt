package com.zsf.sunnyweather.logic

import androidx.lifecycle.liveData
import com.zsf.sunnyweather.logic.model.Place
import com.zsf.sunnyweather.logic.network.SunnyWeatherNetwork
import kotlinx.coroutines.Dispatchers

/**
 * Created by EWorld
 * 2021/7/1
 * 仓库层的统一封装入口
 */
object Repository {
    /**
     * 仓库中定义的方法，为了能够将异步的数据以响应式方式通知上层，通常返回LiveData对象
     */
    fun searchPlaces(query: String) = liveData(Dispatchers.IO) {
        val result = try {
            val placeResponse = SunnyWeatherNetwork.searchPlaces(query)
            if (placeResponse.status == "ok") {
                val places = placeResponse.places
                Result.success(places)
            } else {
                Result.failure(RuntimeException("response status is ${placeResponse.status}"))
            }
        } catch (e: Exception) {
            Result.failure<List<Place>>(e)
        }
        emit(result)
    }
}