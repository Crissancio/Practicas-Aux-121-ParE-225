/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author HP-RYZEN 5
 */
//Nicol Yanina Ticona Aduviri
//R.U: 1855987
class Vehiculo {

    protected String conductor;
    protected String placa;
    protected int id;

    public Vehiculo(String conductor, String placa, int id) {
        this.conductor = conductor;
        this.placa = placa;
        this.id = id;
    }

    public void mostrarInfo() {
        System.out.println("Placa: " + placa + " | Conductor: " + conductor);
    }

    public void cambiarConductor(String nuevoConductor) {
        this.conductor = nuevoConductor;
        System.out.println("El conductor ha sido cambiado a: " + nuevoConductor);
    }
}
