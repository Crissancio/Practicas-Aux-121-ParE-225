public class Docente extends Persona {
    private int sueldo;
    private String regProfesional;

    public Docente(String nombre, String paterno, String materno, int edad, int sueldo, String regProfesional) {
        super(nombre, paterno, materno, edad);
        this.sueldo = sueldo;
        this.regProfesional = regProfesional;
    }

    @Override
    public void mostrar() {
        System.out.println("Docente: " + nombre + " " + paterno + " " + materno +
                           ", Edad: " + edad + ", Sueldo: " + sueldo +
                           ", Registro Profesional: " + regProfesional);
    }
}
