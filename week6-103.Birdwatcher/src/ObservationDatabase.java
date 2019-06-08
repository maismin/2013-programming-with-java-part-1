/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Si
 */
public class ObservationDatabase {
    private Map<Bird, Integer> birds;

    public ObservationDatabase() {
        birds = new HashMap<Bird, Integer>();
    }
    
    public void add(String name, String latinName) {
        birds.put(new Bird(name, latinName), 0);
    }
    
    public void observation(String name) {
        Bird tmp = isBirdInDatabase(name);
        if (tmp != null) {
            birds.put(tmp, birds.get(tmp)+1);
        } else {
            System.out.println("Is not a bird!");
        }
    }
    
    public void statistics() {
        for (Map.Entry<Bird, Integer> entry : birds.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }
    }
    
    public void show(String name) {
        Bird tmp = isBirdInDatabase(name);
        if (tmp != null) {
            System.out.printf("%s: %d observations%n", tmp, birds.get(tmp));
        }
    }
    
    private Bird isBirdInDatabase(String searchName) {
        for (Bird b : birds.keySet()) {
            if (b.getName().toLowerCase().equals(searchName.trim().toLowerCase())) {
                return b;
            }
        }
        return null;
    }
}
