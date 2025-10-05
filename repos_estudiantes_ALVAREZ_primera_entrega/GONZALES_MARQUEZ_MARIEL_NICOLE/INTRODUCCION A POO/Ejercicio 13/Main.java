import java.util.*;

public class Main {
    public static void main(String[] args) {

        Fruta kiwi = new Fruta("Kiwi", "Subtropical", new String[] { "K", "C", "E" });
        Fruta naranja = new Fruta("Naranja", "Cítrica", new String[] { "C", "A" });
        Fruta mango = new Fruta("Mango", "Tropical", new String[] { "A", "C", "E", "K" });

        Fruta[] frutas = { kiwi, naranja, mango };

        Fruta maxVitaminas = frutas[0];
        for (Fruta f : frutas) {
            if (f.getNroVitaminas() > maxVitaminas.getNroVitaminas()) {
                maxVitaminas = f;
            }
        }
        System.out.println("Fruta con más vitaminas: " + maxVitaminas.getNombre());

        System.out.print("Vitaminas de Mango: ");
        for (String v : mango.getVitaminas()) {
            System.out.print(v + " ");
        }
        System.out.println();

        int contadorCitricas = 0;
        for (Fruta f : frutas) {
            for (String v : f.getVitaminas()) {
                if (v.equals("C") || v.equals("A")) {
                    contadorCitricas++;
                }
            }
        }
        System.out.println("Cantidad de vitaminas cítricas: " + contadorCitricas);

        for (Fruta f : frutas) {
            String[] vits = f.getVitaminas();
            Arrays.sort(vits);
            System.out.println("Vitaminas ordenadas de " + f.getNombre() + ": " + Arrays.toString(vits));
        }
    }
}
