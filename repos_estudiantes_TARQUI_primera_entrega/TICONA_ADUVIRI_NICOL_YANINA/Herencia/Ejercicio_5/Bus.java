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
class Bus extends Vehiculo {

    private int capacidad;
    private String sindicato;

    public Bus(String conductor, String placa, int id, int capacidad, String sindicato) {
        super(conductor, placa, id);
        this.capacidad = capacidad;
        this.sindicato = sindicato;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Capacidad: " + capacidad + " pasajeros | Sindicato: " + sindicato);
        System.out.println("------------------------------------");
    }
}
