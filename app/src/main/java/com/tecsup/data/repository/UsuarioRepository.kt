package com.tecsup.data.repository

import com.tecsup.data.local.dao.UsuarioDao
import com.tecsup.data.local.entity.Usuario

class UsuarioRepository(
    private val usuarioDao: UsuarioDao
) {

    suspend fun insertarUsuario(usuario: Usuario) {
        usuarioDao.insertarUsuario(usuario)
    }

    suspend fun login(
        usuario: String,
        password: String
    ): Usuario? {

        return usuarioDao.login(usuario, password)
    }

    suspend fun obtenerUsuarios(): List<Usuario> {
        return usuarioDao.obtenerUsuarios()
    }
}