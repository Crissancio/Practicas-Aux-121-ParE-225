public class Main {
    public static void main(String[] args) {
        
        Ordenador o1 = new Ordenador("S001", 1, 4, "Intel i3", "activo");
        Ordenador o2 = new Ordenador("S002", 2, 16, "Intel i7", "activo");
        Ordenador o3 = new Ordenador("S003", 3, 8, "AMD Ryzen 5", "inactivo");
        Ordenador o4 = new Ordenador("S004", 4, 12, "Intel i9", "activo");
        Ordenador o5 = new Ordenador("S005", 5, 4, "Intel i5", "inactivo");
        Ordenador o6 = new Ordenador("S006", 6, 32, "AMD Ryzen 9", "activo");

        Ordenador[] todos = {o1, o2, o3, o4, o5, o6};

        Laboratorio lasin1 = new Laboratorio("Lasin 1", 5);
        Laboratorio lasin2 = new Laboratorio("Lasin 2", 5);

        lasin1.agregarOrdenador("S001");
        lasin1.agregarOrdenador("S002");
        lasin1.agregarOrdenador("S003");

        lasin2.agregarOrdenador("S004");
        lasin2.agregarOrdenador("S005");
        lasin2.agregarOrdenador("S006");

        lasin1.informacion(todos, "activo");
        lasin2.informacion(todos, "inactivo");

        lasin1.informacion(todos, 8);
        lasin2.informacion(todos, 8);
        String[] codigosTraslado = {"S001", "S003"};
        lasin1.trasladar(lasin2, codigosTraslado);

        lasin1.informacion(todos);
        lasin2.informacion(todos);
    }
}
