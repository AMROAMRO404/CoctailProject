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
public class Fruits extends Ingredients {
    
    private Color co;

    public Fruits(Color co, int volume, String name, int amountOfCalories) {
        super(volume, name, amountOfCalories);
        this.co = co;
    }

    
    public Color getCo() {
        return co;
    }

    public void setCo(Color co) {
        this.co = co;
    }

  
    @Override
    public String getInfo(){
        return "This is Fruit "+this.getName()+" that has amountOfCalories = "+this.getAmountOfCalories();
    }
    
    
}
