package com.example.e_gempa.retrofit

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retrofit {
    fun getInterceptor() : OkHttpClient {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY
        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()
        return  okHttpClient
    }

    fun getRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl("https://earthquake.usgs.gov/earthquakes/")
            .addConverterFactory( GsonConverterFactory.create())
            .client(getInterceptor())
            .build()
    }

    fun getService() = getRetrofit().create(Api::class.java)
}
