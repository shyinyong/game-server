package com.shyinyong.game.controller;

import com.shyinyong.game.service.GameService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final GameService gameService;

    public UserController(GameService gameService) {
        this.gameService = gameService;
    }

    @RequestMapping("/me")
    public String welcome() {
        return gameService.me();
    }
}
