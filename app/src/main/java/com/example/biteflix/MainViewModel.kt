package com.example.biteflix

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch


class MainViewModel : ViewModel() {
    private val _categoryState = mutableStateOf(RecipeState())
    val categoriesState: State<RecipeState> = _categoryState

    // As soon as the MainViewModel is created/initialized, it will immediately call fetchCategories() and start fetching the categories.
    init {
        fetchCategories()
    }

    //func that fetches the categories
    private fun fetchCategories(){
        viewModelScope.launch /* launches a coroutine */{
            // Try to fetch the list of categories from the server. If it works, update the UI state with that list, mark loading as finished, and clear any errors.
            try {
                val response = recipeService.getCategories()
                _categoryState.value = _categoryState.value.copy(
                    list = response.categories, // Sets the list of categories fetched from the API into the state.
                    loading = false, // Signals that loading is done (API call has completed).
                    error = null // Clears any previous errors, because the request was successful.
                )

            } catch (e: Exception){
                Log.e("MainViewModel", "Error fetching categories", e)
                _categoryState.value = _categoryState.value.copy( // copy is used to create a new state based on the existing one, updating only the loading and error fields.
                    loading = false, // means the loading has stopped.
                    error = "Error fetching categories ${e.message}"
                )
            }
        }
    }

    data class RecipeState(val loading: Boolean = true,
        val list: List<Category> = emptyList(),
        val error: String? = null
    )
}