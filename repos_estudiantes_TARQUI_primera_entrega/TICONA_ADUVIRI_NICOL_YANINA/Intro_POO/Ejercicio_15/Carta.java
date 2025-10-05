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
class Carta {

    private String codigo;
    private String remitente;
    private String destinatario;
    private String descripcion;

    public Carta(String codigo, String remitente, String destinatario, String descripcion) {
        this.codigo = codigo;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public String getRemitente() {
        return remitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Carta[" + codigo + "] De: " + remitente + " -> " + destinatario
                + " | Desc: " + descripcion;
    }
}
