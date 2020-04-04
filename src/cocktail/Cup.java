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
public class Cup {
    private int capacity;
    Blunder b;
   private int calories;
    int volumeOfCup=0;

    public Cup(int capacity, Blunder b) {
        this.capacity = capacity;
        this.b = b;
    }

   
   
    
    public String getInfo(){
        return "This is Cup that has a capacity = "+this.capacity+" and has a calories = "+this.getCalories();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCalories() {
       
        return (Blunder.totalNumberOfCalories()/Blunder.getVolume())*this.getCapacity();
    }

    public void setCalories(int calories) {
        this.calories =calories;
    }

   
    
    
    
}