/**
* 
* Clase Abstracta Figura.
* @author Helen Pérez Condori
* @version 1.0 30/09/2025
*
*/
package lb_4i;
public abstract class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figura{" + "color=" + color + '}';
    }
    public abstract double area();
    public abstract double perimetro();   
}
