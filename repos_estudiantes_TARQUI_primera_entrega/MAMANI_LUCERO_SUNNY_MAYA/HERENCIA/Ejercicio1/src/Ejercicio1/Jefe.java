package Ejercicio1;

public class Jefe extends Persona {
	private String sucural;
	private String tipo;
	public Jefe(String nombre, String apellido, String ci,String sucursal,String tipo) {
		super(nombre, apellido, ci);
		this.sucural=sucursal;
		this.tipo=tipo;
		
	}
	

}
