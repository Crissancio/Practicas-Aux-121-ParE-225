import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Videojuego v1 = new Videojuego("FIFA 23", "PlayStation", 4);
        Videojuego v2 = new Videojuego("Minecraft", "PC");
        Videojuego v3 = new Videojuego("Tetris");

        v1.mostrarInfo();
        v2.mostrarInfo();
        v3.mostrarInfo();

        v1.agregarJugadores();
        v2.agregarJugadores(3);
        v3.agregarJugadores(sc);
        System.out.println("\nDespués de agregar jugadores:");
        v1.mostrarInfo();
        v2.mostrarInfo();
        v3.mostrarInfo();

        sc.close();
    }
}
