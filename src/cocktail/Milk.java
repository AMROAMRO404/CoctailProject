/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktail;

import java.awt.Color;

/**
 *
 * @author asus
 */
public class Milk extends Ingredients {
    private int volume;
    static final Color MilkCo=Color.WHITE;

    public Milk(int volume, String name, int amountOfCalories) {
        super(name, amountOfCalories);
        this.volume = volume;
    }
   
    
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    @Override
    public String getInfo(){
        return "This is Milk "+this.getName();
    }
    
    
}