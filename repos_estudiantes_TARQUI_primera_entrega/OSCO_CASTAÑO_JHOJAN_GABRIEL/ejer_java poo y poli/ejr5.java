package prac1_prog2;

public class ejr5 {
	    public static void main(String[] args) {
	        Persona p1 = new Persona("Ana", "Perez", "Lopez", 22, "12345215");
	        Persona p2 = new Persona("Luis", "Perez", "Garcia", 17, "678905258");
	        p1.mostrarDatos();
	        p2.mostrarDatos();
	        System.out.println("¿Ana es mayor de edad? " + p1.mayorDeEdad());
	        System.out.println("¿Luis es mayor de edad? " + p2.mayorDeEdad());
	        System.out.println("¿Tienen el mismo apellido paterno? " + p1.mismoApellido(p2));
	    }
	}
	class Persona {
	    private String nombre;
	    private String apellidoPaterno;
	    private String apellidoMaterno;
	    private int edad;
	    private String dni;

	    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String dni) {
	        this.nombre = nombre;
	        this.apellidoPaterno = apellidoPaterno;
	        this.apellidoMaterno = apellidoMaterno;
	        this.edad = edad;
	        this.dni = dni;
	    }
	    public void mostrarDatos() {
	        System.out.println("Nombre: " + nombre + " " + apellidoPaterno + " " + apellidoMaterno
	                + " | Edad: " + edad + " | CI: " + dni);
	    }
	    public boolean mayorDeEdad() {
	        return edad >= 18;
	    }
	    public boolean mismoApellido(Persona otra) {
	        return this.apellidoPaterno.equalsIgnoreCase(otra.apellidoPaterno);
	    }
	}
