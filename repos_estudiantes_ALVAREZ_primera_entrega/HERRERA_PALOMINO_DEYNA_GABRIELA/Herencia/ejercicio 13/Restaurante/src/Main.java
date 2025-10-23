public class Main {
    public static void main(String[] args) {
        Chef chef1 = new Chef("Juan", 2000, 10, 50, "Italiano");

        Mesero mesero1 = new Mesero("Pedro", 1200, 5, 30, 150);
        Mesero mesero2 = new Mesero("Luis", 1100, 8, 25, 200);

        Administrativo admin1 = new Administrativo("Ana", 1800, "Contabilidad");
        Administrativo admin2 = new Administrativo("Marta", 1800, "Recepción");

        Empleado[] empleados = {chef1, mesero1, mesero2, admin1, admin2};

        float X = 1800; 
        System.out.println("Empleados con sueldo mensual = " + X + ":");
        for (Empleado e : empleados) {
            if (e.getSueldoMes() == X) {
                e.mostrarDatos();
            }
        }

        System.out.println("\nSueldo total de todos los empleados:");
        for (Empleado e : empleados) {
            System.out.println(e.nombre + " - Sueldo total: " + e.sueldoTotal());
        }
    }
}
