public class Ordenador {
    private String codigoSerial;
    private int numero;
    private int ram;
    private String procesador;
    private String estado;

    public Ordenador() {
    }

    public Ordenador(String codigoSerial, int numero, int ram, String procesador, String estado) {
        this.codigoSerial = codigoSerial;
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

    public String getCodigoSerial() {
        return codigoSerial;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void informacion() {
        System.out.println("Código: " + codigoSerial +
                " | Nro: " + numero +
                " | RAM: " + ram + "GB" +
                " | Procesador: " + procesador +
                " | Estado: " + estado);
    }
}
