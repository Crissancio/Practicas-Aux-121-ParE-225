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
class Bus {

    private int capacidad;
    private int pasajeros;
    private double costoPasaje;
    private double totalRecaudado;

    public Bus(int capacidad) {
        this.capacidad = capacidad;
        this.pasajeros = 0;
        this.costoPasaje = 1.50;
        this.totalRecaudado = 0.0;
    }

    public void subirPasajeros(int x) {
        if (pasajeros + x <= capacidad) {
            pasajeros += x;
            System.out.println(x + " pasajeros subieron al bus.");
        } else {
            int espacio = capacidad - pasajeros;
            pasajeros = capacidad;
            System.out.println("El bus solo pudo aceptar " + espacio + " pasajeros. El resto no entró.");
        }
    }

    public void cobrarPasaje() {
        double cobro = pasajeros * costoPasaje;
        totalRecaudado += cobro;
        System.out.println("Se cobraron Bs. " + cobro + " a " + pasajeros + " pasajeros.");
    }

    public int asientosDisponibles() {
        return capacidad - pasajeros;
    }

    @Override
    public String toString() {
        return "Bus [Capacidad: " + capacidad
                + ", Pasajeros: " + pasajeros
                + ", Asientos disponibles: " + asientosDisponibles()
                + ", Total recaudado: Bs. " + totalRecaudado + "]";
    }
}
