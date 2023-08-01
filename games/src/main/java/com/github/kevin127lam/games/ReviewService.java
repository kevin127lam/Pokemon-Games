package com.github.kevin127lam.games;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    
    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public Review createReview(String reviewBody, String title){
        //associate review w movie
        Review review = reviewRepository.insert(new Review(reviewBody));

        //adds a new ID to the corresponding database
        mongoTemplate.update(Game.class).matching(Criteria.where("title")
        .is(title)).apply(new Update().push("reviews").value(review)).first();

        return review;
    }
}
