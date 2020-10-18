package com.example.madlevel4task1

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "product_table")
data class ShoppingItem(
    @ColumnInfo(name = "shoppingItem")
    var itemName: String,

    @ColumnInfo(name = "amount")
    var amount: Int,

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null
)