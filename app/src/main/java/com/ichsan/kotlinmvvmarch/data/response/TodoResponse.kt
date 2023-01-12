package com.ichsan.kotlinmvvmarch.data.response

import com.google.gson.annotations.SerializedName

data class TodoResponse (
    @field:SerializedName("userId")
    val userID : Int,

    @field:SerializedName("id")
    val id : Int,

    @field:SerializedName("title")
    val title: String,

    @field:SerializedName("completed")
    val isCompleted: Boolean = false
)
