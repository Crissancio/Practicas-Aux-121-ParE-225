package prac1_prog2;
import java.util.Scanner;
	class Videojuego {
	    private String nombre;
	    private String plataforma;
	    private int cantidadJugadores;
	    public Videojuego() {
	        this("JUEGO XD", "PC", 0);
	    }

	    public Videojuego(String nombre, String plataforma) {
	        this(nombre, plataforma, 0);
	    }

	    public Videojuego(String nombre, String plataforma, int cant) {
	        this.nombre = nombre;
	        this.plataforma = plataforma;
	        this.cantidadJugadores = Math.max(0, cant);
	    }
	    public void agregarJugadores() {
	        this.cantidadJugadores += 1;
	        System.out.println("Se añadió 1 jugador.");
	    }

	    public void agregarJugadores(int cant) {
	        if (cant > 0) {
	            this.cantidadJugadores += cant;
	            System.out.println("Se añadieron " + cant + " jugadores.");
	        } else {
	            System.out.println("Cantidad inválida.");
	        }
	    }
	    public void agregarJugadoresDesdeTeclado() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Ingrese número de jugadores a agregar: ");
	        if (sc.hasNextInt()) {
	            int n = sc.nextInt();
	            agregarJugadores(n);
	        } else {
	            System.out.println("Entrada inválida.");
	        }
	    }

	    @Override
	    public String toString() {
	        return "Videojuego{" +
	                "nombre='" + nombre + '\'' +
	                ", plataforma='" + plataforma + '\'' +
	                ", cantidadJugadores=" + cantidadJugadores +
	                '}';
	    }
	}

	public class poli_2 {
	    public static void main(String[] args) {
	        Videojuego v1 = new Videojuego(); 
	        Videojuego v2 = new Videojuego("BattleZone", "PS5", 2);

	        System.out.println(v1);
	        v1.agregarJugadores();           
	        v1.agregarJugadores(3);          
	        System.out.println(v1);

	        System.out.println("\nDemostración:");
	        System.out.println(v2);
	  
	    }
	}

	

