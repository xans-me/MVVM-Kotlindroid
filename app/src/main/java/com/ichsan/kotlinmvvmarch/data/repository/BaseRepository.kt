package com.ichsan.kotlinmvvmarch.data.repository

import com.ichsan.kotlinmvvmarch.data.network.BaseApi
import com.ichsan.kotlinmvvmarch.data.network.SafeApiCall


abstract class BaseRepository(private val api: BaseApi) : SafeApiCall {

}