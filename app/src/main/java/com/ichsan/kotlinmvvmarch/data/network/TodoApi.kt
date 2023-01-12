package com.ichsan.kotlinmvvmarch.data.network

import com.ichsan.kotlinmvvmarch.data.response.TodoResponse
import retrofit2.http.GET

interface TodoApi : BaseApi {
    @GET("todos")
    suspend fun getTodos() : List<TodoResponse>
}