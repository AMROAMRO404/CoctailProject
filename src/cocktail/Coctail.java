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
        Blunder b = new Blunder(1000);
        Fruits f = new Fruits(new Color(255, 0, 0), 100, "Apple", 100);
        Milk m = new Milk(new Color(255,255,255), 150, "Milk",140);
        Suger s = new Suger(new Color(0,0,0), 0, "Suger", 150);  
                    
                    try{
                    
                    b.add(s);
                    b.add(m);
                    b.add(f);
                    b.blend();
                    b.pour(new Cup(50, b));
                    }
                    catch(BlenderIsEmptyException ex2){
                        
                        System.out.println("Blender is empty !!");
                    }
                    catch(BlenderOverFlowException ex1){
                        System.out.println("you hava exceeded the capacity of the blender");
                    }
                  
                  System.out.println(Blunder.getVolume());
                  System.out.println(b.totalNumberOfCalories());
                 
            
        
            
    }
    
}
