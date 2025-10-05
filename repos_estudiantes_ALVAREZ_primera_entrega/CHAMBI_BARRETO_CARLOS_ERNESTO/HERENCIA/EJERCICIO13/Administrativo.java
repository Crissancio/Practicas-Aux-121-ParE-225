package HERENCIA.EJERCICIO13;

public class Administrativo extends Empleado{
    public String cargo;
    public Administrativo(String nombre, float sueldoMes, String cargo){
        super(nombre, sueldoMes);
        this.cargo=cargo;
    }
}
