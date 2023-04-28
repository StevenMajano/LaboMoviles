package com.example.laboratorio05.repositories

import com.example.laboratorio05.models.Movie

class MovieRepository(private var movies : MutableList<Movie>) {

    fun getMovies() = movies

}