package com.codingwithjks.furnitureapp.data.splash.data

import androidx.annotation.DrawableRes
import com.codingwithjks.furnitureapp.R

data class Page(
    @DrawableRes val image: Int,
    val title: String,
    val description: String
)


val pageData = arrayOf(
    Page(
        R.drawable.page1,
        "Office Furniture",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
    ),
    Page(
        R.drawable.page2,
        "Relaxing Furniture",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
    ),
    Page(
        R.drawable.page3,
        "Home Furniture",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
    )
)