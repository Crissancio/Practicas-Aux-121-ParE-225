package Ejercicio2Py_java;

public class Main {
    
    public static void main(String[] args) {
        Videojuego juego1 = new Videojuego("Mobile Legends", "Android", 10);
        Videojuego juego2 = new Videojuego("Wild Rift");
        System.out.println("\nJuego 1 ");
        juego1.mostrarInfo();

        System.out.println("\nJuego 2 ");
        juego2.mostrarInfo();

        System.out.println("\nAgregando un jugador a Juego 1:");
        juego1.agregarJugadores();

        System.out.println("\nAgregando jugadores a Juego 2:");
        juego2.agregarJugadoresDesdeTeclado();

        System.out.println("\nDatos actualizados");
        juego1.mostrarInfo();
        System.out.println();
        juego2.mostrarInfo();
    }
}
