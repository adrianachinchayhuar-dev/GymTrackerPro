package com.tecsup.data.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.tecsup.data.local.dao.UsuarioDao
import com.tecsup.data.local.entity.Usuario

@Database(
    entities = [Usuario::class],
    version = 1
)
abstract class GymDatabase : RoomDatabase() {

    abstract fun usuarioDao(): UsuarioDao

    companion object {

        @Volatile
        private var INSTANCE: GymDatabase? = null

        fun getDatabase(context: Context): GymDatabase {

            return INSTANCE ?: synchronized(this) {

                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    GymDatabase::class.java,
                    "gym_database"
                ).build()

                INSTANCE = instance

                instance
            }
        }
    }
}