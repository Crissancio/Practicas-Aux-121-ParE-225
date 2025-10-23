package INTRODUCCION_A_POO.EJERCICIO13;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Fruta kiwi = new Fruta("kiwi", "Subtropical", new String[]{"C", "B", "E"});
        Fruta naranja = new Fruta("Naranja", "Citrica", new String[]{"C", "A"});
        Fruta sandia = new Fruta("Sandia", "peponide", new String[]{"A", "B", "C", "B6"});

        System.out.print("Las vitaminas de " + kiwi.getNombre() + " son = ");
        kiwi.mostrarVitaminas();
        System.out.print("Las vitaminas de " + naranja.getNombre() + " son = ");
        naranja.mostrarVitaminas();
        System.out.print("Las vitaminas de " + sandia.getNombre() + " son = ");
        sandia.mostrarVitaminas();
        Fruta[] frutas = {kiwi, naranja, sandia};


        Fruta max = frutas[0];
        for (int i = 1; i < frutas.length; i++) {
            if (frutas[i].getNroVitaminas() > max.getNroVitaminas()) {
                max = frutas[i];
            }
        }
        System.out.println("La fruta con más vitaminas es: " + max.getNombre());
        System.out.print(sandia.getNombre() + " tiene vitaminas: ");
        String[] vits = sandia.getVitaminas();
        for (int i = 0; i < vits.length; i++) {
            System.out.print(vits[i]);
            if (i < vits.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int countVitC = 0;

        for (int i = 0; i < frutas.length; i++) {
            String[] e = frutas[i].getVitaminas();
            for (int j = 0; j < vits.length; j++) {
                if (vits[j].equalsIgnoreCase("C")) {
                    countVitC++;
                }
            }
        }
        // se debe buscar a la vitamina x

        System.out.println("\nCantidad total de vitaminas C en todas las frutas: " + countVitC);

        for (int i = 0; i < frutas.length; i++) {
            String[] vitsOrdenadas = frutas[i].getVitaminas().clone();
            Arrays.sort(vitsOrdenadas);
            System.out.print("Vitaminas de " + frutas[i].getNombre() + " ordenadas: ");
            for (int j = 0; j < vitsOrdenadas.length; j++) {
                System.out.print(vitsOrdenadas[j] + " ");
            }
            System.out.println();
        }

    }
    }

