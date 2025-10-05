package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("pc", 8200.0, 20);

        producto1.mostrarInfo();
        producto1.vender(3);
        producto1.mostrarInfo();
        producto1.reabastecer(5);
        producto1.mostrarInfo();
    }
}

