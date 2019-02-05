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
public class Box implements ToBeStored{
    private ArrayList<ToBeStored> items;
    private final double maxWeight;
    
    public Box (double maxWeight) {
        this.items = new ArrayList<ToBeStored>();
        this.maxWeight = maxWeight;
    }
    
    public void add(ToBeStored item) {
        if ((this.weight() + item.weight()) <= this.maxWeight) {
            items.add(item);
        }
    }
    
    @Override
    public double weight() {
        double weight = 0;
        for (ToBeStored item : this.items) {
            weight += item.weight();
        }
        return weight;
    }
    
    public String toString() {
        return "Box: " + items.size() + " things, total weight " + this.weight() + " kg";
    }
}
