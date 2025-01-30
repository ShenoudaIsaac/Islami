package com.shnsh.islami.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class QuranData(
    val surasSorting:Int,
    val arSurasName:String,
    val enSurasName:String,
    val numOfVerses:String
):Parcelable
