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
public class Suger extends Ingredients {
    
 private int volume;

    private Color color;
    
    public Suger(){
        super("Sugar", 200);
        this.volume = 0;
        this.color = new Color(255,255,255);
    }
    
 @Override
    public int getVolume(){
        return 0;
    }
    
    public Color getColor(){
        return new Color(255,255,255);
    }

    @Override
    public String getInfo() {
        return "This is Sugar "+this.getName()+" and has amountOfCalories = "+this.getCalories() ;
    }
    
    
    
}