package com.example.laboratorio05

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.laboratorio05.models.moviesDataBase
import com.example.laboratorio05.repositories.MovieRepository

class MovieViewModel (private var repository: MovieRepository) : ViewModel() {
       fun getMovies() = repository.getMovies()

       companion object {
              val Factory = viewModelFactory {
                     initializer {
                            val repository = MovieRepository(moviesDataBase)
                            MovieViewModel(repository)
                     }
              }
       }
}