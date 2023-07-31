package com.github.kevin127lam.games;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movies")
public class GameController {
    @GetMapping
    public String allGames(){
        return "Test";
    }
}
