package com.github.kevin127lam.games;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "reviews")
@Data //takes care of getters and setter
@AllArgsConstructor //takes care of constructors w args
@NoArgsConstructor //takes care of no arg constructors
public class Review {
    @Id
    private ObjectId id;
    private String body;
}
