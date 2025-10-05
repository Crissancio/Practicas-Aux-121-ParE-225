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
class Triatleta implements Nadador, Ciclista, Corredor {

    private String estiloNatacion;
    private String tipoBicicleta;
    private int distanciaPreferida;

    public Triatleta(String estiloNatacion, String tipoBicicleta, int distanciaPreferida) {
        this.estiloNatacion = estiloNatacion;
        this.tipoBicicleta = tipoBicicleta;
        this.distanciaPreferida = distanciaPreferida;
    }


    @Override
    public void nadar() {
        System.out.println("Nadando estilo " + estiloNatacion);
    }

    @Override
    public String getEstiloNatacion() {
        return estiloNatacion;
    }

    @Override
    public void pedalear() {
        System.out.println("Pedaleando en bicicleta tipo " + tipoBicicleta);
    }

    @Override
    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    @Override
    public void correr() {
        System.out.println("Corriendo una distancia de " + distanciaPreferida + " km");
    }

    @Override
    public int getDistanciaPreferida() {
        return distanciaPreferida;
    }
}
