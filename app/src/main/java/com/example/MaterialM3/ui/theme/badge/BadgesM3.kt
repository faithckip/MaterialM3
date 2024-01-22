@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)

package com.example.MaterialM3.ui.theme.badge

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun BadgeM3(navController: NavHostController) {
    BadgedBox(badge = {
        Badge {
            Text(text = "99+") }
    }) {
        Icon(imageVector = Icons.Default.Favorite,
            contentDescription = "Favorite",
            modifier = Modifier.size(40.dp))

    }

}

@Preview
@Composable
fun Badgeprev() {

    BadgeM3(rememberNavController())

}