/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introduccionpoo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP-RYZEN 5
 */
//Nicol Yanina Ticona Aduviri
//R.U: 1855987
class Buzon {

    private int nro;
    private int nroC;
    private List<Carta> cartas;

    public Buzon(int nro) {
        this.nro = nro;
        this.nroC = 0;
        this.cartas = new ArrayList<>();
    }


    public void agregarCarta(Carta c) {
        cartas.add(c);
        nroC++;
    }

    public void eliminarCarta(String codigo) {
        cartas.removeIf(c -> c.getCodigo().equals(codigo));
        nroC = cartas.size();
    }

    public int contarCartasDestinatario(String destinatario) {
        int cont = 0;
        for (Carta c : cartas) {
            if (c.getDestinatario().equals(destinatario)) {
                cont++;
            }
        }
        return cont;
    }

    public boolean remitenteTieneCartas(String remitente) {
        for (Carta c : cartas) {
            if (c.getRemitente().equals(remitente)) {
                return true;
            }
        }
        return false;
    }

    public void buscarPalabraClave(String palabra) {
        for (Carta c : cartas) {
            if (c.getDescripcion().toLowerCase().contains(palabra.toLowerCase())) {
                System.out.println("Coincidencia -> Código: " + c.getCodigo()
                        + ", Remitente: " + c.getRemitente()
                        + ", Destinatario: " + c.getDestinatario());
            }
        }
    }

    public void mostrarCartas() {
        for (Carta c : cartas) {
            System.out.println(c);
        }
    }
}
