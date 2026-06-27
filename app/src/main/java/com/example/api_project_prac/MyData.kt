package com.example.api_project_prac

data class MyData(
    val limit: Int,
    val products: List<Product>,
    val skip: Int,
    val total: Int
)