package com.example.movies.service;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.movies.model.movie;
import com.example.movies.repository.movieRepository;

@Service
public class movieService {

    @Autowired
    private movieRepository movieRepo;

  
    public List<movie> getAllMovie(){
        return movieRepo.findAll();
    }

    public Optional<movie> getSingleMovie(ObjectId id){
        return movieRepo.findById(id);
    }

    public Optional<movie> getMovie(String imdbId){
        return movieRepo.findMovieByimdbId(imdbId);
    }
}
