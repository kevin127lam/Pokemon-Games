package com.github.kevin127lam.games;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "games")
@Data //takes care of getters and setter
@AllArgsConstructor //takes care of constructors w args
@NoArgsConstructor //takes care of no arg constructors
public class Game {
    @Id
    private ObjectId id;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String platform;
    private String poster;
    private List<String> backdrops;

    @DocumentReference //manual reference
    private List<Review> reviews;
}
