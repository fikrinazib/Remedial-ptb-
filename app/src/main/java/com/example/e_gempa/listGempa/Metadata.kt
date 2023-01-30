package com.example.e_gempa.listGempa

import com.google.gson.annotations.SerializedName

data class Metadata(

    @field:SerializedName("generated")
    val generated: Long? = null,

    @field:SerializedName("count")
    val count: Int? = null,

    @field:SerializedName("api")
    val api: String? = null,

    @field:SerializedName("title")
    val title: String? = null,

    @field:SerializedName("url")
    val url: String? = null,

    @field:SerializedName("status")
    val status: Int? = null
)