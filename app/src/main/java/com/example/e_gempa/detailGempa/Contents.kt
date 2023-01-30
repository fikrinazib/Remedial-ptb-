package com.example.e_gempa.detailGempa

import com.google.gson.annotations.SerializedName

data class Contents(

    @field:SerializedName("quakeml.xml")
    val quakemlXml: QuakemlXml? = null,

    @field:SerializedName("contents.xml")
    val contentsXml: ContentsXml? = null
)