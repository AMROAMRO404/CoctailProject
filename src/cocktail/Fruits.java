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
public class Fruits extends Ingredients {
    private int volume;
    private Color co;

    public Fruits(int volume, Color co, String name, int amountOfCalories) {
        super(name, amountOfCalories);
        this.volume = volume;
        this.co = co;
        
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getCo() {
        return null;
    }

    public void setCo(Color co) {
        this.co = co;
    }
    @Override
    public String getInfo(){
        return "This is Fruit "+this.getName();
    }
    
    
}
