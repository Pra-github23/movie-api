package com.example.movies.repository;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.movies.model.movie;

@Repository
public interface movieRepository extends MongoRepository<movie,ObjectId> {

    public Optional<movie> findMovieByimdbId(String imdbId);
}
