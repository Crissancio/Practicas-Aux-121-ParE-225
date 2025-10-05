package Ejercicio2;
import java.util.Scanner;
public class test {
//a) Instanciar al menos 2 videojuegos
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Videojuego vd1=new Videojuego("Minecraft","PC",4);
		Videojuego vd2=new Videojuego("FIFA","PlayStation");
		System.out.println(vd2.nombre+":"+vd2.nroJugadores);
		System.out.println(vd1.nombre+":"+vd1.nroJugadores);
		vd1.agregarJugadores();
		System.out.println(vd1.nombre+":"+vd1.nroJugadores);
		System.out.println("Ingresar numero de jugadores a agregar");
		int x=sc.nextInt();
	
		vd2.agregarJugadores(x);
		System.out.println(vd2.nombre+":"+vd2.nroJugadores);


	}

}
