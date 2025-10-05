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
//R.U; 1855987
class Ordenador {

    private String codigoSerial;
    private int numero;
    private int ram;
    private String procesador;
    private boolean activo;

    public Ordenador(String codigoSerial, int numero, int ram, String procesador, boolean activo) {
        this.codigoSerial = codigoSerial;
        this.numero = numero;
        this.ram = ram;
        this.procesador = procesador;
        this.activo = activo;
    }

    public String getCodigoSerial() {
        return codigoSerial;
    }

    public int getRam() {
        return ram;
    }

    public boolean isActivo() {
        return activo;
    }

    @Override
    public String toString() {
        return "Ordenador{"
                + "codigoSerial='" + codigoSerial + '\''
                + ", numero=" + numero
                + ", ram=" + ram
                + ", procesador='" + procesador + '\''
                + ", estado=" + (activo ? "Activo" : "Inactivo")
                + '}';
    }
}
