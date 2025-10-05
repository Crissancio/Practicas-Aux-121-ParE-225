/**
* 
* Clase Cuadrado.
* @author Helen Pérez Condori
* @version 1.0 30/09/2025
*
*/
package lb_4i;
public class Cuadrado extends Figura implements Coloreando {
    private double lado;

    public Cuadrado(double lado, String color) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * 2;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }
    
    @Override
    public String comoColorear() {
        return "Colorear los cuatro lados";
    }

    @Override
    public String toString() {
        return "Cuadrado [" + "lado=" + lado + ']';
    }
    
}
