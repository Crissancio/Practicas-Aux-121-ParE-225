package HERENCIA.EJERCICIO7;

public class Docente extends Persona{
    public String regProfesional;
    public int sueldo;
    public Docente(String nombre, String paterno, String materno, String regProfesional, int edad, int sueldo){
        super(nombre, paterno, materno, edad);
        this.regProfesional=regProfesional;
        this.sueldo=sueldo;
    }


    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Registro profesional" + regProfesional);
        System.out.println("Sueldo: " + sueldo);
    }
}
