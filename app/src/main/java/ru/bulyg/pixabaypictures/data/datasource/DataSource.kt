package ru.bulyg.pixabaypictures.data.datasource

interface DataSource<T> {
    fun getDataFromDataSource(): T
}