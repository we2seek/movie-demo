package com.we2seek.moviedemo.service;

import com.we2seek.moviedemo.domain.Movie;
import com.we2seek.moviedemo.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie getOne(int id) {
        return movieRepository.findById(id).orElseThrow(() -> new MovieNotFoundException(id));
    }


    @Override
    public List<Movie> getAll() {
        return movieRepository.findAll();
    }

    @Override
    public Movie add(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public void delete(int id) {
        movieRepository.deleteById(id);
    }
}
