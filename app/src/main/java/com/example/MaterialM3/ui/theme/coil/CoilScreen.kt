package com.example.MaterialM3.ui.theme.coil

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.rememberImagePainter

@Composable
fun CoilScreen() {


    val painter = rememberImagePainter(data = "https://images.unsplash.com/photo-1628373383885-4be0bc0172fa?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1301&q=80")

    Image(
        painter = painter,
        contentDescription = "Cat",
        modifier = Modifier. fillMaxSize(),
        contentScale = ContentScale.Crop)

}

@Preview
@Composable
fun coilprev() {

    CoilScreen()

}