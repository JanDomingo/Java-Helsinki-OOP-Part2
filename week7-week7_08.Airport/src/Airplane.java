import java.util.HashMap;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jandomingo
 */
public class Airplane {
    private HashMap<String, String> airplane;
    private String id;
    private String capacity;
    
    
    public Airplane(String id, String capacity) {
        airplane = new HashMap<String, String>();
        this.id = id;
        this.capacity = capacity;
    }
    
    public void add(String id, String capacity) {
        airplane.put(id, capacity);
    }
}
