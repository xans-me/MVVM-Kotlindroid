package com.ichsan.kotlinmvvmarch.ui.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ichsan.kotlinmvvmarch.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TodoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo)
    }
}