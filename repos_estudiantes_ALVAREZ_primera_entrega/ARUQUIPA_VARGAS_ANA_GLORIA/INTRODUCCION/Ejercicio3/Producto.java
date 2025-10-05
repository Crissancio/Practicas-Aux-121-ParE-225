package Ejercicio3;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
    }

    public void vender(int cantidad) {
        if (cantidad > 0 && cantidad <= stock) {
            stock -= cantidad;
            System.out.println("Se vendieron " + cantidad + " unidades de " + nombre);
        } else {
            System.out.println("No hay suficiente stock para vender " + cantidad + " unidades.");
        }
    }

    public void reabastecer(int cantidad) {
        if (cantidad > 0) {
            stock += cantidad;
            System.out.println("Se reabastecieron " + cantidad + " unidades de " + nombre);
        } else {
            System.out.println("La cantidad a reabastecer debe ser mayor que cero.");
        }
    }
    public void mostrarInfo() {
        System.out.println("Producto: " +nombre+ ", Precio: $" +precio+ ", Stock: " + stock);
    }
}

