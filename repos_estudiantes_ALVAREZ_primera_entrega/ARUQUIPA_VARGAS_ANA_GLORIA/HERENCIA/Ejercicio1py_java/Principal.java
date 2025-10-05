public class Principal {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan", "Pérez", "12345678", "C001", "CL001");
        cliente1.mostrarDatos();
        cliente1.method("Consulta");

        System.out.println();

        Jefe jefe1 = new Jefe("Laura", "González", "87654321", "Sucursal Centro", "General");
        jefe1.mostrarDatos();
        jefe1.method("Administración");
    }
}

