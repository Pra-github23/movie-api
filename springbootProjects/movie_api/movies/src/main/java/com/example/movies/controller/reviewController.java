package com.example.movies.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movies.model.Review;
import com.example.movies.service.reviewService;

@RestController
@RequestMapping("/api/reviews")
public class reviewController {

    @Autowired
    private reviewService reviewSer;

    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Map<String, String> request){
        
        return new ResponseEntity<>(reviewSer
                   .createReview(request.get("reviewBody"),
                                  request.get("imdbId")),
                                HttpStatus.CREATED);
    }
    
}
