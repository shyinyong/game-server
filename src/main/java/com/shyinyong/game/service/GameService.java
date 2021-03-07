package com.shyinyong.game.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class GameService {
    public String welcome() {
        return "welcome";
    }

    public String me() {
        return "this is me";
    }

    public ArrayList allServer() {
        Map<String, String> server1 = new HashMap<>();
        server1.put("serverId", "1");
        server1.put("name", "一区");
        server1.put("state", "活跃");

        Map<String, String> server2 = new HashMap<>();
        server2.put("serverId", "2");
        server2.put("name", "二区");
        server2.put("state", "活跃");

        ArrayList<Object> allServers = new ArrayList<>();
        allServers.add(server1);
        allServers.add(server2);

        return allServers;
    }
}
