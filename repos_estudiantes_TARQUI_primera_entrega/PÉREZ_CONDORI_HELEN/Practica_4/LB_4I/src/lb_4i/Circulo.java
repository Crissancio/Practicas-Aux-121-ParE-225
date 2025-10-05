/**
* 
* Clase Ciculo.
* @author Helen Pérez Condori
* @version 1.0 30/09/2025
*
*/
package lb_4i;
public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circulo [" + "radio=" + radio + ']';
    }
    
    
}
