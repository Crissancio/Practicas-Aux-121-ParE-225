package POLIMORFISMO.EJERCICIO15;

public class Ordenador{
    public String codigoSerial, procesador;
    public int numero, ram;
    public boolean estado;

    public Ordenador(String codigoSerialserial, String procesador, int numero, int ram, boolean estado) {
        this.codigoSerial = codigoSerialserial;
        this.procesador = procesador;
        this.numero = numero;
        this.ram = ram;
        this.estado = estado;
    }

    public boolean isEstado(){
        return estado;
    }
    public int getRam(){
        return ram;
    }
    public String getCodigoSerial(){
        return codigoSerial;
    }
    public void setActivo(boolean activo) {
        this.estado = activo;
    }

    public void mostrar() {
        System.out.println("Serial: " + codigoSerial +
                ", Número: " + numero +
                ", RAM: " + ram + "GB" +
                ", Procesador: " + procesador +
                ", Estado: " + (estado ? "Activo" : "Inactivo"));
    }
}
