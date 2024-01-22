@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.MaterialM3.ui.theme.topappbar

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyTopAppBar() {
    var favorite by remember { mutableStateOf(false) }
    
    Scaffold (
        topBar = {
            LargeTopAppBar(title = { Text(text = "My Notes") },
                navigationIcon = {
                    IconButton(onClick = { /*handle navigation click */ }) {
                        Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")

                    }
                },
                actions = {
                    IconButton(onClick = { favorite = !favorite }) {
                        Icon(
                            imageVector = if (favorite) Icons.Default.Favorite else Icons.Default.FavoriteBorder,
                            contentDescription = if (favorite) "Unmark as favorite" else "Mark as favorite"
                        )
                    }
                    IconButton(onClick = { /* Handle edit click*/ }) {
                       Icon(imageVector = Icons.Default.Edit, contentDescription = "Edit notes")

                    }
                    IconButton(onClick = { /* Handle edit click*/ }) {
                        Icon(imageVector = Icons.Default.Email, contentDescription = "Email notes")

                }}

            )
        }
    )
    {innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ){
            items(100){
                index->
                Text(text = "Item $index",
                    modifier = Modifier.padding(16.dp))

            }
        }
        
    }
    
}

@Preview
@Composable
fun mytopPrev() {

    MyTopAppBar()
}