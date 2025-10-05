package Ejercicio11;
//Ejercicio 11. Analiza el siguiente Texto:
//a) Encontrar 2 clases con 2 atributos significativos.
public class Empleado {
	public String rol;
	public String nombre;
	//b) Implementar las dos clases encontradas con constructor, destructor, getters/setters.
	public Empleado(String nombre,String rol) {
		this.nombre=nombre;
		this.rol=rol;
		
	}
	public void despedir() {
		System.out.println(this.nombre+"ha sido despedido");
		this.nombre=null;
		this.rol=null;
	}
	public String getNombre() {
		return nombre;
	}
	public void setRol(String rol) {
		this.rol=rol;
	}
	public String toString(){
		return String.format("Nombre: %s Rol: %s",this.nombre,this.rol);
	}
}
