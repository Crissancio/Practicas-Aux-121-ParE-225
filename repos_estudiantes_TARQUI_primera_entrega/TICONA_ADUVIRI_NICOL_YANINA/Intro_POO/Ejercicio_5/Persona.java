/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introduccionpoo;

/**
 *
 * @author HP-RYZEN 5
 */
//Nicol Yanina Ticona Aduviri
//R.U: 1855987
class Persona {
    private String nombre;
    private String paterno;
    private String materno;
    private int edad;
    private String ci;

    // Constructor
    public Persona(String nombre, String paterno, String materno, int edad, String ci) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
        this.ci = ci;
    }

    // Mostrar datos
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " " + paterno + " " + materno);
        System.out.println("Edad: " + edad);
        System.out.println("CI: " + ci);
        System.out.println("-------------------------");
    }

    // Verificar si es mayor de edad
    public boolean mayorDeEdad() {
        return edad >= 18;
    }

    // Modificar edad
    public void modificarEdad(int nuevo) {
        this.edad = nuevo;
    }

    // Getter del apellido paterno
    public String getPaterno() {
        return paterno;
    }
}
