package com.shyinyong.game.controller;

import com.shyinyong.game.service.GameService;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    private final GameService gameService;

    public WelcomeController(GameService gameService) {
        this.gameService = gameService;
    }

    @RequestMapping("/all-server")
    public String allServer() {
        ArrayList<Map> allServers = gameService.allServer();
        Gson gson = new Gson();

        return gson.toJson(allServers);
    }
}
