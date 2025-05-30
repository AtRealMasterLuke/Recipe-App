package com.example.biteflix

import retrofit2.Retrofit
import retrofit2.create
import retrofit2.http.GET

private val retrofit = // Stores the Retrofit instance in a private variable so it can be used to create API service interfaces.
    Retrofit.Builder() // Starts building a Retrofit instance.
        .baseUrl("https://www.themealdb.com/api/json/v1/1/") // Sets the base URL of the API. In this case, the base URL is pointing to TheMealDB, which is a public meal recipe API.
        .addConverterFactory(retrofit2.converter.gson.GsonConverterFactory.create()) // Tells Retrofit to use Gson to automatically convert JSON responses into Kotlin data classes.
        .build() // Builds the final Retrofit instance, ready to use.

val recipeService = com.example.biteflix.retrofit.create(APIServices::class.java) // tells Retrofit to create an implementation of the APIServices interface

interface APIServices {
    @GET("categories.php")
    suspend fun getCategories(): CategoriesResponse // This function makes a network request to https://www.themealdb.com/api/json/v1/1/categories.php and returns objects of type CategoriesResponse
}