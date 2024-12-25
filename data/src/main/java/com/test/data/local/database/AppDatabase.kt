package com.test.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.test.data.local.dao.CoinDao
import com.test.data.local.entity.CoinEntity

@Database(entities = [CoinEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun coinDao() : CoinDao
}