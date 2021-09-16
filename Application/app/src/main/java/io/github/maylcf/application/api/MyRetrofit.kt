package io.github.maylcf.application.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MyRetrofit {
    private val retrofit: Retrofit

    fun productApi(): ProductApi {
        return retrofit.create(ProductApi::class.java)
    }

    init {
        retrofit =
            Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

    companion object {
        private const val baseUrl =
            "https://uniqueandrocode.000webhostapp.com/hiren/androidtutorial/mycart/"

        var myRetrofit: MyRetrofit? = null

        @get:Synchronized
        val instance: MyRetrofit?
            get() {
                if (myRetrofit == null) {
                    myRetrofit = MyRetrofit()
                }
                return myRetrofit
            }
    }
}