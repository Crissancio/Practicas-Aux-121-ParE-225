/**
 * Clase Juego
 * @author Helen Perez Condori
 * @version 1.0 17/09/2025
 */
package practica_3;
public class Juego {
    protected int numeroDeVidas;
    protected int record;
    
    public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.record = 0;
    }
    public void reiniciaPartida() {
        
    }
    public void actualizaRecord() {
        if (numeroDeVidas > record) {
            record = numeroDeVidas;
            System.out.println("Tu puntaje actual es: " + record + "!");
        }
    }
    public boolean quitaVida() {
        numeroDeVidas--;
        System.out.println("Vidas restantes: " + numeroDeVidas);
        return numeroDeVidas > 0;
    }
    
}

