package Ejercicio3;

public class Canguro extends Animal{

	public Canguro(String nombre, int edad) {
		super(nombre, edad);
	}
	public void desplazarse() {
		System.out.println(this.nombre+" esta saltando");
	}


}
