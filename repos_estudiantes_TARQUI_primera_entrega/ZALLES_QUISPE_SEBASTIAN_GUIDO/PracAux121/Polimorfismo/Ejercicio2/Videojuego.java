import java.util.Scanner;

public class Videojuego {
    public String nombre;
    public String plataforma;
    public int cantidadDeJugadores;
    public Videojuego(){
        this.nombre="God of War";
        this.plataforma="Playstation";
        this.cantidadDeJugadores=0;
    }
    public Videojuego(String nombre, String plataforma){
        this.nombre=nombre;
        this.plataforma=plataforma;
        this.cantidadDeJugadores=0;
    }
    public Videojuego(String nombre, String plataforma, int cantidadDeJugadores){
        this.nombre=nombre;
        this.plataforma=plataforma;
        this.cantidadDeJugadores=cantidadDeJugadores;
    }
    public void agregarJugadores(int x){
        x=1;
        this.cantidadDeJugadores+=x;
    }
    public void agregarJugadores(){
        Scanner lee=new Scanner(System.in);
        System.out.println(" Ingrese el numero de jugadores que agregara: ");
        int cantidad = lee.nextInt();
        this.cantidadDeJugadores+=cantidad;
    }

    @Override
    public String toString() {
        return "[ el nombre del juego es: "+this.nombre+", su platafomra es: "+this.plataforma+", y la cantidad de jugadores es: "+this.cantidadDeJugadores+" ]";
    }
    public static void main(String[]args){
        System.out.println("------------");
        System.out.println("Videojuego 1");
        System.out.println("------------");
        Videojuego videojuego1=new Videojuego();
        videojuego1.agregarJugadores(1);
        System.out.println(videojuego1);
        System.out.println("------------");
        System.out.println("Videojuego 2");
        System.out.println("------------");
        Videojuego videojuego2=new Videojuego("Mario Kart","Nintendo");
        videojuego2.agregarJugadores();
        System.out.println(videojuego2);
        System.out.println("------------");
        System.out.println("Videojuego 3");
        System.out.println("------------");
        Videojuego videojuego3=new Videojuego("League of legends","PC",400000);
        videojuego3.agregarJugadores();
        System.out.println(videojuego3);
    }
}
