
public class Administrativo extends Empleado {
    private String cargo;

    public Administrativo(String nombre, float sueldoMes, String cargo) {
        super(nombre, sueldoMes);
        this.cargo = cargo;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Administrativo - Nombre: " + nombre + ", Sueldo mensual: " + sueldoMes + ", Cargo: " + cargo);
    }
    public float sueldoTotal() {
        return sueldoMes;
    }
}
