/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.herencia;

import java.util.ArrayList;

/**
 *
 * @author HP-RYZEN 5
 */
//Nicol Yanina Ticona Aduviri
//R.U: 1855987
public class Herencia {

    public static void main(String[] args) {
        System.out.println("==================== Herencia ====================");
        System.out.println("==================== Ejercicio 1 ====================");
        Cliente c1 = new Cliente("Carlos", "Mamani", "123456", "C-001", "CL100");
        Jefe j1 = new Jefe("Lucía", "Torrez", "654321", "Central", "General");

        System.out.println("=== Cliente ===");
        c1.mostrarDatos();

        System.out.println("=== Jefe ===");
        j1.mostrarDatos();

        System.out.println("");
        System.out.println("==================== Ejercicio 3 ====================");
        Animal[] animales = new Animal[3];
        animales[0] = new Leon("Simba", 5);
        animales[1] = new Pinguino("Pingu", 3);
        animales[2] = new Canguro("Kang", 4);

        for (Animal a : animales) {
            a.desplazarse();
        }
        System.out.println("");
        System.out.println("==================== Ejercicio 5 ====================");
        // a) Instanciar un vehículo de cada tipo
        Bus bus = new Bus("Carlos Pérez", "ABC-123", 1, 45, "Sindicato Central");
        Auto auto = new Auto("Lucía Rojas", "XYZ-789", 2, 120, true);
        Moto moto = new Moto("Diego López", "MTR-456", 3, 250, true);

        // b) Mostrar la placa y conductor de cada vehículo
        System.out.println("=== INFORMACIÓN DE VEHÍCULOS ===");
        bus.mostrarInfo();
        auto.mostrarInfo();
        moto.mostrarInfo();

        // c) Cambiar el conductor de un vehículo
        System.out.println("\n--- Cambio de conductor ---");
        auto.cambiarConductor("María Gutiérrez");
        auto.mostrarInfo();

        System.out.println("");
        System.out.println("==================== Ejercicio 7 ====================");
        // a) Instanciar dos estudiantes y un docente
        Estudiante e1 = new Estudiante("Ana", "Quispe", "Lopez", 20, 1234, "MAT2025A");
        Estudiante e2 = new Estudiante("Luis", "Rojas", "Perez", 22, 5678, "MAT2025B");
        Docente d1 = new Docente("Carlos", "Mamani", "Gomez", 22, 3500, "DOC123");

        // b) Mostrar datos
        System.out.println("=== ESTUDIANTES ===");
        e1.mostrar();
        e2.mostrar();
        System.out.println("=== DOCENTE ===");
        d1.mostrar();

        // c) Promedio de edad de los estudiantes
        double prom = Estudiante.promedio(e1, e2);
        System.out.println("Promedio de edad de estudiantes: " + prom);

        // d) Modificar edad de un estudiante
        e1.modificarEdad(23);
        System.out.println("\nEdad modificada del estudiante " + e1.nombre + ": " + e1.getEdad());

        // e) Verificar si alguno tiene la misma edad que el docente
        if (e1.getEdad() == d1.getEdad() || e2.getEdad() == d1.getEdad()) {
            System.out.println("\nUno de los estudiantes tiene la misma edad que el docente.");
        } else {
            System.out.println("\nNingún estudiante tiene la misma edad que el docente.");
        }

        System.out.println("");
        System.out.println("==================== Ejercicio 9 ====================");

        Partido p1 = new Partido("Partido A", "Líder");
        Presidente pres1 = new Presidente("Juan", "Pérez", "Abogado", 15, p1);

        Presidente pres2 = new Presidente("María", "López", "Economista", 12, "Partido B", "Secretaria General");

        Presidente[] presidentes = new Presidente[3];
        presidentes[0] = pres1;
        presidentes[1] = pres2;
        presidentes[2] = new Presidente("Carlos", "Ramírez", "Ingeniero", 10, "Partido C", "Vocero");

        String buscarNombre = "María";
        for (Presidente p : presidentes) {
            if (p.getNombre().equalsIgnoreCase(buscarNombre)) {
                System.out.println("Encontrado:");
                System.out.println("Nombre: " + p.getNombre());
                System.out.println("Profesión: " + p.getProfesion());
                System.out.println("Partido: " + p.getPartido().getNombreP());
            }
        }

        System.out.println("\nLista de presidentes:");
        for (Presidente p : presidentes) {
            System.out.println(p);
        }
        System.out.println("");
        System.out.println("==================== Ejercicio 11 ====================");
        JefePolicia jefe1 = new JefePolicia("Carlos Pérez", 45, 5000, 20, "Coronel", "Antinarcóticos");
        JefePolicia jefe2 = new JefePolicia("Luis Gómez", 40, 4800, 15, "Coronel", "Tránsito");

        jefe1.mostrarDatos();
        jefe2.mostrarDatos();

        // b) Comparar sueldos
        JefePolicia mayorSueldo = (jefe1.getSueldo() > jefe2.getSueldo()) ? jefe1 : jefe2;
        System.out.println("\nEl que tiene mayor sueldo es: " + mayorSueldo.getNombre());

        // c) Comparar grados
        if (jefe1.getGrado().equals(jefe2.getGrado())) {
            System.out.println("Ambos tienen el mismo grado: " + jefe1.getGrado());
        } else {
            System.out.println("Tienen grados diferentes.");
        }
        System.out.println("");
        System.out.println("==================== Ejercicio 13 ====================");
        ArrayList<Empleadoo> empleados = new ArrayList<>();
        // a) Instanciar 1 Chef, 2 Meseros, 2 Administrativos
        empleados.add(new Mesero("Maria",1200,23,3,30));
        empleados.add(new Chef("Remy", 1500f, 10, "Principal", 15f));
        empleados.add(new Mesero("Alfredo", 1000f, 150.0, 5, 10f));
        empleados.add(new Mesero("Colette", 1100f, 100.0, 8, 12f));
        empleados.add(new Administrativo("Skinner", 2000f, "Gerente"));
        empleados.add(new Administrativo("Linguini", 1500f, "Recepcionista"));


        // b) Mostrar empleados con sueldo mensual igual a X
        float X = 1500f;
        System.out.println("Empleados con sueldo mensual igual a " + X + ":");
        for (Empleadoo e : empleados) {
            if (e.getSueldomes() == X) {
                System.out.println(e);
            }
        }

        // c) Mostrar sueldo total
        System.out.println("\nSueldos Totales:");
        for (Empleadoo e : empleados) {
            System.out.println(e.getNombre() + " (" + e.getClass().getSimpleName() + ") - Sueldo Total: " + e.sueldoTotal());
        }
        System.out.println("");
        System.out.println("==================== Ejercicio 15 ====================");
        Triatleta tri = new Triatleta("Mariposa", "Montaña", 10);

        tri.nadar();
        tri.pedalear();
        tri.correr();
    }
}
