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
public class Blunder  {
    private Milk m;
    private Fruits f;
    private Suger s;
  
    
     public Blunder(Milk m, Fruits f, Suger s,String str) {
        this.m = new Milk(150, "al-maraai", 100);
        this.f =new Fruits( 100,Color.red, "Apple", 80);
        this.s = new Suger("SugerPalestine", 20);
        
    }
    
    public int totalNumberOfCalories(Milk m,Fruits f,Suger s){
        System.out.println("The Amount Of Calories is : ");
        return 0;
    }
    public int getAllVolume(){
        System.out.println("The Total Volume is : ");
        return 0;
        
    
    }
    public String getThecolor(Milk m,Fruits f){
       System.out.println("The Color of Cochtail is : ");
       return null;
    }
    public String getInfo(){
        return "This is Blunder that has a Volume =  "+this.getAllVolume();
   }
   
    
    
}