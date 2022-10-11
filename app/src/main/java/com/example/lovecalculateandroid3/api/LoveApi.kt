package com.example.lovecalculateandroid3.api

import com.example.lovecalculateandroid3.model.LoveModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface LoveApi {

    @GET("getPercentage")
    fun getCalculateLove(
        @Query("fname") firstName: String,
        @Query("sname") secondName: String,
        @Header("X-RapidAPI-Key")key: String = "d26db9251dmsh537964c235d771ep193165jsnc68953bf554a",
        @Header("'X-RapidAPI-Host")host:String = "love-calculator.p.rapidapi.com"
    ): Call<LoveModel>
}