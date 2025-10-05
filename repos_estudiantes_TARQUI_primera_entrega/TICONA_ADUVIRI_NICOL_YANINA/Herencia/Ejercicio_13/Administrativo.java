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
public class Administrativo extends Empleadoo {

    private String cargo;

    public Administrativo(String nombre, float sueldomes, String cargo) {
        super(nombre, sueldomes);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
}
