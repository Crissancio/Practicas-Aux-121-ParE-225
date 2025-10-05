package PRACTICA1AUXILIATURA.Herencia.Ejercicio2;

public class Administrativo extends Datos{
    private double salario;
    private String cargo;

    public Administrativo(String nombre, int carnet, double salario, String cargo){
        super(nombre, carnet);
        this.salario = salario;
        this.cargo = cargo;
    }
    @Override
    public String toString(){
        return (super.toString() + ", Salario: " + salario + ", Cargo: " + cargo);
    }
}
