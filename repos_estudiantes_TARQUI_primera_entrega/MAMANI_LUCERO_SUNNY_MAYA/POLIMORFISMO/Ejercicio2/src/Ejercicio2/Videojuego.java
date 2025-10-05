package Ejercicio2;
//Ejercicio 2. Sea la clase Videojuego que tenga los atributos nombre, plataforma, cantidad de jugadores. Se pide:
public class Videojuego {
	
	public String nombre;
	public String plataforma;
	public int nroJugadores=0;
	//a) Instanciar al menos 2 videojuegos
	public Videojuego(String nombre,String plataforma){
		this.nombre=nombre;
		this.plataforma=plataforma;
	}
	public Videojuego(String nombre,String plataforma,int nroJugadores){
		this.nombre=nombre;
		this.plataforma=plataforma;
		this.nroJugadores=nroJugadores;
	}
	//c) Sobrecargar el método agregarJugadores() para: agregar solo un jugador, y
	//agregar numero de jugadores según una cantidad ingresada por teclado.
	public void agregarJugadores() {
		this.nroJugadores+=1;
	}
	public void agregarJugadores(int x) {
		this.nroJugadores+=x;
	}
	
	
}
