package Ejercicio13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Fruta f1 = new Fruta("Kiwi", "subtropical", new String[]{"K", "C", "E"});
        Fruta f2 = new Fruta("Naranja", "cítrica");
        Fruta f3 = new Fruta("Manzana");

        Fruta[] frutas = {f1, f2, f3};

        Fruta maxVit = frutas[0];
        for (Fruta f : frutas) {
            if (f.getNroVitaminas() > maxVit.getNroVitaminas()) {
                maxVit = f;
            }
        }
        System.out.println("\nFruta con más vitaminas: " + maxVit.getNombre());

        System.out.print("\nIngrese el nombre de una fruta: ");
        Scanner sc = new Scanner(System.in);
        String buscada = sc.nextLine();

        boolean encontrada = false;
        for (Fruta f : frutas) {
            if (f.getNombre().equalsIgnoreCase(buscada)) {
                f.mostrarVitaminas();
                encontrada = true;
                break;
            }
        }
        if (!encontrada)
            System.out.println("Fruta no encontrada.");

        int contCitricas = 0;
        for (Fruta f : frutas) {
            if (f.getTipo().equalsIgnoreCase("cítrica"))
                contCitricas++;
        }
        System.out.println("\nCantidad de frutas cítricas: " + contCitricas);

        Arrays.sort(frutas, Comparator.comparing(Fruta::getNombre));
        System.out.println("\nFrutas ordenadas alfabéticamente:");
        for (Fruta f : frutas) {
            System.out.println(f);
        }
    }
}
