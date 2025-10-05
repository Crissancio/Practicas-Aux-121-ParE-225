package Ejercicio11;
//Ejercicio 11. Dado la clase hija JefePolicia con las clases padres Persona, Empleado,Policia. Se pide:
public class JefePolicia extends Persona implements Empleado, Policia {
    private double sueldo;
    private int antiguedad;
    private String grado;
    private String unidad;
    private String zonaAsignada;
    private int numAgentesACargo;
    public JefePolicia(String nombre, int edad,double sueldo, int antiguedad,String grado, String unidad,String zonaAsignada, int numAgentesACargo) {
		super(nombre, edad);
		this.sueldo = sueldo;
		this.antiguedad = antiguedad;
		this.grado = grado;
		this.unidad = unidad;
		this.zonaAsignada = zonaAsignada;
		this.numAgentesACargo = numAgentesACargo;}
	public double getSueldo() {
		return sueldo;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public String getGrado() {
		return grado;
	}
	public String getUnidad() {
		return unidad;
	}
	public boolean tieneMismoGrado(JefePolicia x) {
	    return this.grado.equals(x.grado);
	}

	public void mayorSueldo(JefePolicia x) {
	    if (this.sueldo>=x.sueldo) {
	        System.out.println(this.getNombre());
	    } else {
	    	System.out.println(x.getNombre());
	    }
	}
    public void mostrar() {
        super.mostrar();
        System.out.println("Sueldo: "+sueldo+" | Antigüedad: "+antiguedad);
        System.out.println("Grado: "+grado+" | Unidad: "+unidad);
        System.out.println("Zona: "+zonaAsignada+" | Agentes: "+numAgentesACargo);
    }


}
