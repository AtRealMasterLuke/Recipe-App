package com.example.biteflix

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun RecipeScreen(
    modifier: Modifier = Modifier
){
    val recipeViewModel: MainViewModel = viewModel()
    val viewState by recipeViewModel.categoriesState
    
    Box(modifier = Modifier.fillMaxSize()){
        //while loading display the `CircularProgressIndicator` otherwise display the categories
        when{
            viewState.loading -> {
                CircularProgressIndicator(modifier.align(Alignment.Center))
            }
            //what should happen when we have an error
            viewState.error != null -> {
                Text(text = viewState.error ?: "An unexpected error occurred.")
            }

            else ->{
                //Display categories
            }
        }
    }
}