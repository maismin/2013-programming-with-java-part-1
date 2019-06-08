/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Si
 */
public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize;

    public Team(String name) {
        this.name = name;
        players = new ArrayList<Player>();
        maxSize = 16;
    }

    public String getName() {
        return name;
    }
    
    public int size() {
        return players.size();
    }
    
    public int goals() {
        int sum = 0;
        for (Player p : players) {
            sum += p.goals();
        }
        return sum;
    }
    
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public void addPlayer(Player p) {
        if (players.size() < maxSize) {
            players.add(p);
        }
    }
    
    public void printPlayers() {
        for (Player p : players) {
            System.out.println(p);
        }
    }
    
}
