package Ejercicio3;

public class Pinguino extends Animal{

	public Pinguino(String nombre, int edad) {
		super(nombre, edad);
	}
	public void desplazarse() {
		System.out.println(this.nombre+" esta nadando");
	}

}
