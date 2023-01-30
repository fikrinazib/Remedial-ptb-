package com.example.e_gempa.detailGempa

import com.google.gson.annotations.SerializedName

data class DetailResponse(

    @field:SerializedName("geometry")
    val geometry: Geometry? = null,

    @field:SerializedName("id")
    val id: String? = null,

    @field:SerializedName("type")
    val type: String? = null,

    @field:SerializedName("properties")
    val properties: Properties? = null
)