package PRACTICA1AUXILIATURA.Herencia.Ejercicio2;

public class Docente extends Datos{
    public String materia;
    public float salario;

    public Docente(String nombre, int carnet, String materia, float salario){
        super(nombre, carnet);
        this.materia = materia;
        this.salario = salario;
    }
    public String getMateria(){
        return this.materia;
    }
    @Override
    public String toString(){
        return (super.toString() + ", Materia: " + materia + ", Salario: " +  salario);
    }
}
