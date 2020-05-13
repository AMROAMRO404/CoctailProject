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
public class Cup implements Serializable{
    private int capacity;
    private int calories;

    public Cup() {
    }

    public Cup(int capacity) {
        this.capacity = capacity;
    }
    public String getInfo(){
        return "This is Cup that has a capacity = "+this.getCapacity()+" and has a calories = "+this.getCalories();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCalories() {
        return calories;
    }
    
    public void setCalories(int calories){
        this.calories = calories;
    }
    
   
    
    
    
}