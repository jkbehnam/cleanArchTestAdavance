package com.example.cleanarchtestadavance.presentation.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.cleanarchtestadavance.R
import com.example.cleanarchtestadavance.databinding.ActivityMainBinding
import com.example.cleanarchtestadavance.databinding.ActivityMovieBinding

class MovieActivity : AppCompatActivity() {
    lateinit var binding: ActivityMovieBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_movie)

    }
}