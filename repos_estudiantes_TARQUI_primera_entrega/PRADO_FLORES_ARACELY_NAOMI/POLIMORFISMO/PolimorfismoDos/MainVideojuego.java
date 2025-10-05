package PolimorfismoDos;

import java.util.Scanner;

public class MainVideojuego {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Videojuego v1 = new Videojuego("Zelda", "Nintendo Switch", 1);
        Videojuego v2 = new Videojuego("FIFA 25", "PS5");
        Videojuego v3 = new Videojuego("Minecraft");

        v1.mostrarInfo();
        v2.mostrarInfo();
        v3.mostrarInfo();

        v2.agregarJugadores();
        System.out.print("Ingrese cantidad de jugadores a agregar para Minecraft: ");
        int cantidad = sc.nextInt();
        v3.agregarJugadores(cantidad);

        System.out.println("\nDespués de agregar jugadores:");
        v1.mostrarInfo();
        v2.mostrarInfo();
        v3.mostrarInfo();

        sc.close();
    }
}

class Videojuego {
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;

    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }

    public Videojuego(String nombre, String plataforma) {
        this(nombre, plataforma, 0);
    }

    public Videojuego(String nombre) {
        this(nombre, "Desconocida", 0);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPlataforma() { return plataforma; }
    public void setPlataforma(String plataforma) { this.plataforma = plataforma; }

    public int getCantidadJugadores() { return cantidadJugadores; }
    public void setCantidadJugadores(int cantidadJugadores) { this.cantidadJugadores = cantidadJugadores; }

    public void mostrarInfo() {
        System.out.println("Videojuego: " + nombre + " | Plataforma: " + plataforma + " | Jugadores: " + cantidadJugadores);
    }

    public void agregarJugadores() {
        cantidadJugadores += 1;
    }

    public void agregarJugadores(int cantidad) {
        cantidadJugadores += cantidad;
    }
}
