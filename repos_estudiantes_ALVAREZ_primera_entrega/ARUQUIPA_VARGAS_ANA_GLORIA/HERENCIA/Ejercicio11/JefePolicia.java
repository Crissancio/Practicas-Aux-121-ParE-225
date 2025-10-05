package Ejercicio11;

public class JefePolicia extends Persona implements Empleado, Policia {
    private int idEmpleado;
    private double sueldo;
    private String grado;
    private int numPlaca;

    public JefePolicia(String nombre, String apellido, int idEmpleado, double sueldo, String grado, int numPlaca) {
        super(nombre, apellido);
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
        this.grado = grado;
        this.numPlaca = numPlaca;
    }

    @Override
    public double getSueldo() {
        return sueldo;
    }

    @Override
    public int getIdEmpleado() {
        return idEmpleado;
    }

    @Override
    public String getGrado() {
        return grado;
    }

    @Override
    public int getNumPlaca() {
        return numPlaca;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("ID Empleado: " + idEmpleado);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Grado: " + grado);
        System.out.println("Número de placa: " + numPlaca);
        System.out.println();
    }
}


