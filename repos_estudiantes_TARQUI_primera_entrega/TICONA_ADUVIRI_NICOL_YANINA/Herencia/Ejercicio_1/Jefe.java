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
class Jefe extends Persona {

    private String sucursal;
    private String tipo;

    public Jefe(String nombre, String apellido, String ci, String sucursal, String tipo) {
        super(nombre, apellido, ci);
        this.sucursal = sucursal;
        this.tipo = tipo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Sucursal: " + sucursal);
        System.out.println("Tipo: " + tipo);
        System.out.println("-----------------------------");
    }
}
