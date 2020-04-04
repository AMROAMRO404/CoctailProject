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
    private int volume ;
    private String name;
    private int amountOfCalories;
    private Color co;

    public Ingredients(int volume, String name, int amountOfCalories) {
        this.volume = volume;
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

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Color getCo() {
        return co;
    }

    public void setCo(Color co) {
        this.co = co;
    }
    
    
    
    
}