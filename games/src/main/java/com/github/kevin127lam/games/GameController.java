package com.github.kevin127lam.games;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/games")
public class GameController {

    @Autowired //instantiates the following
    private GameService gameService;

    @GetMapping
    //gets the request and returns the response in the api layer
    public ResponseEntity<List<Game>> getAllGames(){
        return new ResponseEntity<List<Game>>(gameService.allGames(), HttpStatus.OK);
    }

    @GetMapping("/{title}")
    public ResponseEntity<Optional<Game>> getSingleGame(@PathVariable String title){
        return new ResponseEntity<Optional<Game>>(gameService.singleGame(title), HttpStatus.OK);
    }
}
