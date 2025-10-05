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
class Cliente {

    private String nombre;
    private int mesa;

    public Cliente(String nombre, int mesa) {
        this.nombre = nombre;
        this.mesa = mesa;
    }

    // Destructor (Java usa Garbage Collector, pero podemos simular con finalize)
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Cliente eliminado: " + nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public int getMesa() {
        return mesa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    @Override
    //para mostrar datos
    public String toString() {
        return "Cliente [Nombre=" + nombre + ", Mesa=" + mesa + "]";
    }
}
