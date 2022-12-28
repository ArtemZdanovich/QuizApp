package com.example.artemquizapp.viewmodels

import androidx.lifecycle.ViewModel
import com.example.artemquizapp.model.Repo
import androidx.lifecycle.ViewModelProvider

class QuizViewModelFactory constructor(private val repo: Repo):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if(modelClass.isAssignableFrom(QuizViewModel::class.java)) {
            return QuizViewModel(this.repo) as T
        } else {
            throw IllegalArgumentException("ViewModel not found")
        }
    }
}