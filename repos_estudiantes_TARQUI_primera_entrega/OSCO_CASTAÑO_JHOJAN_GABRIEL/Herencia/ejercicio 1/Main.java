package herencia;
public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Jhon", "llanque", "987654", "N001", "C44");
        Jefe j1 = new Jefe("Ana", "Torres", "151661", "Sucursal La paz", "General");

        System.out.println(c1.mostrarDatos());
        System.out.println(j1.mostrarDatos());
    }
}