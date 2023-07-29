package com.deknowh.movysapp.screen

import android.annotation.SuppressLint
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold (
        topBar = {
            TopAppBar(
                title = {

                        Text(text = "Home",
                            color = Color.Blue,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        )
                },
                actions = {
                     IconButton(
                         onClick = { /*TODO*/ }
                     ) {
                         Icon(
                             imageVector = Icons.Default.Menu,
                             contentDescription = "menu icon"
                         )

                     }
                }
            )
        }
    ) {

    }    
}