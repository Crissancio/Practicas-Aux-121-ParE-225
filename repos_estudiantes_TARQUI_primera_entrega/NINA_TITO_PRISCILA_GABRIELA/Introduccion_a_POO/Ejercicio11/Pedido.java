package PRACTICA1AUXILIATURA.Introduccion_a_POO.Ejercicio11;

import java.util.ArrayList;
public class Pedido {
    private ArrayList<String> productos;
    private String estado;

    // Constructor
    public Pedido(ArrayList<String> productos, String estado) {
        this.productos = productos;
        this.estado = estado;
    }

    // Getters
    public ArrayList<String> getProductos() {
        return productos;
    }

    public String getEstado() {
        return estado;
    }

    // Setters
    public void setProductos(ArrayList<String> productos) {
        this.productos = productos;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
