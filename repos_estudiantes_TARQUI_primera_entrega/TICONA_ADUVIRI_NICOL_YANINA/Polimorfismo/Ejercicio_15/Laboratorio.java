/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo;

/**
 *
 * @author HP-RYZEN 5
 */
//Nicol Yanina Ticona Aduviri
//R.U; 1855987
class Laboratorio {

    private String nombre;
    private int capacidad;
    private Ordenador[] ordenadores;
    private int contador;

    public Laboratorio(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.ordenadores = new Ordenador[capacidad];
        this.contador = 0;
    }

    public void agregarOrdenador(Ordenador o) {
        if (contador < capacidad) {
            ordenadores[contador++] = o;
        } else {
            System.out.println("No hay espacio en " + nombre);
        }
    }

    // a) Mostrar según estado
    public void informacion(boolean activo) {
        System.out.println("\nOrdenadores en " + nombre + " con estado " + (activo ? "Activo" : "Inactivo") + ":");
        for (int i = 0; i < contador; i++) {
            if (ordenadores[i].isActivo() == activo) {
                System.out.println(ordenadores[i]);
            }
        }
    }

    // b) Mostrar los ordenadores del laboratorio
    public void informacion() {
        System.out.println("\nOrdenadores en " + nombre + ":");
        for (int i = 0; i < contador; i++) {
            System.out.println(ordenadores[i]);
        }
    }

    // c) Mostrar ordenadores con más de 8GB RAM
    public void informacion(int ramMinima) {
        System.out.println("\nOrdenadores en " + nombre + " con RAM > " + ramMinima + "GB:");
        for (int i = 0; i < contador; i++) {
            if (ordenadores[i].getRam() > ramMinima) {
                System.out.println(ordenadores[i]);
            }
        }
    }

    public void trasladar(Laboratorio destino, int cantidad) {
        System.out.println("\n--- Trasladando " + cantidad + " ordenadores de " + nombre + " a " + destino.nombre + " ---");

        int trasladados = 0;
        for (int i = 0; i < contador && trasladados < cantidad; i++) {
            Ordenador o = ordenadores[i];
            destino.agregarOrdenador(o);
            ordenadores[i] = null;
            trasladados++;
        }

        compactar();
    }

    private void compactar() {
        Ordenador[] temp = new Ordenador[capacidad];
        int idx = 0;
        for (int i = 0; i < contador; i++) {
            if (ordenadores[i] != null) {
                temp[idx++] = ordenadores[i];
            }
        }
        ordenadores = temp;
        contador = idx;
    }
}
