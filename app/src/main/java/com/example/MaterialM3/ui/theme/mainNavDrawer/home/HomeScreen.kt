package com.example.MaterialM3.ui.theme.mainNavDrawer.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen() {
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        
    ){
       Text(text = "Home Screen", style = MaterialTheme.typography.headlineMedium )
        Text(
            text = "Design coming up soon" ,
            style = MaterialTheme.typography.bodyLarge)
    }
    
}

@Preview
@Composable
fun HomeScreenPrev() {

    HomeScreen()

}