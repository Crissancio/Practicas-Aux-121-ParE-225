public class Administrativo extends Empleado{
    public String cargo;
    public Administrativo(String nombre, float sueldoMes, String cargo){
        super(nombre, sueldoMes);
        this.cargo=cargo;
    }

    @Override
    public float sueldoTotal() {
        System.out.print(" administrativo: ");
        return sueldoMes;
    }
}
