package com.tecsup.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuPrincipalScreen(navController: NavController) {

    Scaffold(

        topBar = {
            TopAppBar(
                title = {
                    Text("GymTrackerPro")
                }
            )
        }

    ) { padding ->

        Column(
            modifier = Modifier
                .padding(padding)
                .padding(20.dp)
        ) {

            Button(
                onClick = {
                    navController.navigate("agregar_rutina")
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Agregar Rutina")
            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = {
                    navController.navigate("lista_rutinas")
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Ver Rutinas")
            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = {
                    navController.navigate("perfil")
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Perfil")
            }
        }
    }
}
