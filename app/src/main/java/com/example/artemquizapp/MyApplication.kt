package com.example.artemquizapp

import android.app.Application
import com.example.artemquizapp.model.Repo

class MyApplication : Application() {

    lateinit var repo : Repo
    override fun onCreate() {
        super.onCreate()

        repo = Repo()
    }
}