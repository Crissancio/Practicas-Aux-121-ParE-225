public class Empleado {
    protected String nombre;
    protected float sueldoMes;

    public Empleado(String nombre, float sueldoMes) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
    }
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + ", Sueldo mensual: " + sueldoMes);
    }
    public float sueldoTotal() {
        return sueldoMes;
    }
    public float getSueldoMes() {
        return sueldoMes;
    }
}
