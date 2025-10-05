package Ejercicio13;
//Ejercicio 13. Considere el siguiente diagrama de clases:

public class Fruta {
	private String nombre;
	private String tipo;
	private int nroVitaminas;
	private String[] v=new String[30];
	
	public Fruta(String nombre,String tipo,int nroVitaminas,String[] v) {
		this.nombre=nombre;
		this.tipo=tipo;
		this.nroVitaminas=nroVitaminas;
		for(int i=0;i<this.nroVitaminas;i++) {
			this.v[i]=v[i];
		}
	}
	public int getNroVits() {
		return nroVitaminas;
	}
	public String getTipo() {
		return tipo;
	}
	public String getNombre() {
		return nombre;
	}	
	public void vitaminas() {
		System.out.println("Vitaminas:");
		for(int i=0;i<this.nroVitaminas;i++) {
			System.out.println(this.v[i]);
		}
	}
}
