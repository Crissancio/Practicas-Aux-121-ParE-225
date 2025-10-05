package Practica_3;

public class Aplicacion2 {
    public static void main(String[] args) {
        JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3);
        Juego2AdivinaPar juego2 = new Juego2AdivinaPar(3);
        Juego2AdivinaImpar juego3 = new Juego2AdivinaImpar(3);

        System.out.println("\n--- JUEGO NORMAL ---");
        juego1.juega();

        System.out.println("\n--- JUEGO PARES ---");
        juego2.juega();

        System.out.println("\n--- JUEGO IMPARES ---");
        juego3.juega();
    }
}
