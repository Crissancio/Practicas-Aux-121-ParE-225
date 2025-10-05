package Ejercicio13;

import java.util.*;

class Fruta {
    private String nombre;
    private String tipo;
    private int nroVitaminas;
    private String[] vitaminas;

    public Fruta(String nombre, String tipo, String[] vitaminas) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nroVitaminas = vitaminas.length;
        this.vitaminas = vitaminas;
    }

    public Fruta(String nombre) {
        this(nombre, "desconocido", new String[]{"C", "A"});
    }

    public Fruta(String nombre, String tipo) {
        this(nombre, tipo, new String[]{"B", "E"});
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNroVitaminas() {
        return nroVitaminas;
    }

    public String[] getVitaminas() {
        return vitaminas;
    }

    public void mostrarVitaminas() {
        System.out.println("Vitaminas de " + nombre + ": " + Arrays.toString(vitaminas));
    }

    @Override
    public String toString() {
        return nombre + " (" + tipo + ") - Nº vitaminas: " + nroVitaminas;
    }
}
