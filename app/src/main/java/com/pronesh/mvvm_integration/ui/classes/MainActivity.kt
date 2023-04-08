package com.pronesh.mvvm_integration.ui.classes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pronesh.mvvm_integration.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}