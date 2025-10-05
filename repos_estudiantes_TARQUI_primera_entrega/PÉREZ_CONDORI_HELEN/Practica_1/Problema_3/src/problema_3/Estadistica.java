package problema_3;
/**
 * Clase Estadistica Modular
 * @author Helen Perez Condori
 * @version 1.0 25/03/2025
 */
public class Estadistica {
    public static double promedio(double[]d){
        double s = 0.0;
        for(double v : d) s += v;
        return s / d.length;
    }
    public static double desviacion(double[]d){
        double p = promedio(d);
        double sumaCuad = 0;
        for (double v : d) {
            sumaCuad += Math.pow(v - p, 2);
        }
        return Math.sqrt(sumaCuad / (d.length - 1));
    }   
}
