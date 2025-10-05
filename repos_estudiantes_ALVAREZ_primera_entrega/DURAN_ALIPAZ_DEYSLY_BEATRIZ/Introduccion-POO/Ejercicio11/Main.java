package Ejercicio11;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Café Latte", 18.50);

        Pedido ped1 = new Pedido(101, "Registrado");

        System.out.println("=== Información del Producto ===");
        p1.mostrarInfo();

        System.out.println("\n=== Información del Pedido ===");
        ped1.mostrarInfo();
    }
}
