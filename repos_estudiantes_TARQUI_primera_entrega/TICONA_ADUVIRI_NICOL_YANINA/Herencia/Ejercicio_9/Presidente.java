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
class Presidente extends Politico {

    private String nombre;
    private String apellido;
    private Partido partido; 

    public Presidente(String nombre, String apellido, String profesion, int aniosExp, Partido partido) {
        super(profesion, aniosExp);
        this.nombre = nombre;
        this.apellido = apellido;
        this.partido = partido;
    }

    public Presidente(String nombre, String apellido, String profesion, int aniosExp, String nombrePartido, String rol) {
        super(profesion, aniosExp);
        this.nombre = nombre;
        this.apellido = apellido;
        this.partido = new Partido(nombrePartido, rol);
    }

    public String getNombre() {
        return nombre;
    }

    public Partido getPartido() {
        return partido;
    }

    @Override
    public String toString() {
        return "Presidente: " + nombre + " " + apellido
                + ", Profesión: " + profesion
                + ", Años Exp: " + aniosExp
                + ", Partido: " + partido.getNombreP()
                + " (" + partido.getRol() + ")";
    }
}
