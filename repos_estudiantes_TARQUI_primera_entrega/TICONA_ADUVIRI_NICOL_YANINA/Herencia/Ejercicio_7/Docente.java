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
class Docente extends Personaa {

    private double sueldo;
    private String regProfesional;

    public Docente(String nombre, String paterno, String materno, int edad, double sueldo, String regProfesional) {
        super(nombre, paterno, materno, edad);
        this.sueldo = sueldo;
        this.regProfesional = regProfesional;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Registro Profesional: " + regProfesional);
        System.out.println("-----------------------------------");
    }
}
