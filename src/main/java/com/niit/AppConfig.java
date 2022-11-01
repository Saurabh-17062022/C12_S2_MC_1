package com.niit;

import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean("movie1")
    public Movie getMovieDetails(){
        return new Movie("KGF2",8.5);
    }
    @Bean("movie2")
    public Movie getMovieDetails1() {
        return new Movie("Pushpa", 7.5);
    }
}
