
import java.util.ArrayList;
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
public class Dictionary {
    private HashMap<String, String> wordPairs = new HashMap<String, String>();
    
    
    public String translate(String word) {
        return this.wordPairs.get(word);
    }
    
    public void add (String word, String translation) {
        this.wordPairs.put(word, translation);
    }
    
    public int amountOfWords() {
        return this.wordPairs.size();
    }
    
    public ArrayList<String> translationList() {
        ArrayList<String> list = new ArrayList<String>();
        for (String key : wordPairs.keySet()) {
            list.add(key + " = " + wordPairs.get(key));
        }
        return list;
    }
            
}


