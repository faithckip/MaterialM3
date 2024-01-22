@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)

package com.example.MaterialM3.ui.theme.mainNavDrawer

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.MaterialM3.ui.theme.mainNavDrawer.home.HomeScreen
import com.example.MaterialM3.ui.theme.mainNavDrawer.settings.SettingsScreen
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun SampleAppNavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    coroutineScope: CoroutineScope= rememberCoroutineScope(),
    drawerState: DrawerState= rememberDrawerState(initialValue = DrawerValue.Closed),
) {

    val currentNavBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = currentNavBackStackEntry?.destination?.route ?: AllDestinations.HOME
    val navigationActions = remember(navController){
        AppNavigationActions(navController)
    }

    ModalNavigationDrawer(drawerContent = {
    AppDrawer(
        route = currentRoute,
        navigateToHome = {navigationActions.navigateToHome()},
        navigateToSettings = {navigationActions.navigateToSettings()},
        closeDrawer = {coroutineScope.launch { drawerState.close() }},
        modifier = Modifier)},
        drawerState = drawerState) {
        Scaffold (
            topBar = {
                TopAppBar(title = { Text(text = currentRoute)},
                    modifier = Modifier.fillMaxWidth(),
                    navigationIcon = {
                        IconButton(onClick = {
                            coroutineScope.launch { drawerState.open() }
                        },
                            content = {
                                Icon(
                                    imageVector = Icons.Default.Menu,
                                    contentDescription = null
                                )
                            })
                    },
                    colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = MaterialTheme.colorScheme.primaryContainer)
                )
            },
            modifier = Modifier
        ) {
            NavHost(
                navController = navController,
                startDestination =AllDestinations.HOME ,
                modifier = modifier.padding(it) )
            {
                composable(AllDestinations.HOME){
                    HomeScreen()
                }
                composable(AllDestinations.SETTINGS){
                    SettingsScreen()
                }
            }

        }

    }
    
}