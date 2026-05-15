package com.tecsup

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.lifecycleScope
import com.tecsup.data.local.database.GymDatabase
import com.tecsup.data.local.entity.Usuario
import com.tecsup.ui.navigation.AppNavigation
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        val database = GymDatabase.getDatabase(this)

        lifecycleScope.launch {

            val usuarioDao = database.usuarioDao()

            usuarioDao.insertarUsuario(
                Usuario(
                    nombre = "Adriana",
                    correo = "adriana@gmail.com",
                    edad = 20
                )
            )

            val usuarios = usuarioDao.obtenerUsuarios()

            Log.d("ROOM_TEST", usuarios.toString())
        }

        setContent {
            AppNavigation()
        }
    }
}