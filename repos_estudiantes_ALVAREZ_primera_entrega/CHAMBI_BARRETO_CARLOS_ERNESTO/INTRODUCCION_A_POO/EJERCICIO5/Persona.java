package INTRODUCCION_A_POO.EJERCICIO5;

public class Persona {
    public String nombre;
    private String paterno;
    private String materno;
    public int edad;
    private int ci;

    public Persona(String nombre, String paterno, String materno, int edad, int ci){
        this.nombre=nombre;
        this.paterno=paterno;
        this.materno=materno;
        this.edad=edad;
        this.ci=ci;
    }
    // b mostrar dartos
    public void mostrarDatos(){
        System.out.println("nombre completo = " + nombre + " " + paterno + " " + materno );
        System.out.println("Edad = " + edad);
        System.out.println("Cedula de identidad = " + ci);
    }
    public boolean mayorDeEdad(){
        return edad>=18;
    }
    public void ModificarEdad(int n){
        this.edad=n;
        System.out.println("C edad nueva es: " + n);
    }
    public String getPaterno(){
        return paterno;
    }

}
