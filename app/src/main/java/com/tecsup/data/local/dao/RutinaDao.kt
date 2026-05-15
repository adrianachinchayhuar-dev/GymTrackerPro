package com.tecsup.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.tecsup.data.local.entity.Rutina

@Dao
interface RutinaDao {

    @Insert
    suspend fun insertarRutina(rutina: Rutina)

    @Query("""
        SELECT * FROM Rutina
        WHERE usuario_id = :usuarioId
    """)
    suspend fun obtenerRutinas(usuarioId: Int): List<Rutina>

    @Update
    suspend fun actualizarRutina(rutina: Rutina)

    @Delete
    suspend fun eliminarRutina(rutina: Rutina)

    @Query("""
        SELECT * FROM Rutina
        WHERE id = :id
        LIMIT 1
    """)
    suspend fun obtenerRutinaPorId(id: Int): Rutina?
}