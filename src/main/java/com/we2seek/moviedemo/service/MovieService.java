package com.we2seek.moviedemo.service;

import com.we2seek.moviedemo.domain.Movie;

import java.util.List;

public interface MovieService {


    Movie getOne(int id);

    List<Movie> getAll();

    Movie add(Movie movie);

    void delete(int id);
}
