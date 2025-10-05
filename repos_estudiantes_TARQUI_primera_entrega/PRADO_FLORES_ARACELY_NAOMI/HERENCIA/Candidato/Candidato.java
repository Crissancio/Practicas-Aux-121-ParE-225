package Candidato;

public class Candidato {
    private String nombre;
    private String paterno;
    private String materno;
    private String sigla;
    private String ideologia;
    private double porcentaje;

    public Candidato(String nombre, String paterno, String materno, String sigla, String ideologia, double porcentaje) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.sigla = sigla;
        this.ideologia = ideologia;
        this.porcentaje = porcentaje;
    }

    public String getNombreCompleto() {
        return nombre + " " + paterno + " " + materno;
    }

    public String getSigla() {
        return sigla;
    }

    public String getIdeologia() {
        return ideologia;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void mostrarInfo() {
        System.out.println(getNombreCompleto() + " | " + sigla + " | " + ideologia + " | " + porcentaje + "%");
    }
}

