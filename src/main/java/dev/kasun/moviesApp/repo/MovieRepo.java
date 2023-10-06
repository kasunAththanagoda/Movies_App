package dev.kasun.moviesApp.repo;

import dev.kasun.moviesApp.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepo extends MongoRepository<Movie, ObjectId> {

    Optional<Movie> findByImdbIdEquals(String imdbIdid);
}
