package com.example.e_gempa.listGempa

import com.google.gson.annotations.SerializedName

data class ListGempaResponse(

    @field:SerializedName("features")
    val features: List<FeaturesItem?>? = null,

    @field:SerializedName("metadata")
    val metadata: Metadata? = null,

    @field:SerializedName("bbox")
    val bbox: List<Any?>? = null,

    @field:SerializedName("type")
    val type: String? = null
)