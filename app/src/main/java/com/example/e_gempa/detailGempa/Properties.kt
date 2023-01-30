package com.example.e_gempa.detailGempa

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

    @field:SerializedName("products")
    val products: Products? = null,

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

    @field:SerializedName("updated")
    val updated: Long? = null,

    @field:SerializedName("status")
    val status: String? = null,

    @field:SerializedName("magnitude-type")
    val magnitudeType: String? = null,

    @field:SerializedName("origin-source")
    val originSource: String? = null,

    @field:SerializedName("quakeml-magnitude-publicid")
    val quakemlMagnitudePublicid: String? = null,

    @field:SerializedName("latitude")
    val latitude: String? = null,

    @field:SerializedName("magnitude-num-stations-used")
    val magnitudeNumStationsUsed: String? = null,

    @field:SerializedName("magnitude-source")
    val magnitudeSource: String? = null,

    @field:SerializedName("eventtime")
    val eventtime: String? = null,

    @field:SerializedName("eventsource")
    val eventsource: String? = null,

    @field:SerializedName("latitude-error")
    val latitudeError: String? = null,

    @field:SerializedName("pdl-client-version")
    val pdlClientVersion: String? = null,

    @field:SerializedName("standard-error")
    val standardError: String? = null,

    @field:SerializedName("eventParametersPublicID")
    val eventParametersPublicID: String? = null,

    @field:SerializedName("horizontal-error")
    val horizontalError: String? = null,

    @field:SerializedName("error-ellipse-azimuth")
    val errorEllipseAzimuth: String? = null,

    @field:SerializedName("eventsourcecode")
    val eventsourcecode: String? = null,

    @field:SerializedName("magnitude")
    val magnitude: String? = null,

    @field:SerializedName("longitude-error")
    val longitudeError: String? = null,

    @field:SerializedName("longitude")
    val longitude: String? = null,

    @field:SerializedName("minimum-distance")
    val minimumDistance: String? = null,

    @field:SerializedName("azimuthal-gap")
    val azimuthalGap: String? = null,

    @field:SerializedName("event-type")
    val eventType: String? = null,

    @field:SerializedName("quakeml-origin-publicid")
    val quakemlOriginPublicid: String? = null,

    @field:SerializedName("error-ellipse-minor")
    val errorEllipseMinor: String? = null,

    @field:SerializedName("depth-type")
    val depthType: String? = null,

    @field:SerializedName("error-ellipse-intermediate")
    val errorEllipseIntermediate: String? = null,

    @field:SerializedName("error-ellipse-major")
    val errorEllipseMajor: String? = null,

    @field:SerializedName("error-ellipse-rotation")
    val errorEllipseRotation: String? = null,

    @field:SerializedName("review-status")
    val reviewStatus: String? = null,

    @field:SerializedName("num-phases-used")
    val numPhasesUsed: String? = null,

    @field:SerializedName("num-stations-used")
    val numStationsUsed: String? = null,

    @field:SerializedName("quakeml-publicid")
    val quakemlPublicid: String? = null,

    @field:SerializedName("vertical-error")
    val verticalError: String? = null,

    @field:SerializedName("eventtime-error")
    val eventtimeError: String? = null,

    @field:SerializedName("depth")
    val depth: String? = null,

    @field:SerializedName("evaluation-status")
    val evaluationStatus: String? = null,

    @field:SerializedName("magnitude-error")
    val magnitudeError: String? = null,

    @field:SerializedName("error-ellipse-plunge")
    val errorEllipsePlunge: String? = null,

    @field:SerializedName("version")
    val version: String? = null
)