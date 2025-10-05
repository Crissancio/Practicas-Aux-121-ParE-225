package Practica_3;

public class Juego2AdivinaPar extends Juego2AdivinaNumero {
    public Juego2AdivinaPar(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    @Override
    public boolean validaNumero(int numero) {
        if (numero >= 0 && numero <= 10) {
            if (numero % 2 == 0) {
                return true;
            } else {
                System.out.println("Error: Solo se permiten números PARES entre 0 y 10.");
                return false;
            }
        }
        return false;
    }
}
