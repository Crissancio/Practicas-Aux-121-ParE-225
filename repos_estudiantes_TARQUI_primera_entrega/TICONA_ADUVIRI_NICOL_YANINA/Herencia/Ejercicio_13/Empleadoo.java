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
public class Empleadoo {

    protected String nombre;
    protected float sueldomes;

    public Empleadoo(String nombre, float sueldomes) {
        this.nombre = nombre;
        this.sueldomes = sueldomes;
    }

    public float sueldoTotal() {
        return sueldomes;
    }

    public String getNombre() {
        return nombre;
    }

    public float getSueldomes() {
        return sueldomes;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + nombre + " - Sueldo mensual: " + sueldomes;
    }
}
