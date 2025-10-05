public class Chef extends Empleado{
    public int horasExtra;
    public String tipo;
    public float sueldoHora;
    public Chef(String nombre, float sueldoMes, int horasExtra, String tipo, float sueldoHora){
        super(nombre, sueldoMes);
        this.horasExtra=horasExtra;
        this.tipo=tipo;
        this.sueldoHora=sueldoHora;
    }

    @Override
    public float sueldoTotal() {
        System.out.print(" chef: ");
        return sueldoMes+(horasExtra*sueldoHora);
    }
}
