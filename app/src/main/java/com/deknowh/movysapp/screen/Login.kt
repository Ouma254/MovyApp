package com.deknowh.movysapp.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavController) {
    val email by remember {
        mutableStateOf("")
    }
    val password by remember {
        mutableStateOf("")
    }
    Box(
        modifier = Modifier
            .height(500.dp)
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Row {
                Text(
                    text = "Login",
                    color = Color.Blue,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            OutlinedTextField(
                value = email,
                onValueChange = {},
                label = {
                    Text(
                        text = "enter email",
                        color = Color.Blue
                    )
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "email logo",
                        modifier = Modifier.padding(end = 10.dp),
                        tint = Color.Black
                    )
                }
            )
            OutlinedTextField(
                value = password,
                onValueChange = {},
                label = {
                    Text(
                        text = "enter password",
                        color = Color.Blue
                    )
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "email logo",
                        modifier = Modifier.padding(end = 10.dp),
                        tint = Color.Black
                    )
                }
            )
            Spacer(modifier = Modifier.padding(10.dp))
            Button(
                onClick = { navController.navigate("home") }
            ) {
                Text(text = "Login", fontWeight = FontWeight.Bold)
            }
            Row {
                Text(text = "Do you have an Account?")
                TextButton(
                    onClick = { navController.navigate("signUp") }
                ) {
                    Text(text = "Sign Up")
                }
            }
        }
    }

}