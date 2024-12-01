package com.example.movies.controller;


import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movies.model.movie;
import com.example.movies.service.movieService;
// import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/api/movie")
@CrossOrigin(origins = "http://localhost:3000")
public class movieController {

    @Autowired
    private movieService movieSer;

    // @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/all")
    public ResponseEntity<List<movie>> getAllMovie(){
        
        return new ResponseEntity(movieSer.getAllMovie(), HttpStatus.OK);
    }

    @GetMapping("/obj/{id}")
    public ResponseEntity<Optional<movie>> getSingleMovie(@PathVariable ObjectId id) {
        return new ResponseEntity<Optional<movie>>(movieSer.getSingleMovie(id), HttpStatus.OK);
    }

    @GetMapping("/imdbid/{imdbId}")
    public ResponseEntity<Optional<movie>> getMovie(@PathVariable String imdbId){
        Optional<movie> movie = movieSer.getMovie(imdbId);
        if(movie.isPresent()) {
            return new ResponseEntity<>(movie, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);  // Return 404 if movie is not found
        }

    }
    

}
