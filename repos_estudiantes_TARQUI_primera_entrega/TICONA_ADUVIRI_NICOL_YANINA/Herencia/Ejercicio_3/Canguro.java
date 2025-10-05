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
class Canguro extends Animal {

    public Canguro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void desplazarse() {
        System.out.println(nombre + " salta con fuerza sobre sus patas traseras.");
    }
}
