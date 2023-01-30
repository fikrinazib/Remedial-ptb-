package com.example.e_gempa.listGempa

import com.google.gson.annotations.SerializedName

data class Properties(

    @field:SerializedName("dmin")
    val dmin: Any? = null,

    @field:SerializedName("code")
    val code: String? = null,

    @field:SerializedName("sources")
    val sources: String? = null,

    @field:SerializedName("tz")
    val tz: Any? = null,

    @field:SerializedName("mmi")
    val mmi: Any? = null,

    @field:SerializedName("type")
    val type: String? = null,

    @field:SerializedName("title")
    val title: String? = null,

    @field:SerializedName("magType")
    val magType: String? = null,

    @field:SerializedName("nst")
    val nst: Any? = null,

    @field:SerializedName("sig")
    val sig: Int? = null,

    @field:SerializedName("tsunami")
    val tsunami: Int? = null,

    @field:SerializedName("mag")
    val mag: Float? = null,

    @field:SerializedName("alert")
    val alert: Any? = null,

    @field:SerializedName("gap")
    val gap: Any? = null,

    @field:SerializedName("rms")
    val rms: Any? = null,

    @field:SerializedName("place")
    val place: String? = null,

    @field:SerializedName("net")
    val net: String? = null,

    @field:SerializedName("types")
    val types: String? = null,

    @field:SerializedName("felt")
    val felt: Any? = null,

    @field:SerializedName("cdi")
    val cdi: Any? = null,

    @field:SerializedName("url")
    val url: String? = null,

    @field:SerializedName("ids")
    val ids: String? = null,

    @field:SerializedName("time")
    val time: Long? = null,

    @field:SerializedName("detail")
    val detail: String? = null,

    @field:SerializedName("updated")
    val updated: Long? = null,

    @field:SerializedName("status")
    val status: String? = null
)