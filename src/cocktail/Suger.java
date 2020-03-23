/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktail;

/**
 *
 * @author asus
 */
public class Suger extends Ingredients {
    private int amountOfSuger=20;

    public Suger(String name, int amountOfCalories) {
        super(name, amountOfCalories);
        
    }

    public int getAmountOfSuger() {
        return amountOfSuger;
    }

    public void setAmountOfSuger(int amountOfSuger) {
        this.amountOfSuger = amountOfSuger;
    }
    @Override
    public String getInfo(){
        return "This is Suger "+this.getName();
    }
   

    
    
    
}