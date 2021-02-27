package ru.bulyg.pixabaypictures.framework.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [PictureEntity::class], version = 1, exportSchema = false)
abstract class PictureDatabase : RoomDatabase() {
    abstract fun pictureDao(): PictureDao
}