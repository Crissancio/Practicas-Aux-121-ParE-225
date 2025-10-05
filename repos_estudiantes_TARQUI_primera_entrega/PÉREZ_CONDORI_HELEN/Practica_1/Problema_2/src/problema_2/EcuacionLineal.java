package problema_2;
/**
 * Clase Ecuacion Lineal (Algebra: Ecuaciones Cuadraticas)
 * @author Helen Perez Condori
 * @version 1.0 25/03/2025
 */
public class EcuacionLineal {
    private double a, b, c;

    public EcuacionLineal(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminante(){
        return (b * b) - 4 * a * c;
    }
    
    public double getRaiz1(){
        double d = getDiscriminante();
        if(d < 0)
            return 0;
        return(-b + Math.sqrt(d))/(2 * a);
    }
    public double getRaiz2(){
        double d = getDiscriminante();
        if(d < 0)
            return 0;
        return(-b - Math.sqrt(d))/(2 * a);
    }
    
    
}
