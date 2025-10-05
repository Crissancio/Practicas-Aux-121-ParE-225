public class TestPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona("Mariel", "Gonzalez", "Lopez", 20, "123456");
        Persona p2 = new Persona("Carlos", "Gonzalez", "Perez", 17, "654321");

        p1.mostrarDatos();
        p2.mostrarDatos();

        System.out.println("p1 es mayor de edad? " + p1.mayorDeEdad());
        System.out.println("p2 es mayor de edad? " + p2.mayorDeEdad());

        p2.modificarEdad(18);
        System.out.println("p2 ahora es mayor de edad? " + p2.mayorDeEdad());

        if (p1.getPaterno().equals(p2.getPaterno())) {
            System.out.println("Tienen el mismo apellido paterno.");
        } else {
            System.out.println("Apellidos paternos diferentes.");
        }
    }
}
