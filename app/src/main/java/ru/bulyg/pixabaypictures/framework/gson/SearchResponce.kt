package ru.bulyg.pixabaypictures.framework.gson

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Hits(
    @Expose
    @SerializedName(value = "hits") val hits: List<TopPicture>
)

data class TopPicture(
    @Expose
    @SerializedName("webformatURL") val webformatURL: String
)