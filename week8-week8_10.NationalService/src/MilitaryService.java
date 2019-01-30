/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jandomingo
 */
public class MilitaryService implements NationalService {
    int daysLeft;
    
    public MilitaryService(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    
    public int getDaysLeft() {
        return this.daysLeft;
    }
    
    public void work() {
        if (this.daysLeft > 0) {
        this.daysLeft = this.daysLeft - 1;
        }
        else {
            this.daysLeft = 0;
        }
    }
    
}
