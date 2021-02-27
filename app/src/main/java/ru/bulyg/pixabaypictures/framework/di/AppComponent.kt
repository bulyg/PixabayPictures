package ru.bulyg.pixabaypictures.framework.di

import dagger.Component
import ru.bulyg.pixabaypictures.ui.activity.MainActivity
import ru.bulyg.pixabaypictures.framework.di.module.AppModule
import javax.inject.Singleton

@Component(modules = [AppModule::class])
@Singleton
interface AppComponent {
    fun inject(activity: MainActivity)
}