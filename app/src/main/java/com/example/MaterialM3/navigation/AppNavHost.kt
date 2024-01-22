package com.example.MaterialM3.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.MaterialM3.ui.theme.Register.RegisterScreen
import com.example.MaterialM3.ui.theme.badge.BadgeM3
import com.example.MaterialM3.ui.theme.checkbox.CheckboxM3
import com.example.MaterialM3.ui.theme.menu.MenusM3


@Composable
fun AppNavHost
(modifier: Modifier = Modifier, navController: NavHostController = rememberNavController(),
               startDestination: String= ROUTE_MENU)
{
    NavHost(navController = navController,
        modifier = Modifier,
        startDestination = startDestination)
    {
        composable(ROUTE_MENU){
            MenusM3(navController)
        }
        composable(ROUTE_BADGE){
            BadgeM3(navController )
        }
        composable(ROUTE_CHECKBOX){
            CheckboxM3()
        }

        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }
    }
}


