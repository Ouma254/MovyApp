package com.deknowh.movysapp.navGraph

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.deknowh.movysapp.screen.HomeScreen
import com.deknowh.movysapp.screen.LoginScreen
import com.deknowh.movysapp.screen.SignUp
import com.deknowh.movysapp.screen.SplashScreen

@Composable
fun NavigateControl() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash" ) {
        composable("splash") {
            SplashScreen(navController = navController)
        }
        composable("home") {
            HomeScreen(navController = navController)
        }
        composable("signUp") {
            SignUp(navController = navController)
        }
        composable("signIn") {
            LoginScreen(navController = navController)
        }
    }

}