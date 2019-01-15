/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jandomingo
 */
public class Change {
    char fromCharacter;
    char toCharacter;
    
    public Change (char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
               
    }
    
    public String change (String characterString) {
        characterString = characterString.replace(fromCharacter, toCharacter);
        return characterString;
    }
}
