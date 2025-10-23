public class Mesero extends Empleado {
    private double propina;
    private int horaExtra;
    private float sueldoHora;

    public Mesero(String nombre, float sueldoMes, int horaExtra, float sueldoHora, double propina) {
        super(nombre, sueldoMes);
        this.horaExtra = horaExtra;
        this.sueldoHora = sueldoHora;
        this.propina = propina;
    }
    @Override
    public void mostrarDatos() {
        System.out.println("Mesero - Nombre: " + nombre + ", Sueldo mensual: " + sueldoMes +
                ", Horas extra: " + horaExtra + ", Sueldo por hora extra: " + sueldoHora + ", Propina: " + propina);
    }
    public float sueldoTotal() {
        return sueldoMes + (horaExtra * sueldoHora) + (float)propina;
    }
}
