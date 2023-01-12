package com.ichsan.kotlinmvvmarch.ui.todo

import com.ichsan.kotlinmvvmarch.data.repository.TodoRepository
import com.ichsan.kotlinmvvmarch.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TodoViewModel @Inject constructor(
    private val repository: TodoRepository
) : BaseViewModel(repository) {

    // just because using todo on home page
    fun getTodo() = repository.getTodo()
}