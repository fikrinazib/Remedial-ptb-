package com.example.e_gempa.detailGempa

import com.google.gson.annotations.SerializedName

data class Geometry(

    @field:SerializedName("coordinates")
    val coordinates: List<Any?>? = null,

    @field:SerializedName("type")
    val type: String? = null
)