package PRACTICA1AUXILIATURA.Introduccion_a_POO.Ejercicio3;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public void vender(int cantidad){
        if (cantidad <= stock){
            stock = stock - cantidad;
            System.out.println("Se vendieron " + cantidad + " unidades de " + nombre);
            System.out.println("Quedan " + stock + " unidades en stock.");
        } else {
            System.out.println("No hay suficiente stock para vender " + cantidad + " unidades de " + nombre);
        }
    }
    public void reabastecer(int cantidad){
        stock = stock + cantidad;
        System.out.println("Se reabastecieron " + cantidad + " unidades de " + nombre);
        System.out.println("Ahora hay " + stock + " unidades en stock.");
    }

    public static void main(String[] args){
        Producto p1 = new Producto("Manzana", 5.0, 100);
        System.out.println("-Producto: " + p1.nombre + ", Precio: " + p1.precio + ", Stock inicial: " + p1.stock);
        p1.vender(25);
        p1.reabastecer(50);
        p1.vender(150);
        System.out.println("-------------------");
        Producto p2 = new Producto("Naranja", 3.0, 80);
        System.out.println("-Producto: " + p2.nombre + ", Precio: " + p2.precio + ", Stock inicial: " + p2.stock);
        p2.vender(30);  
        p2.reabastecer(20);
    }
}
