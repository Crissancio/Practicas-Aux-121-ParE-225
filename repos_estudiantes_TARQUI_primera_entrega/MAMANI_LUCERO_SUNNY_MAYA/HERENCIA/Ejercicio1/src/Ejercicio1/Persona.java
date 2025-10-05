package Ejercicio1;

public class Persona {
	private String nombre;
	private String apellido;
	private String ci;
	public Persona(String nombre,String apellido,String ci) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.ci=ci;
		
	}
	public String toString() {
		return String.format("Nombre: %s %s | CI: %s",this.nombre,this.apellido,this.ci);
	}
}
