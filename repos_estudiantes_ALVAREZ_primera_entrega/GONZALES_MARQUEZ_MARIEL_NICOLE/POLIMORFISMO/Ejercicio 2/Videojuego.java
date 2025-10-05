import java.util.Scanner;

public class Videojuego {
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;

    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }

    public Videojuego(String nombre, String plataforma) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = 1;
    }

    public Videojuego(String nombre) {
        this.nombre = nombre;
        this.plataforma = "Desconocida";
        this.cantidadJugadores = 1;
    }

    public void agregarJugadores() {
        this.cantidadJugadores++;
    }

    public void agregarJugadores(int cantidad) {
        this.cantidadJugadores += cantidad;
    }

    public void agregarJugadores(Scanner sc) {
        System.out.print("Ingrese cantidad de jugadores a agregar: ");
        int cantidad = sc.nextInt();
        this.cantidadJugadores += cantidad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre +
                ", Plataforma: " + plataforma +
                ", Jugadores: " + cantidadJugadores);
    }
}
