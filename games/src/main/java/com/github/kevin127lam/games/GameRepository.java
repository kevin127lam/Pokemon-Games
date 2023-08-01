package com.github.kevin127lam.games;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GameRepository extends MongoRepository<Game, ObjectId>{
    Optional<Game> findGameByTitle(String title);
}
