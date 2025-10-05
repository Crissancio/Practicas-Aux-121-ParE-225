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
public class Chef extends Empleadoo {

    private int horaExtra;
    private String tipo;
    private float sueldoHora;

    public Chef(String nombre, float sueldomes, int horaExtra, String tipo, float sueldoHora) {
        super(nombre, sueldomes);
        this.horaExtra = horaExtra;
        this.tipo = tipo;
        this.sueldoHora = sueldoHora;
    }

    @Override
    public float sueldoTotal() {
        return sueldomes + (horaExtra * sueldoHora);
    }
}
