/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktail;


import java.util.ArrayList;
/**
 *
 * @author asus
 */
public class Blunder  {
    private ArrayList<Ingredients> ingredients= new ArrayList<>();
    private int capacity=0;
    private int volume=0;
    private int calories=0;
    private Color CocktailColor;
    private static int volumeToCheack=0;
    //public int percetageOfCalories=this.calories/this.volume;
    
    public Blunder(int capacity) {
        this.capacity = capacity;
    }
     
    public void add(Ingredients ingredient) throws BlenderOverFlowException{
        Blunder.volumeToCheack+=ingredient.getVolume();
        if(Blunder.volumeToCheack>this.capacity){
            throw new BlenderOverFlowException();
        }
        else{
            this.ingredients.add(ingredient);
        }

        
    }
   
        public void blend() {
        this.volume=0;this.calories=0;
        for (int i =0 ;i<ingredients.size();i++){
            this.volume+=ingredients.get(i).getVolume();
            this.calories+=ingredients.get(i).getAmountOfCalories();
        }
            
    }
      public void pour(Cup cup)throws BlenderIsEmptyException {
          
          if(this.volume ==0){
              throw new BlenderIsEmptyException();
          }
          else{
            if(this.volume<=cup.getCapacity())
              cup.volumeOfCup=this.volume;
             
            else cup.volumeOfCup=cup.getCapacity();
          
            this.volume -=cup.getCapacity();
            this.calories-=cup.getCalories();
       
        
             }
          
      }
    public int totalNumberOfCalories(){
        System.out.println("The Amount Of Calories is : ");
        return this.calories;
    }
    public int getAllVolume(){
        System.out.println("The Total Volume is : ");
        return this.volume;
        
    
    }
    public String getRGBcolor(){
        int r=0,g=0,b=0;
       for (int i =0 ;i<ingredients.size();i++){
           r+=ingredients.get(i).getCo().getR();
           g+=ingredients.get(i).getCo().getG();
           b+=ingredients.get(i).getCo().getB();
       }
       r= r/ingredients.size();
       b=b/ingredients.size();
       g=g/ingredients.size();
       
       return "The values of RGB are : R = "+r+" G = "+g+" B = "+b;
    }
    public String getInfo(){
        return "This is Blunder that has a Volume =  "+this.getAllVolume()+"/n"+getRGBcolor();
   }
   
    
    
}