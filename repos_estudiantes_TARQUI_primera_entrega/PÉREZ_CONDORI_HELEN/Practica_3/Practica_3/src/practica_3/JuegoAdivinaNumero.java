/**
 * Clase JuegoAdivinaNumero
 * @author Helen Perez Condori
 * @version 1.0 17/09/2025
 */
package practica_3;
import java.util.Scanner;
import java.util.Random;
public class JuegoAdivinaNumero extends Juego {
    protected int numeroAAdivinar;

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
        
    }
    public boolean validaNumero(int numero) {
        return numero >= 0 && numero <= 10;
    }
    public boolean validaNumero(String numeroStr) {
        try {
            int numero = Integer.parseInt(numeroStr);
            return validaNumero(numero);
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public void juega() {
        reiniciaPartida();
        Random rm = new Random();
        numeroAAdivinar = rm.nextInt(11); // 0-10
        
        System.out.println("====== Adivina un numero entre 0 y 10 =======");        
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingresa un numero: ");
            String entrada = sc.nextLine();
            
            if (!validaNumero(entrada)) {
                System.out.println("Error: Debe ser un numero entre 0 y 10");
                continue;
            }
            
            int numero = Integer.parseInt(entrada);
            
            if (numero == numeroAAdivinar) {
                System.out.println("Acertaste!");
                actualizaRecord();
                break;
            } else {
                if (!quitaVida()) {
                    System.out.println("Te has quedado sin vidas. El numero era: " + numeroAAdivinar);
                    break;
                } else {
                    if (numero < numeroAAdivinar) {
                        System.out.println("El numero a adivinar es mayor");
                    } else {
                        System.out.println("El numero a adivinar es menor");
                    }
                }
            }
        }
    }
}

