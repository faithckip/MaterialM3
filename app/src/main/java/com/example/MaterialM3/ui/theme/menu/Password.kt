@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.MaterialM3.ui.theme.menu

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import com.example.practise.R

@ExperimentalMaterial3Api
@Composable
fun PasswordScreen() {
    var passwordVisibility: Boolean by remember{ mutableStateOf(false) }

    TextField(
        value = "Enter Password",
        visualTransformation = if(passwordVisibility)  VisualTransformation.None else PasswordVisualTransformation(),
        leadingIcon = {
                      IconButton(onClick = {
                          passwordVisibility = !passwordVisibility
                      }) {
                          Icon(painter = painterResource(id = R.drawable.ic_visibility) , contentDescription = null)
                      }
        },
        onValueChange = {}) }

    /*var password by rememberSaveable { mutableStateOf(" ") }
    var passwordVisible by rememberSaveable { mutableStateOf("false ") }

    TextField(
        value = password,
        label = { Text( "Password")},
        singleLine = true,
        placeholder = { Text(  text = "Password")},
        visualTransformation = if(passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        trailingIcon = {
            val image = if (passwordVisible) {
                Icons.Filled.Visibility
            }else
                Icons.Filled.VisibilityOff

            // please provide localized description for accessibility services
            val description = if (passwordVisible) "Hide password" else "Show password"

            IconButton(onClick = { passwordVisible = !passwordVisible }) {
                Icon(imageVector = image, contentDescription = null)

            }
        }
    )*/

@Preview
@Composable
fun passprev() {

    PasswordScreen()

}