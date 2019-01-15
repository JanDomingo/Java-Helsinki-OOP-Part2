/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jandomingo
 */
public class Calculator {
    private Reader reader;
    private int calculations;
    
    public Calculator() {
        this.reader = new Reader();
        this.calculations = calculations;
    }
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }
            
            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }
        
        statistics();
        
    }

    private void sum() {
        int[] values = input();
        int sum = values[0] + values[1]; 
        System.out.println("Sum: " + sum);
        }

    private void difference() {
        int[] values = input();
        int differences = values[0] - values[1]; 
        System.out.println("Difference: " + differences);
        }

    private void product() {
        int[] values = input();
        int product = values[0] * values[1]; 
        System.out.println("Product: " + product);
        }

    private void statistics() {
        System.out.println("Calculations done: " + calculations);
    } 
    
    private int[] input() {
        calculations++;
        int[] values = new int [2];
        System.out.print("value1: ");
        values[0] = reader.readInteger();
        System.out.println("");
        System.out.print("value2: ");
        values[1] = reader.readInteger();
        
        return values;
    }
    
    

    }
