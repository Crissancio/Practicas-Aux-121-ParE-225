package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Gaseosa", 8.50, 20);

        producto1.vender(5);
        producto1.reabastecer(10);
        producto1.vender(30);
    }
}
