package com.example.movies.model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "review")
public class Review {
    
    private ObjectId id;
    private String body;

    public Review(String viewBody){
        this.body = viewBody;
    }
}
