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
class Politico {

    protected String profesion;
    protected int aniosExp;

    public Politico(String profesion, int aniosExp) {
        this.profesion = profesion;
        this.aniosExp = aniosExp;
    }

    public String getProfesion() {
        return profesion;
    }

    public int getAniosExp() {
        return aniosExp;
    }
}
