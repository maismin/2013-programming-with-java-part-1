/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Si
 */
public class Player {
    private String name;
    private int goals;

    public Player(String name, int goals) {
        this.name = name;
        this.goals = goals;
    }

    public Player(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int goals() {
        return goals;
    }

    @Override
    public String toString() {
        return String.format("%s, goals %d", getName(), goals());
    }
    
    

    
    
}