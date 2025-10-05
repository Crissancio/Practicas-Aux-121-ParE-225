package Candidato;

public class Main {
    public static void main(String[] args) {
        Eleccion eleccion = new Eleccion("Presidencial", "19/08/2025");

        eleccion.agregarCandidato(new Candidato("Eduardo", "Ledezma", "Rodríguez", "PA", "Derecha", 49.3));
        eleccion.agregarCandidato(new Candidato("Samuel", "Carpio", "Castillo", "SAM", "Izquierda", 49.7));
        eleccion.agregarCandidato(new Candidato("Andrónico", "Medina", "Doria", "UN", "Derecha", 1.0));

        System.out.println("Lista de candidatos registrados:");
        eleccion.ordenarCandidatos();

        eleccion.perderPersoneria();

        eleccion.verificarGanador();

    }
}
