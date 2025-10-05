package PRACTICA1AUXILIATURA.Herencia.Ejercicio7;

public class Docente extends Persona{
    private int sueldo;
    private String regProfesional;

    public Docente(String nombre, String paterno, String materno, int edad, int sueldo, String regProfesional) {
        super(nombre, paterno, materno, edad);
        this.sueldo = sueldo;
        this.regProfesional = regProfesional;
    }
    public void mostrar(){
        super.mostrar();
        System.out.println(", Sueldo: " + sueldo + ", Registro Profesional: " + regProfesional);
    }
    public void verEstudIgualEdadDocente(Estudiante e){
        if (this.getEdad() == e.getEdad()){
            System.out.println("El estudiante " + e.getNombre() + " tiene la misma edad que el docente " + this.getNombre());
        } else {
            System.out.println("El estudiante " + e.getNombre() + " no tiene la misma edad que el docente " + this.getNombre());
        }
    }
}
