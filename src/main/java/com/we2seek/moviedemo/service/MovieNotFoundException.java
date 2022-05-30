package com.we2seek.moviedemo.service;

public class MovieNotFoundException extends RuntimeException {

    public MovieNotFoundException(String message) {
        super(message);
    }

    public MovieNotFoundException(int id) {
        super(String.format("Unable to find movie by ID = \"%d\"", id));
    }
}
