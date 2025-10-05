package HERENCIA.EJERCICIO7;

public class Estudiante extends Persona{
    private int ru;
    private int matricula;

    public Estudiante(String nombre, String paterno, String materno, int edad, int ru, int matricula) {
        super(nombre, paterno, materno, edad);
        this.ru = ru;
        this.matricula = matricula;
    }

    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Registro universitario: " + ru);
        System.out.println("Matricula: " + matricula);
    }

    //hacerlo estatico para que sea mas comodo xd
    public static double promedio(Estudiante[] estudiantes){
        int sm = 0;
        for (Estudiante e : estudiantes){
            sm += e.getEdad();
        }
        return (double) sm / estudiantes.length;

    }
    //modificar la edad xd
    public void cambiarDeEdad(int nuevaEdad){
        this.edad=nuevaEdad;
    }
}
