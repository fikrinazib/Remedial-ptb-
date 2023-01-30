package com.example.e_gempa.detailGempa

import com.google.gson.annotations.SerializedName

data class QuakemlXml(

    @field:SerializedName("length")
    val length: Int? = null,

    @field:SerializedName("lastModified")
    val lastModified: Long? = null,

    @field:SerializedName("contentType")
    val contentType: String? = null,

    @field:SerializedName("url")
    val url: String? = null
)