package com.hybrid.timedemo.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [Med::class],
    version = 1
)

abstract class MedDB : RoomDatabase(){

    abstract fun getMedDao() : MedDao

    companion object{

        @Volatile private var instance : MedDB? = null

        private val LOCK = Any()

        operator  fun invoke(context: Context) = instance?: synchronized(LOCK){
            instance ?: buildDatabase(context).also {
                instance = it
            }

        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            MedDB::class.java,
            "medDatabase"

        ).build()
    }

}