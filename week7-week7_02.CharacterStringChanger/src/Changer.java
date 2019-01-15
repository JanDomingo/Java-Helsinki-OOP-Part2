
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
public class Changer {
    
    private ArrayList<Change> changeList;
    
    public Changer() {
        this.changeList = new ArrayList<Change>();
    }
    
    public void addChange (Change change) {
        changeList.add(change);
    }
    
    public String change (String characterString) {
        for (Change change : changeList) {
            characterString = change.change(characterString);
        }
        return characterString;
    }
    
    }
            

