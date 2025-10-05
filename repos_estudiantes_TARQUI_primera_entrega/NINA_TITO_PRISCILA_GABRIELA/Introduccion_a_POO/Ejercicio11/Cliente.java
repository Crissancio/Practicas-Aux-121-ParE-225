package PRACTICA1AUXILIATURA.Introduccion_a_POO.Ejercicio11;

import java.util.ArrayList;
class Cliente {
    private String nombre;
    private ArrayList<String> pedido;

    // Constructor
    public Cliente(String nombre, ArrayList<String> pedido) {
        this.nombre = nombre;
        this.pedido = pedido;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getPedido() {
        return pedido;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPedido(ArrayList<String> pedido) {
        this.pedido = pedido;
    }
}
