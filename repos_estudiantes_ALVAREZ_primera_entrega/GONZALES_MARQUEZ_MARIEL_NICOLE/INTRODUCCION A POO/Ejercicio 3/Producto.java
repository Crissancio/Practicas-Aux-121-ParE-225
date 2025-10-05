class Producto {
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
            System.out.println(cantidad + " unidades de " + nombre + " vendidas.");
        } else {
            System.out.println("No hay suficiente stock para vender " + cantidad + " unidades de " + nombre);
        }
    }

    public void reabastecer(int cantidad) {
        stock += cantidad;
        System.out.println(cantidad + " unidades de " + nombre + " reabastecidas.");
    }

    public void mostrarInfo() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: Bs. " + precio);
        System.out.println("Stock disponible: " + stock);
        System.out.println("-----------------------");
    }
}
