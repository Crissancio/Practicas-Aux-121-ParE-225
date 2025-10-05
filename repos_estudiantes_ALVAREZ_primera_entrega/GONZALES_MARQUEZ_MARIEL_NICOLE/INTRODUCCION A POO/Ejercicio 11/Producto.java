public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        System.out.println("Producto '" + nombre + "' creado.");
    }

    public void cerrar() {
        System.out.println("Producto '" + nombre + "' eliminado de memoria.");
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrar() {
        System.out.println("Producto: " + nombre + " - Precio: Bs " + precio);
    }
}
