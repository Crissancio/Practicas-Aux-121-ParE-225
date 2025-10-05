package Ejercicio2Py_java;

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
        this(nombre, plataforma, 1); // valor por defecto
    }
    public Videojuego(String nombre) {
        this(nombre, "Multiplataforma", 1); // valores por defecto
    }
    public void agregarJugadores() {
        this.cantidadJugadores += 1;
        System.out.println("Se agregó 1 jugador.");
    }

    public void agregarJugadoresDesdeTeclado() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de jugadores a agregar: ");
        try {
            int cantidad = scanner.nextInt();
            if (cantidad > 0) {
                this.cantidadJugadores += cantidad;
                System.out.println("Se agregaron " + cantidad + " jugadores.");
            } else {
                System.out.println("La cantidad debe ser mayor que cero.");
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida.");
            scanner.next(); 
            scanner.close(); 

        }
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Cantidad de jugadores: " + cantidadJugadores);
    }
}
