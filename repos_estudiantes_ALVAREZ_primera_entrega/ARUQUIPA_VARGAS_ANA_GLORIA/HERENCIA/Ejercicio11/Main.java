package Ejercicio11;

public class Main {
    public static void main(String[] args) {
        JefePolicia jefe1 = new JefePolicia("Carlos", "Ramírez", 101, 3500.50, "Teniente", 1234);
        JefePolicia jefe2 = new JefePolicia("Luis", "Gómez", 102, 4000.75, "Capitán", 5678);

        jefe1.mostrarDatos();
        jefe2.mostrarDatos();

        if(jefe1.getSueldo() > jefe2.getSueldo()) {
            System.out.println("El jefe con mayor sueldo es: " + jefe1.getNombre() + " " + jefe1.getApellido());
        } else if(jefe2.getSueldo() > jefe1.getSueldo()) {
            System.out.println("El jefe con mayor sueldo es: " + jefe2.getNombre() + " " + jefe2.getApellido());
        } else {
            System.out.println("Ambos jefes tienen el mismo sueldo.");
        }

        if(jefe1.getGrado().equals(jefe2.getGrado())) {
            System.out.println("Ambos tienen el mismo grado: " + jefe1.getGrado());
        } else {
            System.out.println("Tienen grados diferentes: " + jefe1.getGrado() + " y " + jefe2.getGrado());
        }
    }
}

