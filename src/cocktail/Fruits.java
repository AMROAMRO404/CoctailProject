/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktail;

import java.io.Serializable;

/**
 *
 * @author asus
 */
public class Fruits extends Ingredients {

    
    
    private int volume;

    private Color color;

    public Fruits(int volume, Color color, String name, int calories) {
        super(name, calories);
        this.volume = volume;
        this.color = color;
    }

    public Fruits() {
    }
    public int getVolume() {
        return this.volume;
    }

    public Color getColor() {
        return this.color;
    }

  
    @Override
    public String getInfo(){
        return "This is Fruit "+this.getName()+" that has amountOfCalories = "+this.getCalories();
    }
    
    
}
