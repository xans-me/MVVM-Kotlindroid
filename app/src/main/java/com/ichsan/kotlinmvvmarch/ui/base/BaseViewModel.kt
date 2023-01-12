package com.ichsan.kotlinmvvmarch.ui.base

import androidx.lifecycle.ViewModel
import com.ichsan.kotlinmvvmarch.data.repository.BaseRepository

abstract class BaseViewModel(
    private val repository: BaseRepository
) : ViewModel() {}