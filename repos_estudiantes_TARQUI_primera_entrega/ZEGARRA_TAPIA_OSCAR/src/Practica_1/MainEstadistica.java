package Practica_1;

public class MainEstadistica {
    public static void main(String[] args) {

        double[] numeros = {1.9, 2.5, 3.7, 2, 1, 6, 3, 4, 5, 2};

        Estadistica est = new Estadistica(numeros);

        double prom = est.promedio();
        double desv = est.desviacion();

        System.out.printf("El promedio es %.2f\n", prom);
        System.out.printf("La desviación estándar es %.5f\n", desv);
    }
}
