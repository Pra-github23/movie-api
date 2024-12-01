package com.example.movies.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.movies.model.Review;

@Repository
public interface reviewRepository extends MongoRepository<Review, ObjectId>{

}
