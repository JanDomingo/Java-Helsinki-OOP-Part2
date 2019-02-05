import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jandomingo
 */
public class Storehouse {
    
   private Map<String, Integer> price = new HashMap<String, Integer>();
   private Map<String, Integer> stock = new HashMap<String, Integer>();
    
    public void addProduct(String product, int price, int stock) {
        this.price.put(product, price);
        this.stock.put(product, stock);
    }
    
    public int price(String product) {
        if (this.price.get(product) == null) {
            return -99;
        }
        else return this.price.get(product);
    }
    
    public int stock(String product) {
        if (!(this.stock.containsKey(product))) {
            return 0;
        }
        return this.stock.get(product);
    }
    
    public boolean take (String product) {
        if (this.stock.containsKey(product)) {
            if (this.stock.get(product) > 0) {
                this.stock.put(product, this.stock.get(product) - 1);
                return true;
            }
        }
         return false;       
    }
    
    public Set<String> products() {
        return this.price.keySet();
    }
}
