package IntroduccionPoo.Ejercicio5;

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

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
            this.nombre = nombre;   
    }

    public String getPaterno() {
        return paterno;
    }
    public void setPaterno(String paterno) {
            this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
            this.materno = materno;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
            this.edad = edad;
    }

    public String getCi() {
        return ci;
    }
    public void setCi(String ci) {
            this.ci = ci;
    }

    public void mostrarDatos() {
        System.out.println("----- Datos de la persona -----");
        System.out.println("Nombre completo: " + nombre + " " + paterno + " " + materno);
        System.out.println("Edad: " + edad);
        System.out.println("CI: " + ci);
    }

    public boolean mayorDeEdad() {
        return this.edad >= 18;
    }

    public void modificarEdad(int nuevo) {
        setEdad(nuevo);
        System.out.println("Edad actualizada a: " + this.edad + " para " + nombre);
    }

    public boolean tieneMismoApellidoPaterno(Persona otra) {
        return this.paterno.equalsIgnoreCase(otra.paterno);
    }
}
