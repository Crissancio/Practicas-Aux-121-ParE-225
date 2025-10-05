public class Main {
    public static void main(String[] args) {
        Laboratorio lasin1 = new Laboratorio("Lasin 1", 10);
        Laboratorio lasin2 = new Laboratorio("Lasin 2", 10);

        Ordenador o1 = new Ordenador("A100", 1, 8, "Intel i5", "Activo");
        Ordenador o2 = new Ordenador("A101", 2, 4, "AMD Ryzen 3", "Inactivo");
        Ordenador o3 = new Ordenador("A102", 3, 16, "Intel i7", "Activo");
        Ordenador o4 = new Ordenador("B200", 4, 12, "AMD Ryzen 5", "Activo");
        Ordenador o5 = new Ordenador("B201", 5, 6, "Intel i3", "Inactivo");
        Ordenador o6 = new Ordenador("B202", 6, 32, "Intel i9", "Activo");

        lasin1.agregarOrdenador(o1);
        lasin1.agregarOrdenador(o2);
        lasin1.agregarOrdenador(o3);
        lasin2.agregarOrdenador(o4);
        lasin2.agregarOrdenador(o5);
        lasin2.agregarOrdenador(o6);

        System.out.println("\n=== ESTADO INICIAL ===");
        lasin1.informacion();
        lasin2.informacion();

        lasin1.informacion("Activo");
        lasin2.informacion(8);

        System.out.println("\n=== ANTES DEL TRASLADO ===");
        lasin1.informacion();
        lasin2.informacion();

        lasin1.trasladar(lasin2, "A100", "A102");

        System.out.println("\n=== DESPUÉS DEL TRASLADO ===");
        lasin1.informacion();
        lasin2.informacion();
    }
}
