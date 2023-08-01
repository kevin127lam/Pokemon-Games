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
    private GameRepository gameRepository;

    public List<Game> allGames(){
        return gameRepository.findAll(); 
    }

    public Optional<Game> singleGame(String title){
        return gameRepository.findGameByTitle(title);
    }
}
