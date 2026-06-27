package com.example.api_project_prac

import com.example.api_project_prac.api_files.MyData
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("products")
    fun getProductData(): Call<MyData>
}