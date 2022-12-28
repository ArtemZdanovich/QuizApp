package com.example.artemquizapp.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.artemquizapp.model.Repo


class QuizViewModel(repo: Repo) : ViewModel(){
    val cn = MutableLiveData(0)
    val listSize = repo.data.size
}