package com.example.lovecalculateandroid3.room

import androidx.room.Dao
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.lovecalculateandroid3.model.LoveModel

@Database(entities = [LoveModel::class], version = 1)
abstract class AppDataBase: RoomDatabase() {

    abstract fun loveDao(): Dao

}