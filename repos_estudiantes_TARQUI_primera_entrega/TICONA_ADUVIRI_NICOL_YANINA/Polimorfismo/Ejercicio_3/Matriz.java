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
class Matriz {

    private float[][] matriz;
    private int n;

    // a) Constructor predeterminado (matriz identidad)
    public Matriz(int n) {
        this.n = n;
        matriz = new float[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
    }

    // b) Constructor para instanciar una matriz dada
    public Matriz(float[][] valores) {
        this.n = valores.length;
        matriz = new float[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = valores[i][j];
            }
        }
    }

    // c) Método para sumar matrices
    public Matriz sumar(Matriz otra) {
        if (this.n != otra.n) {
            throw new IllegalArgumentException("Las matrices deben tener la misma dimensión.");
        }
        Matriz resultado = new Matriz(new float[n][n]);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado.matriz[i][j] = this.matriz[i][j] + otra.matriz[i][j];
            }
        }
        return resultado;
    }

    // c) Método para restar matrices
    public Matriz restar(Matriz otra) {
        if (this.n != otra.n) {
            throw new IllegalArgumentException("Las matrices deben tener la misma dimensión.");
        }
        Matriz resultado = new Matriz(new float[n][n]);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado.matriz[i][j] = this.matriz[i][j] - otra.matriz[i][j];
            }
        }
        return resultado;
    }

    // d) Método para verificar si dos matrices son iguales
    public boolean igual(Matriz otra) {
        if (this.n != otra.n) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (this.matriz[i][j] != otra.matriz[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void mostrar() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
