package Ejercicio11;

public class Cliente {
    private String nombre;
    private int mesa;

    public Cliente(String nombre, int mesa) {
        this.nombre = nombre;
        this.mesa = mesa;
        System.out.println("Cliente '" + nombre + "' creado.");
    }
    public String getNombre() {
        return nombre;
    }

    public int getMesa() {
        return mesa;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public void eliminar() {
        System.out.println("Cliente '" + nombre + "' eliminado.");
    }

    @Override
    public String toString() {
        return "Cliente(nombre=" + nombre + ", mesa=" + mesa + ")";
    }
}

