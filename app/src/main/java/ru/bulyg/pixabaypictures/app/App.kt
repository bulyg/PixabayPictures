package ru.bulyg.pixabaypictures.app

import android.app.Application
import androidx.room.Room
import ru.bulyg.pixabaypictures.framework.di.AppComponent
import ru.bulyg.pixabaypictures.framework.di.DaggerAppComponent
import ru.bulyg.pixabaypictures.framework.room.PictureDatabase

class App : Application() {
    lateinit var appComponent: AppComponent
    lateinit var appDatabase: PictureDatabase

    override fun onCreate() {
        super.onCreate()
        initDagger()
        initDatabase()
    }

    private fun initDatabase() {
        appDatabase = Room.databaseBuilder(
            applicationContext,
            PictureDatabase::class.java,
            "picture_database"
        ).build()
    }

    private fun initDagger() {
        appComponent = DaggerAppComponent.builder()
            .build()
    }
}