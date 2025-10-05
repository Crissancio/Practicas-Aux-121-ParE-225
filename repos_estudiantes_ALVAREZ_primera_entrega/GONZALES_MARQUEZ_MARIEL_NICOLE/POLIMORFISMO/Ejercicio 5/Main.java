public class Main {
    public static void main(String[] args) {
        Celular c = new Celular("7654321", "Mariel", 64, 4, 15);

        System.out.println("Antes de los operadores:");
        c.mostrar();

        c.incrementarApps();
        c.reducirEspacio();

        System.out.println("Después de los operadores:");
        c.mostrar();
    }
}
