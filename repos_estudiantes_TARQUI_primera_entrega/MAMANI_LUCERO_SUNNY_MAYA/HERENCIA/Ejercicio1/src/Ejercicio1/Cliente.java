package Ejercicio1;

public class Cliente extends Persona{
	private int nroCompra;
	private String idCompra;
	public Cliente(String nombre,String apellido,String ci,int nroCompra,String idCompra) {
		super(nombre,apellido,ci);
		this.nroCompra=nroCompra;
		this.idCompra=idCompra;
	}
	
}
