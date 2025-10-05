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
class Estudiante extends Personaa {

    private int ru;
    private String matricula;

    public Estudiante(String nombre, String paterno, String materno, int edad, int ru, String matricula) {
        super(nombre, paterno, materno, edad);
        this.ru = ru;
        this.matricula = matricula;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("RU: " + ru);
        System.out.println("Matrícula: " + matricula);
        System.out.println("-----------------------------------");
    }

    public void modificarEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
    }

    // Método estático para calcular el promedio de edades
    public static double promedio(Estudiante e1, Estudiante e2) {
        return (e1.getEdad() + e2.getEdad()) / 2.0;
    }
}
