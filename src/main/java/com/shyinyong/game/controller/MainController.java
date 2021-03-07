package com.shyinyong.game.controller;

import com.shyinyong.game.service.GameService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MainController {

    private final GameService gameService;

    public MainController(GameService gameService) {
        this.gameService = gameService;
    }

    @RequestMapping("/")
    public String welcome() {
        return gameService.welcome();
    }
}
