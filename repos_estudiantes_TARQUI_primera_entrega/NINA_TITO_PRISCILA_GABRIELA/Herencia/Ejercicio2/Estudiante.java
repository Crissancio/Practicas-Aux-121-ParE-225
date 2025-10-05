package PRACTICA1AUXILIATURA.Herencia.Ejercicio2;

public class Estudiante extends Datos{
    private String materia;
    private float nota;

    public Estudiante(String nombre, int carnet, String materia, float nota){
        super(nombre, carnet);
        this.materia = materia;
        this.nota = nota;
    }
    public boolean pasaConDocente(Docente d){
        if(d.getMateria().equals(this.materia)){
            return true;
        } else{
            return false;
        }
    }
    @Override
    public String toString(){
        return (super.toString() + ", Materia: " + materia + ", Nota: " + nota);
    }
}
