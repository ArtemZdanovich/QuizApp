package com.example.artemquizapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.artemquizapp.MyApplication
import com.example.artemquizapp.R
import com.example.artemquizapp.viewmodels.QuizViewModel
import com.example.artemquizapp.viewmodels.QuizViewModelFactory

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: QuizViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel =
        ViewModelProvider(this, QuizViewModelFactory((application as MyApplication).repo)).get(
            QuizViewModel::class.java
        )

        setContentView(R.layout.activity_main)
        supportActionBar?.hide()




    }
}