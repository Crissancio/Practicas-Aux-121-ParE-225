public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Juan", "Perez", "123456", "C-01", "CL-001");
        Jefe j1 = new Jefe("Maria", "Lopez", "789012", "Sucursal Central", "General");

        System.out.println(" CLIENTE ");
        c1.mostrarDatos();

        System.out.println(" JEFE ");
        j1.mostrarDatos();
    }
}
