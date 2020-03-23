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

    public Cup(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int contetCalories(int capacity){
        return 0 ;
    }
    
    public String getInfo(){
        return "This is Cup that has a capacity = "+this.getCapacity();
    }
    
    
    
}