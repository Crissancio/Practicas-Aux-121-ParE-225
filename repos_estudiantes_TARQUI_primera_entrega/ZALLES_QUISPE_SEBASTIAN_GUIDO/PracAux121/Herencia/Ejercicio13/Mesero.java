public class Mesero extends Empleado{
    public double propina;
    public int horasExtra;
    public float sueldoHora;
    public Mesero(String nombre, float sueldoMes, double propina, int horasExtra, float sueldoHora){
        super(nombre, sueldoMes);
        this.propina=propina;
        this.horasExtra=horasExtra;
        this.sueldoHora=sueldoHora;
    }

    @Override
    public float sueldoTotal() {
        System.out.print(" mesero: ");
        return +sueldoMes+(horasExtra*sueldoHora)+(float)propina;
    }
}
