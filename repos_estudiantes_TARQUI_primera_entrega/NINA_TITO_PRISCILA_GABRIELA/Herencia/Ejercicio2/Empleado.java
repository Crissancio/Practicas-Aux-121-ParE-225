package PRACTICA1AUXILIATURA.Herencia.Ejercicio2;

public class Empleado extends Datos{
    private String cargo;
    
    public Empleado(String nombre, int carnet, String cargo){
        super(nombre, carnet);
        this.cargo = cargo;
    }
    @Override
    public String toString(){
        return (super.toString() + ", Cargo: " + cargo);
    }
}
