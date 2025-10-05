package Candidato;

import java.util.*;

public class Eleccion {
    private String tipo;
    private String fecha;
    private List<Candidato> candidatos;

    public Eleccion(String tipo, String fecha) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.candidatos = new ArrayList<>();
    }

    public void agregarCandidato(Candidato c) {
        candidatos.add(c);
    }

    public void perderPersoneria() {
        System.out.println("\nCandidatos que pierden personería jurídica (<3%):");
        for (Candidato c : candidatos) {
            if (c.getPorcentaje() < 3) {
                c.mostrarInfo();
            }
        }
    }

    public void verificarGanador() {
      
        candidatos.sort((a, b) -> Double.compare(b.getPorcentaje(), a.getPorcentaje()));
        Candidato primero = candidatos.get(0);
        Candidato segundo = candidatos.get(1);

        System.out.println("\nResultado electoral:");
        if (primero.getPorcentaje() > 50 ||
           (primero.getPorcentaje() > 40 && (primero.getPorcentaje() - segundo.getPorcentaje() >= 10))) {
            System.out.println("Ganador en primera vuelta: " + primero.getNombreCompleto() +
                               " con " + primero.getPorcentaje() + "%");
        } else {
            System.out.println("Habrá segunda vuelta entre:");
            System.out.println("- " + primero.getNombreCompleto() + " (" + primero.getPorcentaje() + "%)");
            System.out.println("- " + segundo.getNombreCompleto() + " (" + segundo.getPorcentaje() + "%)");
        }
    }

    public void ordenarCandidatos() {
        candidatos.sort((a, b) -> Double.compare(b.getPorcentaje(), a.getPorcentaje()));
        System.out.println("\nCandidatos ordenados por porcentaje (mayor a menor):");
        for (Candidato c : candidatos) {
            c.mostrarInfo();
        }
    }
}
