package PRACTICA1AUXILIATURA.Polimorfismo.Ejercicio15;

import java.util.ArrayList;

class Ordenador {
    private String codigoSerial;
    private int numero;
    private int ram;
    private String procesador;
    private boolean activo; 

    public Ordenador(String codigoSerial, int numero, int ram, String procesador, boolean activo) {
        this.codigoSerial = codigoSerial;
        this.numero = numero;
        this.ram = ram;
        this.procesador = procesador;
        this.activo = activo;
    }

    public String getCodigoSerial() { return codigoSerial; }
    public int getRam() { return ram; }
    public boolean isActivo() { return activo; }

    public String toString() {
        return "Ordenador{" +
                "Serial='" + codigoSerial + '\'' +
                ", Numero=" + numero +
                ", RAM=" + ram +
                "GB, Procesador='" + procesador + '\'' +
                ", Estado=" + (activo ? "Activo" : "Inactivo") +
                '}';
    }
}

class Laboratorio {
    private String nombre;
    private int capacidad;
    private ArrayList<Ordenador> ordenadores;

    public Laboratorio(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.ordenadores = new ArrayList<>();
    }

    public void agregarOrdenador(Ordenador o) {
        if (ordenadores.size() < capacidad) {
            ordenadores.add(o);
        } else {
            System.out.println("El laboratorio " + nombre + " está lleno.");
        }
    }

    public ArrayList<Ordenador> getOrdenadores() { return ordenadores; }
    public String getNombre() { return nombre; }

    // --- Sobrecarga de informacion ---
    public void informacion(String estado) {
        System.out.println("Ordenadores con estado " + estado + ":");
        for (Ordenador o : ordenadores) {
            if ((estado.equalsIgnoreCase("activo") && o.isActivo()) ||
                (estado.equalsIgnoreCase("inactivo") && !o.isActivo())) {
                System.out.println(o);
            }
        }
    }

    public void informacion(Laboratorio lab) {
        System.out.println("Ordenadores en " + lab.getNombre() + ":");
        for (Ordenador o : lab.getOrdenadores()) {
            System.out.println(o);
        }
    }

    public void informacion(int ram) {
        System.out.println("Ordenadores con más de " + ram + "GB RAM:");
        for (Ordenador o : ordenadores) {
            if (o.getRam() > ram) {
                System.out.println(o);
            }
        }
    }
}

public class Main {
    // --- Función para trasladar ordenadores ---
    public static void trasladar(Laboratorio origen, Laboratorio destino, int cantidad) {
        System.out.println("\n📌 Antes del traslado:");
        origen.informacion(origen);
        destino.informacion(destino);

        ArrayList<Ordenador> listaOrigen = origen.getOrdenadores();
        for (int i = 0; i < cantidad && !listaOrigen.isEmpty(); i++) {
            Ordenador pc = listaOrigen.remove(0);
            destino.agregarOrdenador(pc);
        }

        System.out.println("\n📌 Después del traslado:");
        origen.informacion(origen);
        destino.informacion(destino);
    }

    public static void main(String[] args) {
        // Crear laboratorios
        Laboratorio lasin1 = new Laboratorio("Lasin 1", 5);
        Laboratorio lasin2 = new Laboratorio("Lasin 2", 5);

        // Crear ordenadores
        Ordenador pc1 = new Ordenador("S001", 1, 4, "Intel i3", true);
        Ordenador pc2 = new Ordenador("S002", 2, 8, "Intel i5", false);
        Ordenador pc3 = new Ordenador("S003", 3, 16, "Intel i7", true);
        Ordenador pc4 = new Ordenador("S004", 4, 12, "Ryzen 5", true);
        Ordenador pc5 = new Ordenador("S005", 5, 6, "Ryzen 3", false);
        Ordenador pc6 = new Ordenador("S006", 6, 32, "Ryzen 7", true);

        // Asignar a los laboratorios
        lasin1.agregarOrdenador(pc1);
        lasin1.agregarOrdenador(pc2);
        lasin1.agregarOrdenador(pc3);
        lasin2.agregarOrdenador(pc4);
        lasin2.agregarOrdenador(pc5);
        lasin2.agregarOrdenador(pc6);

        // Pruebas de sobrecarga
        System.out.println("=== Prueba de sobrecarga ===");
        lasin1.informacion("activo");
        lasin2.informacion(8);
        lasin1.informacion(lasin1);

        // Traslado
        trasladar(lasin1, lasin2, 2);
    }
}

