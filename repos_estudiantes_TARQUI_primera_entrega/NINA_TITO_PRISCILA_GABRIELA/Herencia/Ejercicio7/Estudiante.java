package PRACTICA1AUXILIATURA.Herencia.Ejercicio7;

public class Estudiante extends Persona {
    private String ru;
    private String matricula;

    public Estudiante(String nombre, String paterno, String materno, int edad, String ru, String matricula) {
        super(nombre, paterno, materno, edad);
        this.ru = ru;
        this.matricula = matricula;
    }
    public void mostrar() {
        super.mostrar();
        System.out.println(", RU: " + ru + ", Matricula: " + matricula);
    }
    public int promedio(Estudiante e2) {
        return (this.getEdad() + e2.getEdad()) / 2;
    }
    
}
