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
class JefePolicia extends Personna implements Empleado, Policia {
    private double sueldo;
    private int antiguedad;
    private String grado;
    private String unidad;

    public JefePolicia(String nombre, int edad, double sueldo, int antiguedad, String grado, String unidad) {
        super(nombre, edad);
        this.sueldo = sueldo;
        this.antiguedad = antiguedad;
        this.grado = grado;
        this.unidad = unidad;
    }

    // Métodos de Empleado
    @Override
    public double getSueldo() {
        return sueldo;
    }

    @Override
    public int getAntiguedad() {
        return antiguedad;
    }
    @Override
    public String getGrado() {
        return grado;
    }

    @Override
    public String getUnidad() {
        return unidad;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre +
                           ", Edad: " + edad +
                           ", Sueldo: " + sueldo +
                           ", Antigüedad: " + antiguedad +
                           " años, Grado: " + grado +
                           ", Unidad: " + unidad);
    }
}
