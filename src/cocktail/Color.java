package cocktail;

import java.io.Serializable;

public class Color implements Serializable {
     public int r;

     public int g;

       public int b;
    public Color(int r, int g, int b){
        this.r= r;
        this.g = g;
        this.b=  b;
    }

    public Color() {
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

   
}