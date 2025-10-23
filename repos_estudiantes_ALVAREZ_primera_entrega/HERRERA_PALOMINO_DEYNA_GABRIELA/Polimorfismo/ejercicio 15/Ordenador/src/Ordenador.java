public class Ordenador {
    private String codigoSerial;
    private int numero;
    private int ram;
    private String procesador;
    private String estado; 

    public Ordenador(String codigoSerial, int numero, int ram, String procesador, String estado) {
        this.codigoSerial = codigoSerial;
        this.numero = numero;
        this.ram = ram;
        this.procesador = procesador;
        this.estado = estado;
    }

    public String getCodigoSerial() {
        return codigoSerial;
    }

    public int getRam() {
        return ram;
    }

    public String getEstado() {
        return estado;
    }

    public void mostrarInfo() {
        System.out.println("Código: " + codigoSerial +
                           " | Nro: " + numero +
                           " | RAM: " + ram + "GB" +
                           " | Procesador: " + procesador +
                           " | Estado: " + estado);
    }
}
