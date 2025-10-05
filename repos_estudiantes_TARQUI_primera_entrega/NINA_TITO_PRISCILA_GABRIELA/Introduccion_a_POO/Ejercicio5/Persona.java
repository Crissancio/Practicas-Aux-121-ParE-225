package PRACTICA1AUXILIATURA.Introduccion_a_POO.Ejercicio5;

public class Persona {
    private String nombre;
    private String paterno;
    private String materno;
    private int edad;
    private String ci;

    public Persona(String nombre, String paterno, String materno, int edad, String ci) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
        this.ci = ci;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido Paterno: " + paterno);
        System.out.println("Apellido Materno: " + materno);
        System.out.println("Edad: " + edad);
        System.out.println("CI: " + ci);
    }
    public void mayorDeEdad(){
        if (edad >= 18){
            System.out.println(nombre + " " + paterno + " es mayor de edad.");
        } else {
            System.out.println(nombre + " " + paterno + " es menor de edad.");
        }
    }
    public void modificarEdad(int nuevo){
        this.edad = nuevo;
        System.out.println("Modificamos la edad de " + nombre + " " + paterno + ", ahora tiene " + edad + " años.");
    }
    public static void main(String[] args){
        Persona p1 = new Persona ("Juan", "Perez", "Gomez", 20, "1234567");
        p1.mostrarDatos();
        p1.mayorDeEdad();
        p1.modificarEdad(17);
        p1.mayorDeEdad();
        System.out.println("-------------------");
        Persona p2 = new Persona ("Ana", "Lopez", "Diaz", 16, "7654321");
        p2.mostrarDatos();
        p2.mayorDeEdad();
        p2.modificarEdad(18);
        p2.mayorDeEdad();
        System.out.println("-------------------");
        if (p1.paterno.equals(p2.paterno)){
            System.out.println(p1.nombre + " " + p1.paterno + " y " + p2.nombre + " " + p2.paterno + " tienen el mismo apellido paterno.");
        } else {
            System.out.println(p1.nombre + " " + p1.paterno + " y " + p2.nombre + " " + p2.paterno + " no tienen el mismo apellido paterno.");
        }
    }
}
