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
public abstract class Ingredients implements Serializable {
    private String name;   
    private int calories;

    public Ingredients(String name, int calories) {
        this.name = name;
        this.calories = calories;
        
    }
    public Ingredients() {
    }
   
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return this.calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
    
    public abstract int getVolume();
    public abstract Color getColor();
    public abstract String getInfo();
    
}