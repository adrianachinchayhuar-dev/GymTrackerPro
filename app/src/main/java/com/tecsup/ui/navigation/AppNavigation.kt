package com.tecsup.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.tecsup.ui.screens.LoginScreen
import com.tecsup.ui.screens.RegistroScreen
import com.tecsup.ui.screens.MenuPrincipalScreen


@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "login"
    ) {

        composable("login") {
            LoginScreen(navController)
        }

        composable("registro") {
            RegistroScreen(navController)
        }

        composable("menu") {
            MenuPrincipalScreen(navController)
        }

        composable("agregar_rutina") {
            AgregarRutinaScreen(navController)
        }

        composable("lista_rutinas") {
            ListaRutinasScreen(navController)
        }

        composable("detalle_rutina") {
            DetalleRutinaScreen(navController)
        }

        composable("perfil") {
            PerfilUsuarioScreen(navController)
        }
    }
}