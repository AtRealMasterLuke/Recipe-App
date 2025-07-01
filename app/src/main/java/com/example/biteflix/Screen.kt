package com.example.biteflix

//This class takes care of the individual routes
sealed class Screen(val route: String) {
object RecipeUIScreen: Screen("RecipeUIScreen")
    object CategoryDetailsUI: Screen("CategoryDetailsUI")
}