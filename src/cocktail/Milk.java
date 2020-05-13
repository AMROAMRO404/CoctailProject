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
public class Milk extends Ingredients  {
   
    private int volume;

    public Milk() {
    }
    
    public Milk(String name, int calories, int volume) {
        super(name, calories);
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }
    
    public Color getColor() {
        return new Color(255,255,255);
    }
    @Override
    public String getInfo(){
        return "This is Milk "+this.getName()+" and has amountOfCalories = "+this.getCalories() ;
    }
    
    
}