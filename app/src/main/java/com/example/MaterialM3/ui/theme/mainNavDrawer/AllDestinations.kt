package com.example.MaterialM3.ui.theme.mainNavDrawer

import androidx.navigation.NavHostController
import com.example.MaterialM3.ui.theme.mainNavDrawer.AllDestinations.HOME
import com.example.MaterialM3.ui.theme.mainNavDrawer.AllDestinations.SETTINGS

object AllDestinations {

    const val HOME = "Home"
    const val SETTINGS = "Settings"
}

class AppNavigationActions(private val navController: NavHostController){

    fun navigateToHome(){
        navController.navigate(HOME){
            popUpTo(HOME)
        }
    }

    fun navigateToSettings(){
        navController.navigate(SETTINGS){
            launchSingleTop = true
            restoreState = true
        }
    }

}