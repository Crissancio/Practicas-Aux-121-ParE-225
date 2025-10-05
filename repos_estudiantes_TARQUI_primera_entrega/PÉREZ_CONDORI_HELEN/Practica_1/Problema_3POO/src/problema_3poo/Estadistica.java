package problema_3poo;
/**
 * Clase Estadistica - POO
 * @author Helen Perez Condori
 * @version 1.0 25/03/2025
 */
public class Estadistica {
    private double[] d;

    public Estadistica(double[] d) {
        this.d = d;
    }
    public double getPromedio() {
        double suma = 0;
        for (double v : d) suma += v;
        return suma / d.length;
    }
    public double getDesviacion() {
        double prom = getPromedio();
        double sumaCuad = 0;
        for (double v : d) {
            sumaCuad += Math.pow(v - prom, 2);
        }
        return Math.sqrt(sumaCuad / (d.length - 1));
    }
    
    
}
