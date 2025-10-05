package PRACTICA1AUXILIATURA.Polimorfismo.Ejercicio2;

public class Videojuego {
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;

    public Videojuego(String nombre, String plataforma){
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = 0;
    }
    public Videojuego(String nombre, String plataforma, int cantidadJugadores){
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }

    public void agregarJugadores(){
        cantidadJugadores++;
    }
    public void agregarJugadores(int cantidad){
        cantidadJugadores+=cantidad;
    }
    public void mostrar(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Cantidad de jugadores: " + cantidadJugadores);
        System.out.println("------------------------------");
    }

    public static void main(String[] args){
        Videojuego v1 = new Videojuego("The Last of Us", "PS4",3);
        Videojuego v2 = new Videojuego("FIFA 21", "PC");
        v1.agregarJugadores();
        v2.agregarJugadores(5);
        v1.mostrar();
        v2.mostrar();
    }
}
