import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jandomingo
 */
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand = new ArrayList<Card>();
    
    public void add (Card card) {
        hand.add(card);
    }
    
    public void print() {
        for (Card card : hand) {
            System.out.println(card);
        }
    }
    
    public void sort() {
        Collections.sort(hand);
        }

    @Override
    public int compareTo(Hand hand2) {
        int hand1Sum = 0;
        int hand2Sum = 0;
        
        for (Card card : this.hand) {
            hand1Sum += card.getValue();
        }
        
        for (Card theirCard : hand2.hand) {
            hand2Sum += theirCard.getValue();
        }
        
        return hand1Sum - hand2Sum;
        }
    
    public void sortAgainstSuit() {
        Collections.sort(this.hand, new SortAgainstSuitAndValue());
    }
    
    }

    
    

