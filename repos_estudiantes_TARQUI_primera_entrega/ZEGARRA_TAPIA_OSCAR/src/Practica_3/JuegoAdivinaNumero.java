package Practica_3;
import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
    private int numeroAAdivinar;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    public void juega() {
        reiniciaPartida();
        numeroAAdivinar = random.nextInt(11);
        System.out.println("Intenta adivinar un número entre 0 y 10:");

        boolean seguir = true;

        while (seguir) {
            System.out.print("Tu intento: ");
            int intento = scanner.nextInt();

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


