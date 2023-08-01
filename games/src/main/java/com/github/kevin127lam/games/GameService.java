package com.github.kevin127lam.games;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//uses repo class to communicate w the db
public class GameService {

    @Autowired //instantiates the following
    private GameRepository repository;

    public List<Game> findAllGames(){
        return repository.findAll(); 
    }

    public Optional<Game> findGameByTitle(String title){
        return repository.findGameByTitle(title);
    }
}
