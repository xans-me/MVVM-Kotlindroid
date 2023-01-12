package com.ichsan.kotlinmvvmarch.di

import android.content.Context
import com.ichsan.kotlinmvvmarch.data.network.RemoteDataSource
import com.ichsan.kotlinmvvmarch.data.network.TodoApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideTodoApi(
        remoteDataSource : RemoteDataSource,
        @ApplicationContext context: Context
    ): TodoApi {
        return remoteDataSource.buildApi(TodoApi::class.java, context)
    }
}