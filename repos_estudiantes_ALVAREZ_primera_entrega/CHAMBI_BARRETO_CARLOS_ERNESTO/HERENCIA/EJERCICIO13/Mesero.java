package HERENCIA.EJERCICIO13;

public class Mesero extends Empleado{
    public double propina;
    public int horaExtra;
    public float sueldoHora;

    public Mesero(String nombre, float sueldoMes, double propina, int horaExtra, float sueldoHora){
        super(nombre, sueldoMes);
        this.propina=propina;
        this.horaExtra=horaExtra;
        this.sueldoHora=sueldoHora;
    }
    @Override
    public float sueldoTotal() {
        return (float)(sueldoMes + (horaExtra * sueldoHora) + propina);
    }

    @Override
    public String toString() {
        return "Mesero: " + nombre + ", Sueldo base: " + sueldoMes + ", Propina: " + propina + ", Sueldo total: " + sueldoTotal();
    }
}
