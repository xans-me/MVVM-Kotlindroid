package com.ichsan.kotlinmvvmarch.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.ichsan.kotlinmvvmarch.data.network.Resource
import com.ichsan.kotlinmvvmarch.data.network.TodoApi
import com.ichsan.kotlinmvvmarch.data.response.TodoResponse
import retrofit2.HttpException
import javax.inject.Inject

class TodoRepository @Inject constructor(
    private val api: TodoApi
) : BaseRepository(api){
    fun getTodo(): LiveData<Resource<List<TodoResponse>>> =
        liveData {
            emit(Resource.Loading)
            try {
                val response = api.getTodos()
                emit(Resource.Success(response))
            } catch (throwable: Throwable) {
                when(throwable){
                    is HttpException -> {
                        emit(Resource.Failure(false, throwable.code(), throwable.response()?.errorBody()))
                    }
                    else -> {
                        emit(Resource.Failure(true, null, null))
                    }
                }
            }
        }

}