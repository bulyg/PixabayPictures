package ru.bulyg.pixabaypictures.framework.retrofit

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query
import ru.bulyg.pixabaypictures.framework.gson.Hits

interface ApiService {
    @GET("api")
    fun getPicture(@Query("key") key: String): Observable<Hits>
}