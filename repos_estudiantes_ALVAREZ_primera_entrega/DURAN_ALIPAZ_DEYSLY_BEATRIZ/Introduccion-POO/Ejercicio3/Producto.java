package Ejercicio3;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void vender(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            double total = cantidad * precio;
            System.out.println("Se vendieron " + cantidad + " unidades de " + nombre);
            System.out.println("Total cobrado: Bs. " + String.format("%.2f", total));
        } else {
            System.out.println("No hay suficiente stock para vender " + cantidad + " unidades.");
            System.out.println("Stock actual: " + stock);
        }
    }
    public void reabastecer(int cantidad) {
        stock += cantidad;
        System.out.println("Se reabastecieron " + cantidad + " unidades de " + nombre);
        System.out.println("Stock actualizado: " + stock);
    }
}
