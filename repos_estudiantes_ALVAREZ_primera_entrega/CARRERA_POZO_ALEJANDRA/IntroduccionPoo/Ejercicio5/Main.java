package IntroduccionPoo.Ejercicio5;

    public class Main {
    public static void main(String[] args) {
    
        Persona p1 = new Persona("Juan", "Pérez", "Lopez", 20, "1234567");
        Persona p2 = new Persona("María", "Pérez", "Gómez", 17, "7654321");

        p1.mostrarDatos();
        p2.mostrarDatos();

        System.out.println();
        System.out.println(p1.getNombre() + (p1.mayorDeEdad() ? " es mayor de edad." : " es menor de edad."));
        System.out.println(p2.getNombre() + (p2.mayorDeEdad() ? " es mayor de edad." : " es menor de edad."));

        System.out.println();
        p2.modificarEdad(18);

        System.out.println(p2.getNombre() + (p2.mayorDeEdad() ? " ahora es mayor de edad." : " sigue siendo menor de edad."));

        System.out.println();
        if (p1.tieneMismoApellidoPaterno(p2)) {
            System.out.println("Las dos personas tienen el mismo apellido paterno.");
        } else {
            System.out.println("Las dos personas NO tienen el mismo apellido paterno.");
        }
    }
}

    

