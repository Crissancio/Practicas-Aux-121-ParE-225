/**
 * Clase Aplicacion
 * @author Helen Perez Condori
 * @version 1.0 17/09/2025
 */
package practica_3;
public class Practica_3 {
    public static void main(String[] args) {
        System.out.println("BIENVENIDO A LOS JUEGOS DE ADIVINANZA");
        
         JuegoAdivinaNumero[] juegos = { new JuegoAdivinaNumero(3), new JuegoAdivinaPar(3),  new JuegoAdivinaImpar(3)};
        
        String[] tiposJuego = {"Normal", "Par", "Impar"};
        
        for (int i = 0; i < juegos.length; i++) {
            System.out.println("\n--- Juego " + tiposJuego[i] + " ---");
            juegos[i].juega();
            System.out.println();
        }
    }
    
}

