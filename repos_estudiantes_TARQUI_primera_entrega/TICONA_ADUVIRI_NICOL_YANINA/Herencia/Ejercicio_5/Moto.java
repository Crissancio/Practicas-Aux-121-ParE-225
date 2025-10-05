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
class Moto extends Vehiculo {

    private int cilindrada;
    private boolean casco;

    public Moto(String conductor, String placa, int id, int cilindrada, boolean casco) {
        super(conductor, placa, id);
        this.cilindrada = cilindrada;
        this.casco = casco;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cilindrada: " + cilindrada + "cc | Casco obligatorio: " + (casco ? "Sí" : "No"));
        System.out.println("------------------------------------");
    }
}
