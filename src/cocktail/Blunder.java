/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktail;


import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author asus
 */
public class Blunder implements Serializable  {
    private ArrayList<Ingredients> ingredients;
    private int capacity;
    private int volume;
    private int calories;
    private Color color;
    private double calPerMl;

    public Blunder() {
    }
    
    public Blunder(int capacity){
        this.capacity = capacity;
        this.ingredients = new ArrayList();
    }

    public Blunder(ArrayList<Ingredients> ingredients, int capacity) {
        this.ingredients = ingredients;
        this.capacity = capacity;
    }

    public void add(Ingredients ingredient) throws BlenderOverFlowException {
        
        
        if (this.volume + ingredient.getVolume() > this.capacity){
            throw new BlenderOverFlowException();
        }
        else{
            this.ingredients.add(ingredient);
        }
        
        this.volume += ingredient.getVolume();
            
    }

    public void blend() {
        
        int totalR = 0;
        int totalG = 0;
        int totalB = 0;
        
        for(Ingredients ing: this.ingredients){
            totalR += ing.getColor().getR();
            totalG += ing.getColor().getG();
            totalB += ing.getColor().getB();
            
            this.calories += ing.getCalories();
        }
        
        this.color = new Color(totalR/this.ingredients.size(), totalG/this.ingredients.size(), totalB/this.ingredients.size());
        
        this.calPerMl = (double) (this.calories) / (double) (this.volume);
        
        this.ingredients.clear();
        
    }

    public void pour(Cup cup) throws BlenderIsEmptyException {
        
        if (this.volume > 0){
            
            if (this.volume < cup.getCapacity()){
                cup.setCalories((int)(this.volume * this.calPerMl));
                this.volume = 0;  
            }
            else{
                this.volume -= cup.getCapacity();
                cup.setCalories((int) (cup.getCapacity() * this.calPerMl));
            }
        }
        else{
            throw new BlenderIsEmptyException();
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public int getVolume() {
        return volume;
    }

    public int getCalories() {
        return calories;
    }

    public Color getColor() {
        return color;
    }

    public double getCalPerMl() {
        return calPerMl;
    }
    public String getInfo(){
        return "This is Blunder that has a Volume =  "+this.getVolume()+", and capacity = "+this.getCapacity()+
               "\n"+"The Amount Of Calories is : "+ this.getCalories();
   }
   
    
    
}