package Ejercicio15;

public class Ordenador {
    private String serial;
    private int numero;
    private int ram;
    private String procesador;
    private String estado; 


    public Ordenador(String serial, int numero, int ram, String procesador, String estado) {
        this.serial = serial;
        this.numero = numero;
        this.ram = ram;
        this.procesador = procesador;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public int getRam() {
        return ram;
    }

    public String getSerial() {
        return serial;
    }

    public int getNumero() {
        return numero;
    }

    public void mostrar() {
        System.out.println("PC " + numero + " | Serial: " + serial + 
                           " | RAM: " + ram + "GB | CPU: " + procesador +
                           " | Estado: " + estado);
    }
}

