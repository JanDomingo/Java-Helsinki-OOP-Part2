import java.util.Map;
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
public class ShoppingBasket {
    private Map<String, Purchase> basket;
    
    public ShoppingBasket() {
        this.basket = new HashMap<String, Purchase>();
    }
    
    public void add (String product, int price) {
        if (this.basket.containsKey(product)) {
            this.basket.get(product).increaseAmount();
        } else {
            this.basket.put(product, new Purchase(product, 1, price));
        }
    }
    
    public int price() {
        int price = 0;
        for (Purchase product : this.basket.values()) {
            price += product.price();
        }
        return price;
    }
    
    public void print() {
        for (Purchase product : this.basket.values()) {
            System.out.println(product);
        }
    }

}
