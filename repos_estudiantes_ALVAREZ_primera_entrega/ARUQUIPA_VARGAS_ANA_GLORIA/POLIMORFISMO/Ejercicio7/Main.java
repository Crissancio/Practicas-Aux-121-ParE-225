package Ejercicio7;

public class Main {
    public static void main(String[] args) {
        Parada parada = new Parada("Parada Central");

        parada.adicionar("Juan Pérez");
        parada.adicionar("Lucía Gómez");

        parada.adicionar("Toyota Yaris", "Carlos Soto", "XYZ-123");
        parada.adicionar("Nissan Versa", "Ana López", "ABC-456");

        System.out.println("\nDATOS DE LA PARADA");
        parada.mostrar();
    }
}
