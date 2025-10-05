package problema_3poo;
/**
 * Clase principal
 * @author Helen Perez Condori
 * @version 1.0 25/03/2025
 */
import java.util.Scanner;
public class Problema_3POO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] d = new double[10];
        System.out.println("Ingrese 10 numeros:");
        for (int i = 0; i < 10; i++) d[i] = sc.nextDouble();
        Estadistica est = new Estadistica(d);
        System.out.printf("El promedio es %.2f\n", est.getPromedio());
        System.out.printf("La desviacion estandard es %.5f\n", est.getDesviacion());
    }
    
}
