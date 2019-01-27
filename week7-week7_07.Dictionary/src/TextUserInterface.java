
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jandomingo
 */
public class TextUserInterface {   
    
    private Scanner reader;
    private Dictionary dictionary;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }
    
    public void start() {
        
        System.out.println("Statements: ");
        System.out.println("    add - adds a word pair to the dictionary");
        System.out.println("    translate - asks a word and prints its translation");
        System.out.println("    quit - quits the text user interface");
        handleInput();
    }
    
    private void handleInput() {
        String input;
        while(true) {
            input = stringCleaner(this.reader.nextLine());

            if(input.equals("quit")) {
                System.out.println("Cheers!");
                break;
            }
            else if (input.equals("add")) {
                add();
            }

            else if (input.equals("translate")) {
                translate();
            }

            else {
                System.out.println("Unknown statement");
                break;
            }
        }
    }
    
    private void add() {
        System.out.print("In Finnish: ");
        String finnish = this.reader.nextLine();
        
        System.out.print("Translation: ");
        String translation = this.reader.nextLine();
        
        dictionary.add(finnish, translation);
    }
    
    private void translate() {
        System.out.print("Given a word: ");
        String finnish = this.reader.nextLine();
        
        System.out.print("Translation: ");
        String translation = dictionary.translate(finnish);
        System.out.println(translation);
    }
    
    private String stringCleaner (String string) {
        if (string == null) {
            return "";
        }
        string = string.toLowerCase();
        return string.trim();
    }       
}
