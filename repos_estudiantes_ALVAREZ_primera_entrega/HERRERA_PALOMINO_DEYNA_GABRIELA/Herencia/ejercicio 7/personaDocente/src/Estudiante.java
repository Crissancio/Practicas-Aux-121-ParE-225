public class Estudiante extends Persona {
    private int ru;
    private String matricula;

    public Estudiante(String nombre, String paterno, String materno, int edad, int ru, String matricula) {
        super(nombre, paterno, materno, edad);
        this.ru = ru;
        this.matricula = matricula;
    }
    @Override
    public void mostrar() {
        System.out.println("Estudiante: " + nombre + " " + paterno + " " + materno +
                           ", Edad: " + edad + ", RU: " + ru + ", Matrícula: " + matricula);
    }

    public void modificarEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
        System.out.println("La edad del estudiante " + nombre + " ha sido modificada a " + nuevaEdad);
    }

    public static double promedio(Estudiante e1, Estudiante e2) {
        return (e1.getEdad() + e2.getEdad()) / 2.0;
    }
}
