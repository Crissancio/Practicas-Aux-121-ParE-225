         package Ejercicio3;

public class Animal {
	public String nombre;
	public int edad;
	public Animal(String nombre,int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	public void desplazarse() {
		System.out.println(this.nombre+" se esta moviendo");
	}

}
