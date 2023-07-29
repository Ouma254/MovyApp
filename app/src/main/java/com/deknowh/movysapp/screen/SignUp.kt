package com.deknowh.movysapp.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Phone
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
fun SignUp(navController: NavController) {
    val name by remember {
        mutableStateOf("")
    }
    val phone by remember {
        mutableStateOf("")
    }
    val email by remember {
        mutableStateOf("")
    }
    val password by remember {
        mutableStateOf("")
    }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(700.dp)
            .padding(5.dp)
            .background(Color.Transparent),
        contentAlignment = Alignment.Center
    ) {
        Column (
            verticalArrangement = Arrangement.spacedBy(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally
            //modifier = Modifier.background(Color.LightGray)
        ) {
            Row(horizontalArrangement = Arrangement.Center) {
                Text(
                    text = "Sign Up",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.padding(15.dp))
                TextButton(
                    onClick = { navController.navigate("signIn") }
                ) {
                    Text(
                        text = "sign in",
                        fontSize = 20.sp
                    )
                }
            }

            OutlinedTextField(
                value = name,
                onValueChange = {},
                label = {
                    Text(
                        text = "Enter name",
                        color = Color.Blue
                    )
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = "account_name",
                        modifier = Modifier.padding(end = 10.dp)
                    )
                }
            )
            OutlinedTextField(
                value = phone,
                onValueChange = {},
                label = {
                    Text(
                        text = "Enter phone no.",
                        color = Color.Blue
                    )
                },
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Phone,
                        contentDescription = "phone icon",
                        modifier = Modifier
                            .padding(end = 10.dp),
                        tint = Color.Black
                    )
                }
            )
            OutlinedTextField(
                value = email,
                onValueChange = {},
                label = {
                    Text(
                        text = "Enter your password",
                        color = Color.Blue
                    )
                },
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Email,
                        contentDescription = "email_ icon",
                        modifier = Modifier.padding(end = 10.dp),
                        tint = Color.Black
                    )
                }
            )
            OutlinedTextField(
                value = password,
                onValueChange = {},
                label = {
                    Text(text = "Enter password",
                        color = Color.Blue
                    )
                },
                leadingIcon = {
                    Icon(
                        modifier = Modifier.padding(end = 10.dp)   ,
                        imageVector = Icons.Default.Lock,
                        contentDescription = "password icon",
                        tint = Color.Black
                    )
                }
            )
            Spacer(modifier = Modifier.padding(8.dp))
            Button(
                onClick = { navController.navigate("signIn") }
            ) {
                Text(
                    text = "Create Account"
                )
            }
        }
    }
}