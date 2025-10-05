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
public class Parada {

    private String[] admins;
    private String[][] autos;
    private String nombreP;
    private int nroAdmins;
    private int nroAutos;

    public Parada() {
        this.nombreP = "Matias";
        this.admins = new String[10];
        this.autos = new String[10][3];
        this.nroAdmins = 0;
        this.nroAutos = 0;
    }

    public Parada(String nombreP) {
        this.nombreP = nombreP;
        this.admins = new String[10];
        this.autos = new String[10][3];
        this.nroAdmins = 0;
        this.nroAutos = 0;
    }

    public void mostrar() {
        System.out.println("Parada: " + nombreP);
        System.out.println("Administradores:");
        if (nroAdmins == 0) {
            System.out.println(" (ninguno)");
        } else {
            for (int i = 0; i < nroAdmins; i++) {
                System.out.println(" - " + admins[i]);
            }
        }

        System.out.println("Autos registrados:");
        if (nroAutos == 0) {
            System.out.println(" (ninguno)");
        } else {
            for (int i = 0; i < nroAutos; i++) {
                System.out.println(" - Modelo: " + autos[i][0]
                        + ", Conductor: " + autos[i][1]
                        + ", Placa: " + autos[i][2]);
            }
        }
        System.out.println("-----------------------------------");
    }

    public void adicionar(String admin) {
        if (nroAdmins < 10) {
            admins[nroAdmins++] = admin;
        } else {
            System.out.println(" No se puede añadir más administradores (máx. 10).");
        }
    }

    public void adicionar(String modelo, String conductor, String placa) {
        if (nroAutos < 10) {
            autos[nroAutos][0] = modelo;
            autos[nroAutos][1] = conductor;
            autos[nroAutos][2] = placa;
            nroAutos++;
        } else {
            System.out.println(" No se puede añadir más autos (máx. 10).");
        }
    }
}
