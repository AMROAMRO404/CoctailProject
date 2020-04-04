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
    private int capacity;
    public static int volume=0;
    private static int calories=0;
    private Color CocktailColor;
    private static int volumeToCheack=0;
  
    //public int percetageOfCalories=this.calories/this.volume;

    public Blunder(int capacity) {
        this.capacity = capacity;
        
    }

    
    
    
     
    public void add(Ingredients ingredient) throws BlenderOverFlowException{
        Blunder.volumeToCheack+=ingredient.getVolume();
        Blunder.calories+=ingredient.getAmountOfCalories();
        if(Blunder.volumeToCheack>this.capacity){
            throw new BlenderOverFlowException();
        }
        else{
            this.ingredients.add(ingredient);
        }

        
    }
   
        public void blend() {
        Blunder.volume=0;Blunder.calories=0;
        for (int i =0 ;i<ingredients.size();i++){
             Blunder.volume+=ingredients.get(i).getVolume();
            Blunder.calories+=ingredients.get(i).getAmountOfCalories();
        }
            
    }
      public void pour(Cup cup)throws BlenderIsEmptyException {
          
          if(Blunder.volume ==0){
              throw new BlenderIsEmptyException();
          }
          else{
            if(Blunder.volume<=cup.getCapacity())
              cup.volumeOfCup=Blunder.volume;
             
            else{ cup.volumeOfCup=cup.getCapacity();
                 if(Blunder.volume>=cup.getCapacity()){
            Blunder.volume -=cup.getCapacity();
            Blunder.calories-=cup.getCalories();
       
            }
            }
          }
          
      }
    public static int totalNumberOfCalories(){
        System.out.println("The Amount Of Calories is : ");
        return calories;
    }

    public static int getVolume() {
        System.out.println("The volume of blender : ");
        return volume;
    }
    
    public String getRGBcolor(){
        int r=0,g=0,b=0;
      for(int i=0;i<ingredients.size();i++){
          r+=ingredients.get(i).getCo().getR();
          b+=ingredients.get(i).getCo().getB();
          g+=ingredients.get(i).getCo().getG();
      }
       r/=ingredients.size();
       g/=ingredients.size();
       b/=ingredients.size();
       CocktailColor.setB(b);CocktailColor.setG(g);CocktailColor.setR(r);
       
       return "The values of RGB are : R = "+r+" G = "+g+" B = "+b;
    }
    public String getInfo(){
        return "This is Blunder that has a Volume =  "+Blunder.getVolume()+"/n"+getRGBcolor();
   }
   
    
    
}