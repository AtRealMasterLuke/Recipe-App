package com.example.biteflix

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun RecipeApp(navController: NavHostController) {
    val recipeViewModel: MainViewModel = viewModel()
    val viewState by recipeViewModel.categoriesState

    NavHost(navController = navController, startDestination = Screen.RecipeUIScreen.route) {
        composable(route = Screen.RecipeUIScreen.route) {
            RecipeScreen(viewState = viewState, navigateToCategoryDetails = {
                navController.currentBackStackEntry?.savedStateHandle?.set("cat", it)
                navController.navigate(Screen.CategoryDetailsUI.route)
            })
        }
        composable(route = Screen.CategoryDetailsUI.route){
            val category = navController.previousBackStackEntry?.savedStateHandle?.get<Category>("cat")?: Category("", "", "", "")
            CategoryDetailScreen(category = category)
        }
    }

}