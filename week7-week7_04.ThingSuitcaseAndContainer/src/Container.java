
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
public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<Suitcase>();
    }
    
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }       
    }
    
    public String toString() {
        if (this.suitcases.isEmpty()) {
            return "empty (0 kg)";
        }
        else if (this.suitcases.size() == 1) {
            return "1 suitcase " + totalWeight() + " kg";
        }
        return this.suitcases.size() + " suitcases " + "(" + this.totalWeight() + " kg)";
        }
    
    public int totalWeight() {
    int weight = 0;
    for (Suitcase suitcase : this.suitcases) {
        weight += suitcase.totalWeight();
    }
    return weight;
    }
    
    public void printThings() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printThings();
        }
                
    }
}
