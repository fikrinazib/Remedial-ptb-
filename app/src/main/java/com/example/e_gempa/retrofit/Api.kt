package com.example.e_gempa.retrofit

import com.example.e_gempa.detailGempa.DetailResponse
import com.example.e_gempa.listGempa.ListGempaResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface Api {
    @GET("feed/v1.0/summary/2.5_day.geojson")
    fun getData(): Call<ListGempaResponse>

    @GET("feed/v1.0/detail/{id_gempa}.geojson")
    fun getDetail(@Path("id_gempa") id : String?): Call<DetailResponse>
}