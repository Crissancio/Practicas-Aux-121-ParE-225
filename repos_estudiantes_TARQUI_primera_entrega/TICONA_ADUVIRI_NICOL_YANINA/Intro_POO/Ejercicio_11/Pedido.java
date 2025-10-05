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
class Pedido {

    private int idPedido;
    private String estado;

    public Pedido(int idPedido, String estado) {
        this.idPedido = idPedido;
        this.estado = estado;
    }

    // Destructor
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Pedido eliminado: " + idPedido);
    }

    public int getIdPedido() {
        return idPedido;
    }

    public String getEstado() {
        return estado;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // para mostrar datos
    @Override
    public String toString() {
        return "Pedido [ID=" + idPedido + ", Estado=" + estado + "]";
    }
}
