package PRACTICA1AUXILIATURA.Herencia.Ejercicio11;

public class JefePolicia extends Persona implements Empleado, Policia {
    private double sueldo;
    private String area;
    private String grado;
    private int añosServicio;

    public JefePolicia(String nombre, int edad, double sueldo, String area, String grado, int añosServicio) {
        super(nombre, edad);
        this.sueldo = sueldo;
        this.area = area;
        this.grado = grado;
        this.añosServicio = añosServicio;
    }

    public double getSueldo() { return sueldo; }
    public String getArea() { return area; }

    public String getGrado() { return grado; }
    public int getAñosServicio() { return añosServicio; }

    public void mostrarDatos() {
        mostrar();
        System.out.println("Sueldo: " + sueldo + ", Área: " + area + ", Grado: " + grado + ", Años de servicio: " + añosServicio);
    }
}
