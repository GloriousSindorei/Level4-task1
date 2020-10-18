package com.example.madlevel4task1

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ProductDao {

    @Query("SELECT * FROM product_table")
    suspend fun getAllProducts(): List<ShoppingItem>

    @Insert
    suspend fun insertProduct(product: ShoppingItem)

    @Delete
    suspend fun deleteProduct(product: ShoppingItem)

    @Query("DELETE FROM product_table")
    suspend fun deleteAllProducts()

}
