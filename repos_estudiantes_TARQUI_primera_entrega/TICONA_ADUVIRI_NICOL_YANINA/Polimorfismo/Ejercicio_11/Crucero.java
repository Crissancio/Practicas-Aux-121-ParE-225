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
class Crucero {

    private String nombre;
    private String paisOrigen;
    private String paisDestino;
    private int nroPasajeros;
    private Pasajero[] pasajeros;
    private int[] nroHabitacion;
    private int[] costoPasaje;

    public Crucero(String nombre, String paisOrigen, String paisDestino, int capacidad) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.paisDestino = paisDestino;
        this.pasajeros = new Pasajero[capacidad];
        this.nroHabitacion = new int[capacidad];
        this.costoPasaje = new int[capacidad];
        this.nroPasajeros = 0;
    }

    public void agregarPasajero(Pasajero p, int habitacion, int costo) {
        if (nroPasajeros < pasajeros.length) {
            pasajeros[nroPasajeros] = p;
            nroHabitacion[nroPasajeros] = habitacion;
            costoPasaje[nroPasajeros] = costo;
            nroPasajeros++;
        } else {
            System.out.println("No hay más espacio en el crucero.");
        }
    }

    public void mostrar() {
        System.out.println("\nCrucero: " + nombre + " | Origen: " + paisOrigen + " | Destino: " + paisDestino);
        System.out.println("Pasajeros a bordo: " + nroPasajeros);
        for (int i = 0; i < nroPasajeros; i++) {
            pasajeros[i].mostrar();
            System.out.println("  Habitación: " + nroHabitacion[i] + " | Costo: " + costoPasaje[i]);
        }
    }

    public int costoTotal() {
        int suma = 0;
        for (int i = 0; i < nroPasajeros; i++) {
            suma += costoPasaje[i];
        }
        return suma;
    }

    public boolean mismoCosto(Crucero c) {
        return this.costoTotal() == c.costoTotal();
    }

    public boolean mismoNumeroPasajeros(Crucero c) {
        return this.nroPasajeros == c.nroPasajeros;
    }

    public void contarGenero() {
        int hombres = 0, mujeres = 0;
        for (int i = 0; i < nroPasajeros; i++) {
            if (pasajeros[i].getGenero().equalsIgnoreCase("M")) {
                hombres++;
            } else if (pasajeros[i].getGenero().equalsIgnoreCase("F")) {
                mujeres++;
            }
        }
        System.out.println("En el crucero " + nombre + " hay " + hombres + " hombres y " + mujeres + " mujeres.");
    }
}
