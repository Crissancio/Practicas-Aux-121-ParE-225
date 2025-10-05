/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introduccionpoo;

/**
 *
 * @author HP-RYZEN 5
 */
//Nicol Yanina Ticona Aduviri
//R.U: 1855987
import java.util.Arrays;

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

    // para mostrar info
    @Override
    public String toString() {
        return "Fruta: " + nombre + " | Tipo: " + tipo
                + " | nroVitaminas: " + nroVitaminas
                + " | Vitaminas: " + Arrays.toString(vitaminas);
    }
}
