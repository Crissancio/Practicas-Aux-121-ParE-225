package Practica_3;
import java.util.Random;
import java.util.Scanner;

public class Juego2AdivinaNumero extends Juego2 {
    protected int numeroAAdivinar;
    protected Random random = new Random();
    protected Scanner scanner = new Scanner(System.in);

    public Juego2AdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    public boolean validaNumero(int numero) {
        return numero >= 0 && numero <= 10;
    }

    public void juega() {
        reiniciaPartida();
        numeroAAdivinar = random.nextInt(11); // entre 0 y 10
        System.out.println("Intenta adivinar un número entre 0 y 10:");

        boolean seguir = true;

        while (seguir) {
            System.out.print("Tu intento: ");
            int intento = scanner.nextInt();

            // validación de rango
            if (!validaNumero(intento)) {
                System.out.println("Número inválido. Debe estar entre 0 y 10.");
                continue;
            }

            if (intento == numeroAAdivinar) {
                System.out.println("¡Acertaste!");
                actualizaRecord();
                seguir = false;
            } else {
                if (intento < numeroAAdivinar) {
                    System.out.println("El número es mayor.");
                } else {
                    System.out.println("El número es menor.");
                }
                seguir = quitaVida();
            }
        }
    }
}
