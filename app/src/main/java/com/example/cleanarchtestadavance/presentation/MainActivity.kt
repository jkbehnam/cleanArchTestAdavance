package com.example.cleanarchtestadavance.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.cleanarchtestadavance.R
import com.example.cleanarchtestadavance.databinding.ActivityMainBinding
import com.example.cleanarchtestadavance.presentation.artist.ArtistActivity
import com.example.cleanarchtestadavance.presentation.movie.MovieActivity
import com.example.cleanarchtestadavance.presentation.tvshow.TvShowActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnMovie.setOnClickListener {
            val intent = Intent(this, MovieActivity::class.java)
            startActivity(intent)

        }
        binding.btnArtists.setOnClickListener {
            val intent = Intent(this, ArtistActivity::class.java)
            startActivity(intent)
        }
        binding.btnTvshow.setOnClickListener {
            val intent = Intent(this, TvShowActivity::class.java)
            startActivity(intent)

        }


    }
}