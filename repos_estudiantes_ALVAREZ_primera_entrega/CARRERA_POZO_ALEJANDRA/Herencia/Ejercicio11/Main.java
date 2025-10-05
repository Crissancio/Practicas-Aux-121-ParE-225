package Herencia.Ejercicio11;
interface Persona {
    String getNombre();
    int getEdad();
}

interface Empleado {
    double getSueldo();
    String getCargo();
}

interface Policia {
    String getGrado();
    String getCodigo();
}
class JefePolicia implements Persona, Empleado, Policia {
    private String nombre;
    private int edad;
    private double sueldo;
    private String cargo;
    private String grado;
    private String codigo;
    public JefePolicia(String nombre, int edad, double sueldo, String cargo, String grado, String codigo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        this.cargo = cargo;
        this.grado = grado;
        this.codigo = codigo;
    }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }

    public double getSueldo() { return sueldo; }
    public String getCargo() { return cargo; }

    public String getGrado() { return grado; }
    public String getCodigo() { return codigo; }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Cargo: " + cargo);
        System.out.println("Grado: " + grado);
        System.out.println("Código: " + codigo);
    }
}

public class Main {
    public static void main(String[] args) {
        JefePolicia jefe1 = new JefePolicia("Carlos", 45, 3500.50, "Comandante", "Teniente", "JP001");
        JefePolicia jefe2 = new JefePolicia("Lucía", 38, 4100.00, "Inspectora", "Teniente", "JP002");

        jefe1.mostrar();
        jefe2.mostrar();
        if (jefe1.getSueldo() > jefe2.getSueldo()) {
            System.out.println(jefe1.getNombre() + " tiene mayor sueldo.");
        } else {
            System.out.println(jefe2.getNombre() + " tiene mayor sueldo.");
        }
        if (jefe1.getGrado().equals(jefe2.getGrado())) {
            System.out.println("Ambos tienen el mismo grado: " + jefe1.getGrado());
        } else {
            System.out.println("Tienen grados diferentes.");
        }
    }
}
