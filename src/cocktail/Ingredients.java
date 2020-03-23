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
public abstract class Ingredients {
    private String name;
    private int amountOfCalories;

    public Ingredients(String name, int amountOfCalories) {
        this.name = name;
        this.amountOfCalories = amountOfCalories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfCalories() {
        return amountOfCalories;
    }

    public void setAmountOfCalories(int amountOfCalories) {
        this.amountOfCalories = amountOfCalories;
    }
    public abstract String getInfo();
    
    
    
}