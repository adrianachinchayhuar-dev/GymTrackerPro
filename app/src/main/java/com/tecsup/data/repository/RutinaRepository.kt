package com.tecsup.data.repository

import com.tecsup.data.local.dao.RutinaDao
import com.tecsup.data.local.entity.Rutina

class RutinaRepository(
    private val rutinaDao: RutinaDao
) {

    suspend fun insertarRutina(rutina: Rutina) {
        rutinaDao.insertarRutina(rutina)
    }

    suspend fun obtenerRutinas(
        usuarioId: Int
    ): List<Rutina> {

        return rutinaDao.obtenerRutinas(usuarioId)
    }

    suspend fun actualizarRutina(rutina: Rutina) {
        rutinaDao.actualizarRutina(rutina)
    }

    suspend fun eliminarRutina(rutina: Rutina) {
        rutinaDao.eliminarRutina(rutina)
    }

    suspend fun obtenerRutinaPorId(
        id: Int
    ): Rutina? {

        return rutinaDao.obtenerRutinaPorId(id)
    }
}