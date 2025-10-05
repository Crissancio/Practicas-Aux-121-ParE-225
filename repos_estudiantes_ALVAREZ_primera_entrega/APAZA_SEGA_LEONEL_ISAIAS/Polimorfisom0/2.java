public class Videojuego {
    private String nombre;
    private String plataforma;
    private int jugadores;

    public Videojuego() {
        this.nombre = "Sin nombre";
        this.plataforma = "PC";
        this.jugadores = 1;
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
        jugadores++;
    }

    public void agregarJugadores(int cantidad) {
        jugadores += cantidad;
    }

    public void mostrar() {
        System.out.println(nombre + " (" + plataforma + ") - Jugadores: " + jugadores);
    }

    public static void main(String[] args) {
        Videojuego v1 = new Videojuego("Minecraft", "PC", 5);
        Videojuego v2 = new Videojuego("GTA V", "PlayStation");

        v1.agregarJugadores();
        v2.agregarJugadores(3);

        v1.mostrar();
        v2.mostrar();
    }
}
