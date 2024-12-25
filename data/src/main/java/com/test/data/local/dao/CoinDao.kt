package com.test.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.test.data.local.entity.CoinEntity

@Dao
interface CoinDao {
//    @Query()
//    suspend fun getCoinById(userId: Int): CoinEntity?
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    suspend fun insertUser(user: CoinEntity)
}