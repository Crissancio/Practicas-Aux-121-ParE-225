/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo;

/**
 *
 * @author HP-RYZEN 5
 */
//Nicol Yanina Ticona Aduviri
//R.U: 1855987
class Videojuego {

    private String nombre;
    private String plataforma;
    private int cantidadJugadores;

    public Videojuego() {
        this.nombre = "Desconocido";
        this.plataforma = "Desconocida";
        this.cantidadJugadores = 0;
    }

    public Videojuego(String nombre, String plataforma) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = 0;
    }

    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }

    public void agregarJugadores() {
        cantidadJugadores += 1;
        System.out.println("Se agregó 1 jugador. Ahora hay " + cantidadJugadores + " jugadores.");
    }

    public void agregarJugadores(int cantidad) {
        cantidadJugadores += cantidad;
        System.out.println("Se agregaron " + cantidad + " jugadores. Ahora hay " + cantidadJugadores + " jugadores.");
    }

    public void mostrarInfo() {
        System.out.println("Videojuego: " + nombre
                + " | Plataforma: " + plataforma
                + " | Jugadores: " + cantidadJugadores);
    }
}
