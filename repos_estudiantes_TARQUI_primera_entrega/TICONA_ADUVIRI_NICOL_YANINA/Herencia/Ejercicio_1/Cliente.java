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

class Cliente extends Persona {
    private String nroCompra;
    private String idCliente;

    public Cliente(String nombre, String apellido, String ci, String nroCompra, String idCliente) {
        super(nombre, apellido, ci);
        this.nroCompra = nroCompra;
        this.idCliente = idCliente;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Nro de Compra: " + nroCompra);
        System.out.println("ID Cliente: " + idCliente);
        System.out.println("-----------------------------");
    }
}
