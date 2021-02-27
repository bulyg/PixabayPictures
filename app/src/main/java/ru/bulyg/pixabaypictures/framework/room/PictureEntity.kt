package ru.bulyg.pixabaypictures.framework.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class PictureEntity(
    @field:PrimaryKey
    @field:ColumnInfo(name = "url") var url: String
)