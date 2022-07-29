package com.rafif.recyclerview.secondrecyclerview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Image(
    val title: String,
    val imageSrc: Int
) : Parcelable
