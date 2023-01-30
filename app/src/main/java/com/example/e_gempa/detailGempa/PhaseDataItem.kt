package com.example.e_gempa.detailGempa

import com.google.gson.annotations.SerializedName

data class PhaseDataItem(

    @field:SerializedName("indexTime")
    val indexTime: Long? = null,

    @field:SerializedName("code")
    val code: String? = null,

    @field:SerializedName("contents")
    val contents: Contents? = null,

    @field:SerializedName("indexid")
    val indexid: String? = null,

    @field:SerializedName("preferredWeight")
    val preferredWeight: Int? = null,

    @field:SerializedName("updateTime")
    val updateTime: Long? = null,

    @field:SerializedName("id")
    val id: String? = null,

    @field:SerializedName("source")
    val source: String? = null,

    @field:SerializedName("type")
    val type: String? = null,

    @field:SerializedName("properties")
    val properties: Properties? = null,

    @field:SerializedName("status")
    val status: String? = null
)