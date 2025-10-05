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
class Personaa {

    protected String nombre;
    protected String paterno;
    protected String materno;
    protected int edad;

    public Personaa(String nombre, String paterno, String materno, int edad) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + " " + paterno + " " + materno);
        System.out.println("Edad: " + edad);
    }

    public int getEdad() {
        return edad;
    }
}
