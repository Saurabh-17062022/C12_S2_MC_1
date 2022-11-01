package com.niit;

public class Movie {
    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", movieRating=" + movieRating +
                '}';
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public double getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(double movieRating) {
        this.movieRating = movieRating;
    }

    private String movieName;
    private double movieRating;

    public Movie(String movieName, double movieRating) {
        this.movieName = movieName;
        this.movieRating = movieRating;
    }
}
