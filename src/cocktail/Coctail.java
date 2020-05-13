/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktail;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Coctail {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args)  {
       // TODO code application logic here
        
        Fruits orange = new Fruits(100, new Color(23,54,4), "Orange", 200);
        Fruits orange1 = new Fruits(100, new Color(23,54,4), "Orange", 200);
        Fruits apple = new Fruits(100, new Color(44,33,44), "apple",66);
        Fruits banana = new Fruits(90,new Color(44,33,44),"banana", 80);
        Fruits banana1 = new Fruits(90,new Color(76,5,3),"orange", 80 );
        Fruits banana2 = new Fruits(90,new Color(76,5,3),"orange", 80 );
        Milk milk = new Milk("milk", 50, 200);
        Suger suger = new Suger();
        
        Blunder blender = new Blunder(500);
        
        try{
           blender.add(orange);
           blender.add(orange1);
           blender.add(apple);
           
           blender.add(banana);
           blender.add(banana1);
           blender.add(banana2);


        }
        catch(BlenderOverFlowException ex){
            System.out.println(ex.getMessage());
        }
        
        blender.blend();
        
        System.out.println("Cocktail Volume " + blender.getVolume());
        System.out.println("Cocktail Calories " + blender.getCalories());
        System.out.println("Cocktail Car/ml " + blender.getCalPerMl());

        Cup cup = new Cup(200);
        Cup cup1 = new Cup(200);
        Cup cup2 = new Cup(200);
        Cup cup3 = new Cup(200);
        
        try{
            blender.pour(cup);
            blender.pour(cup1);
            blender.pour(cup2);
            blender.pour(cup3);
        }
        catch(BlenderIsEmptyException ex){
            System.out.println(ex.getMessage());
        }
        
        System.out.println("Calories in cup " + cup1.getCalories());
        
        
        
        
    }
    }
    

