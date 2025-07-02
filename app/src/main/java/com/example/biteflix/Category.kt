package com.example.biteflix

import android.os.Parcelable


@kotlinx.parcelize.Parcelize
data class Category(val idCategory: String, val strCategory: String,
    val strCategoryThumb: String, val strCategoryDescription: String): Parcelable

data class CategoriesResponse(val categories: List<Category>)