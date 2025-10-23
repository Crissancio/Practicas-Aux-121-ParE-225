public class Chef extends Empleado {
    private int horaExtra;
    private String tipo;
    private float sueldoHora;

    public Chef(String nombre, float sueldoMes, int horaExtra, float sueldoHora, String tipo) {
        super(nombre, sueldoMes);
        this.horaExtra = horaExtra;
        this.sueldoHora = sueldoHora;
        this.tipo = tipo;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Chef - Nombre: " + nombre + ", Sueldo mensual: " + sueldoMes +
                ", Tipo: " + tipo + ", Horas extra: " + horaExtra + ", Sueldo por hora extra: " + sueldoHora);
    }
    public float sueldoTotal() {
        return sueldoMes + (horaExtra * sueldoHora);
    }
}
