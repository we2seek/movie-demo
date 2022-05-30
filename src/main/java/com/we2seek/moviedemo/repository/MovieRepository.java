package com.we2seek.moviedemo.repository;

import com.we2seek.moviedemo.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
