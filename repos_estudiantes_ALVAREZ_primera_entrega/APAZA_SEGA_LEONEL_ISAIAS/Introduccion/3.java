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
            System.out.println("Venta realizada: " + cantidad + " unidades de " + nombre);
        } else {
            System.out.println("No hay suficiente stock disponible.");
        }
    }

    public void reabastecer(int cantidad) {
        stock += cantidad;
        System.out.println("Stock actualizado: " + stock);
    }

    public void mostrar() {
        System.out.println("Producto: " + nombre + " | Precio: " + precio + " | Stock: " + stock);
    }

    public static void main(String[] args) {
        Producto p1 = new Producto("Laptop", 5500.0, 10);
        p1.mostrar();
        p1.vender(3);
        p1.reabastecer(5);
        p1.mostrar();
    }
}

