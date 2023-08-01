package com.github.kevin127lam.games;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/games")
public class GameController {

    @Autowired //instantiates the following
    private GameService service;

    @GetMapping
    //gets the request and returns the response in the api layer
    public ResponseEntity<List<Game>> getGames(){
        return new ResponseEntity<List<Game>>(service.findAllGames(), HttpStatus.OK);
    }

    @GetMapping("/{title}")
    public ResponseEntity<Optional<Game>> getSingleGame(@PathVariable String title){
        return new ResponseEntity<Optional<Game>>(service.findGameByTitle(title), HttpStatus.OK);
    }
}
