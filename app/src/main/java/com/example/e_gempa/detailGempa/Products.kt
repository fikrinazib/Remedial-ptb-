package com.example.e_gempa.detailGempa

import com.google.gson.annotations.SerializedName

data class Products(

    @field:SerializedName("phase-data")
    val phaseData: List<PhaseDataItem?>? = null,

    @field:SerializedName("origin")
    val origin: List<OriginItem?>? = null
)