package Ejercicio15;

import java.util.*;

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
        return "[" + codigo + "] " + remitente + " → " + destinatario + " | " + descripcion;
    }
}

