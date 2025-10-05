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
class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void vender(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            System.out.println("Se vendieron " + cantidad + " unidades de " + nombre);
        } else {
            System.out.println("Stock insuficiente para vender " + cantidad + " unidades.");
        }
    }

    public void reabastecer(int cantidad) {
        stock += cantidad;
        System.out.println("Se reabastecieron " + cantidad + " unidades de " + nombre);
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + 
               " | Precio: Bs. " + precio + 
               " | Stock: " + stock;
    }
}