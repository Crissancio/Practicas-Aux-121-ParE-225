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
public class Mesero extends Empleadoo {

    private double propina;
    private int horaExtra;
    private float sueldoHora;

    public Mesero(String nombre, float sueldomes, double propina, int horaExtra, float sueldoHora) {
        super(nombre, sueldomes);
        this.propina = propina;
        this.horaExtra = horaExtra;
        this.sueldoHora = sueldoHora;
    }

    @Override
    public float sueldoTotal() {
        return (float) (sueldomes + (horaExtra * sueldoHora) + propina);
    }
}
