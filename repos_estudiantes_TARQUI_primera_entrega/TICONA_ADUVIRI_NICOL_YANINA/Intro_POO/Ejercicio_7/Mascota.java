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
class Mascota {

    private String nombre;
    private String tipo;
    private int energia;

    public Mascota(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.energia = 50;
    }

    // Método para alimentar
    public void alimentar() {
        energia += 20;
        if (energia > 100) {
            energia = 100;
        }
        System.out.println(nombre + " ha sido alimentado. Energía actual: " + energia);
    }

    // Método para jugar
    public void jugar() {
        energia -= 15;
        if (energia < 0) {
            energia = 0;
        }
        System.out.println(nombre + " ha jugado. Energía actual: " + energia);
    }

    // Método para mostrar energía
    public void mostrarEnergia() {
        System.out.println("Energía de " + nombre + ": " + energia);
    }
}
