package com.example.biteflix

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _categoriesState = mutableStateOf(RecipeState()) // creating an internal mutable state that holds a RecipeState object. When you update _categoriesState.value, Compose will recompose any UI that is observing that state.
    data class RecipeState(val loading: Boolean = true,
        val list: List<Category> = emptyList(),
        val error: String? = null
    )
}