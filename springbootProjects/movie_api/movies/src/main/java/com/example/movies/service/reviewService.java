package com.example.movies.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.example.movies.model.Review;
import com.example.movies.model.movie;
import com.example.movies.repository.reviewRepository;

import lombok.Data;

@Data
@Service
public class reviewService {
 
    @Autowired
    private reviewRepository reviewRepo;

    @Autowired
    private MongoTemplate mongoTem;

    public Review createReview(String viewBody, String imdbId){
        
        Review review = reviewRepo.insert(new Review(viewBody));
        mongoTem.update(movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewId").value(review))
                .first();  //first option
        return review;
    }
}
