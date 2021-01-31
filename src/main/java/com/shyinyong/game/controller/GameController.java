package com.shyinyong.game.controller;

import com.shyinyong.game.service.GameService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @RequestMapping("/")
    public String welcome() {
        return gameService.welcome();
    }
}
