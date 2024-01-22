package com.example.MaterialM3.ui.theme.mainNavDrawer.settings

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun SettingsScreen() {

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Settings Screen",
            style = MaterialTheme.typography.headlineMedium,
            fontSize = 24.sp,
            color = Color.Green)

        //Spacer to add some space between title and settings
        Spacer(modifier = Modifier.height(16.dp))

        //settings items
        SettingItem("Notification Settings")
        SettingItem("Account Settings")
        SettingItem("Privacy Settings")
        //Add more settings items as needed


    }

}

@Preview(showBackground = true)
@Composable
fun PreviewSettings() {
    SettingsScreen()

}