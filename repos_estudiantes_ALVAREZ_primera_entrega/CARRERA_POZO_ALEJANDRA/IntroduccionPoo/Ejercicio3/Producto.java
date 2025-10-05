package IntroduccionPoo.Ejercicio3;

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
        if (cantidad > 0) {
            if (cantidad <= stock) {
                stock = cantidad;
                System.out.println("Se vendieron " + cantidad + " unidades de " + nombre);
            } else {
                System.out.println("No hay suficiente stock para vender " + cantidad + " unidades.");
            }
        } else {
            System.out.println("La cantidad a vender debe ser mayor a 0.");
        }
    }

    public void reabastecer(int cantidad) {
        if (cantidad > 0) {
            stock += cantidad;
            System.out.println("Se reabastecieron " + cantidad + " unidades de " + nombre);
        } else {
            System.out.println("La cantidad a reabastecer debe ser mayor a 0.");
        }
    }

    public void mostrarInfo() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: Bs. " + precio);
        System.out.println("Stock disponible: " + stock);
    }
}

