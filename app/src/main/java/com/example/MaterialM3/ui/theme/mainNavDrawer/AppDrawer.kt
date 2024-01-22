package com.example.MaterialM3.ui.theme.mainNavDrawer

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.practise.R

@RequiresApi(Build.VERSION_CODES.M)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppDrawer(
    route: String,
    modifier: Modifier=Modifier,
    navigateToHome: () -> Unit ={},
    navigateToSettings: () -> Unit ={},
    closeDrawer: () -> Unit ={}
) {

    ModalDrawerSheet(modifier = Modifier){
        DrawerHeader(modifier)
        Spacer(modifier = Modifier.padding(dimensionResource(id = R.dimen.spacer_padding)))
        NavigationDrawerItem(
            label ={
                Text(
                    text = stringResource(id = R.string.home),
                    style = typography.labelSmall)
            },
            selected = route == AllDestinations.HOME,
            onClick = {
                navigateToHome()
                closeDrawer()
            },

            icon = { androidx.compose.material3.Icon(imageVector = Icons.Default.Home, contentDescription = null)},
            shape = MaterialTheme.shapes.small

        )
        NavigationDrawerItem(
            label ={
                Text(
                    text = stringResource(id = R.string.settings),
                    style = typography.labelSmall)
            },
            selected = route == AllDestinations.SETTINGS,
            onClick = {
                navigateToHome()
                closeDrawer()
            },

            icon = { androidx.compose.material3.Icon(imageVector = Icons.Default.Settings, contentDescription = null)},
            shape = MaterialTheme.shapes.small

        )
        NavigationDrawerItem(
            label ={
                Text(
                    text = stringResource(id = R.string.home),
                    style = typography.labelSmall)
            },
            selected = route == AllDestinations.HOME,
            onClick = {
                navigateToHome()
                closeDrawer()
            },

            icon = { androidx.compose.material3.Icon(imageVector = Icons.Default.Home, contentDescription = null)},
            shape = MaterialTheme.shapes.small

        )
       /* @Composable
        fun NavigationDrawerItem(
            label: @Composable () -> Unit,
            selected: Boolean,
            onClick: () -> Unit,
            modifier: Modifier= Modifier,
            icon: (@Composable()  Unit)? = null,
            badge: (@Composable () -> Unit)? = null,
            shape: Shape = NavigationDrawerTokens.ActiveIndicatorShape.value,




        ){}*/
    }

}

@Composable
fun DrawerHeader(modifier: Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start,
        modifier = modifier
            .background(MaterialTheme.colorScheme.secondary)
            .padding(dimensionResource(id = R.dimen.header_padding))
            .fillMaxWidth()
    ){
        Image(painterResource(id = R.drawable.cat),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = modifier
                .size(dimensionResource(id = R.dimen.header_image_size))
                .clip(CircleShape))
        Spacer(modifier = Modifier.padding(dimensionResource(id = R.dimen.spacer_padding)))

        Text(
            text = stringResource(id = R.string.app_name),
            textAlign = TextAlign.Center,
            style = typography.bodyLarge,
            color = MaterialTheme.colorScheme.onPrimary,
            )

    }

}

@RequiresApi(Build.VERSION_CODES.M)
@Preview
@Composable
fun DrawerHeaderPrev() {
    AppDrawer(modifier = Modifier, route = AllDestinations.HOME)

}
