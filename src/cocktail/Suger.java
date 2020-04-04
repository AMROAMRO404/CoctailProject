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
    

    private Color color;

    public Suger(Color color, int volume, String name, int amountOfCalories) {
        super(volume, name, amountOfCalories);
        this.color = color;
    }

   
    @Override
    public String getInfo(){
        return "This is Suger that has amountOfCalories = "+this.getAmountOfCalories();
    }
   
    @Override
    public int getVolume() {
        return 0;//volume of sugar when blend 
    }
    
    
    
}