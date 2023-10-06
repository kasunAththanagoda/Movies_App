package dev.kasun.moviesApp.services;

import dev.kasun.moviesApp.Movie;
import dev.kasun.moviesApp.repo.MovieRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepo movieRepo;

    public List<Movie> getAllMovies() {
        List<Movie> all = movieRepo.findAll();
        System.out.println("alll"+all);
        return movieRepo.findAll();
    }


    public Optional<Movie> geMovieByimdbIdId(String imdbIdid) {
        return movieRepo.findByImdbIdEquals(imdbIdid);
    }
}
