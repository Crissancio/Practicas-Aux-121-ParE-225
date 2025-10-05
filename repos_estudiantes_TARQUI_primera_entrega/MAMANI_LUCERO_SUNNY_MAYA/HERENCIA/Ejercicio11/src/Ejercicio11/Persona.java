package Ejercicio11;
//a) Identificar en cada clase 2 atributos significativos y crear 2 objetos de la clase hija y mostrar sus datos.
public class Persona {
	private String nombre;
	private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
    public void mostrar() {
        System.out.println("Nombre: "+nombre+" | Edad: "+edad);
    }

	
}
