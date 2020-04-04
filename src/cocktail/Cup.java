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
    private int calories=(b.totalNumberOfCalories()/b.getAllVolume())*capacity;
    int volumeOfCup=0;

    public Cup(int capacity) {
        this.capacity = capacity;
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
        return calories;
    }

   
    
    
    
}