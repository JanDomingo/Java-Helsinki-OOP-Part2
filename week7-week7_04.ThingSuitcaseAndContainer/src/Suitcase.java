
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jandomingo
 */
public class Suitcase {
    private int maxWeight ;
    private  ArrayList<Thing> things;
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }
    
    public void addThing (Thing thing) {
        if (this.totalWeight() + thing.getWeight() <= this.maxWeight) {
            this.things.add(thing);
        }       
    }
    
    public String toString() {
        if (this.things.isEmpty()) {
            return "empty (0 kg)";
        }
        else if (things.size() == 1) {
            return "1 thing " + this.totalWeight() + " kg";
        }
        return this.things.size() + " things (" + this.totalWeight() + " kg)";
    }
     
    public void printThings() {
        for (Thing item : this.things) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        int weight = 0;
        for (Thing thing : this.things) {
            weight += thing.getWeight();
        }
        return weight;
    }
    
    public Thing heaviestThing() {
        Thing heaviest = null;
        
        for (Thing thing : this.things) {
            if (heaviest == null || thing.getWeight() > heaviest.getWeight()) {
                heaviest = thing;
            }
        }
        return heaviest;
    }
    
}