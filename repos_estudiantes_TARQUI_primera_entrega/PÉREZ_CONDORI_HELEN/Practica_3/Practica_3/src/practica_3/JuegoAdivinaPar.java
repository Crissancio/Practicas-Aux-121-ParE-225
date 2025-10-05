/**
 * Clase JuegoAdivinaPar
 * @author Helen Perez Condori
 * @version 1.0 17/09/2025
 */
package practica_3;
import java.util.Random;
import java.util.Scanner;
public class JuegoAdivinaPar extends JuegoAdivinaNumero {
     private int[] numerosPares = {0, 2, 4, 6, 8, 10};

    public JuegoAdivinaPar(int numeroDeVidas) {
        super(numeroDeVidas);
    }
    @Override
    public boolean validaNumero(int numero) {
        if (!super.validaNumero(numero)) {
            return false;
        }
        if (numero % 2 == 0) {
            return true;
        } else {
            System.out.println("Error: El numero debe ser par");
            return false;
        }
    } 
    @Override
    public void juega() {
        reiniciaPartida();
        Random rm = new Random();
        numeroAAdivinar = numerosPares[rm.nextInt(numerosPares.length)];
        System.out.println("====== Adivina un numero PAR entre 0 y 10 ======");
        
        while (true) {
            System.out.print("Ingresa un numero PAR: ");
             Scanner sc = new Scanner(System.in);
            String entrada = sc.nextLine();
            
            if (!validaNumero(entrada)) {
                System.out.println("Error: Debe ser un numero PAR entre 0 y 10");
                continue;
            }
            
            int numero = Integer.parseInt(entrada);
            
            if (numero == numeroAAdivinar) {
                System.out.println("¡Acertaste!");
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

