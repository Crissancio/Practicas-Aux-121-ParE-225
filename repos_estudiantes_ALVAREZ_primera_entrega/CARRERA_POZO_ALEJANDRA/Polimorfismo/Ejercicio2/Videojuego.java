package Polimorfismo.Ejercicio2;
public class Videojuego {

    private String nombre;
    private String plataforma;
    private int jugadores;

    public Videojuego() {
        this.nombre = "Desconocido";
        this.plataforma = "Desconocida";
        this.jugadores = 0;
    }
    public Videojuego(String nombre, String plataforma) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.jugadores = 1;
    }
    public Videojuego(String nombre, String plataforma, int jugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.jugadores = jugadores;
    }
    public void agregarJugadores() {
        jugadores += 1;
        System.out.println("Se agregó un jugador. Total: " + jugadores);
    }
    public void agregarJugadores(int cantidad) {
        jugadores += cantidad;
        System.out.println("Se agregaron " + cantidad + " jugadores. Total: " + jugadores);
    }
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Jugadores: " + jugadores);
    }
    public static void main(String[] args) {

        Videojuego v1 = new Videojuego("Hollowknigth", "PC");
        Videojuego v2 = new Videojuego("GTA V", "PlayStation", 2);

        v1.mostrarInfo();
        v2.mostrarInfo();
        v1.agregarJugadores();
        v1.agregarJugadores(3);
        v1.mostrarInfo();
    }
}
