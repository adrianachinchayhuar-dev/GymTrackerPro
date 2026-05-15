package com.tecsup.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.tecsup.data.local.entity.Usuario

@Dao
interface UsuarioDao {

    @Insert
    suspend fun insertarUsuario(usuario: Usuario)

    @Query("SELECT * FROM Usuario")
    suspend fun obtenerUsuarios(): List<Usuario>

    @Query("""
        SELECT * FROM Usuario
        WHERE nombre_usuario = :usuario
        AND password = :password
        LIMIT 1
    """)
    suspend fun login(
        usuario: String,
        password: String
    ): Usuario?
}