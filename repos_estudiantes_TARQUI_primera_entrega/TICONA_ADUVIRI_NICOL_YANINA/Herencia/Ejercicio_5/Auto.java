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
class Auto extends Vehiculo {

    private int caballosFuerza;
    private boolean descapotable;

    public Auto(String conductor, String placa, int id, int caballosFuerza, boolean descapotable) {
        super(conductor, placa, id);
        this.caballosFuerza = caballosFuerza;
        this.descapotable = descapotable;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Caballos de fuerza: " + caballosFuerza
                + " | Descapotable: " + (descapotable ? "Sí" : "No"));
        System.out.println("------------------------------------");
    }
}
