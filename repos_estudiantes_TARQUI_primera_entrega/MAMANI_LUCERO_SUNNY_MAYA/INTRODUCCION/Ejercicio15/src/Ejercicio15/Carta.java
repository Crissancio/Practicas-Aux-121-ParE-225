package Ejercicio15;

public class Carta {
	public String codigo;
	public String descrpcion;
	public Carta(String codigo,String descripcion) {
		this.codigo=codigo;
		this.descrpcion=descripcion;
		
	}
	public boolean estaEn(Buzon b) {
		for (int i=0;i<b.c.length;i++) {
			if(this.codigo==b.c[i][0]) {
				return true;
			}
		}
		return false;
		
	}
	public String getDatos(Buzon b) {
		for (int i=0;i<b.c.length;i++) {
			if(this.codigo==b.c[i][0]) {
				return String.format("Codigo: %s,Remitente: %s,Destinatario: %s", b.c[i][0],b.c[i][1],b.c[i][2]);
			}
		}
		return String.format("Esta carta no esta en el buzon %d", b.nro);
		
	}

}
