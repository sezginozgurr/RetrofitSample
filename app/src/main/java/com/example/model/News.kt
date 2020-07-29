package com.example.model

import com.google.gson.annotations.SerializedName


data class News(
    @SerializedName("id")
    var id: Int,

    @SerializedName("name")
    var name: Int,

    @SerializedName("author")
    var author: Int,

    @SerializedName("title")
    var title: Int,

    @SerializedName("url")
    var url: Int,

    @SerializedName("urlToImage")
    var urlToImage: Int,

    @SerializedName("publishedAt")
    var publishedAt: Int,

    @SerializedName("content")
    var content: Int
) {

}
