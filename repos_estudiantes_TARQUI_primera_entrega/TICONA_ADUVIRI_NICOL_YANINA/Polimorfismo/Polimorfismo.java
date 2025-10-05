/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.polimorfismo;

import java.util.Scanner;

/**
 *
 * @author HP-RYZEN 5
 */
//Nicol Yanina Ticona Aduviri
//R.U; 1855987
public class Polimorfismo {

    public static void main(String[] args) {
        System.out.println("==================== Polimorfismo ====================");
        System.out.println("==================== Ejercicio 2 ====================");

        Scanner sc = new Scanner(System.in);

        // a) Instanciar al menos 2 videojuegos
        Videojuego v1 = new Videojuego("FIFA 25", "PlayStation 5");
        Videojuego v2 = new Videojuego("Minecraft", "PC", 5);

        System.out.println("");
        System.out.println("*************** mostrar inicial ***************");
        v1.mostrarInfo();
        v2.mostrarInfo();

        // b) Probar sobrecarga de constructores
        System.out.println("");
        System.out.println("*************** probar sobrecarga de constructores ***************");
        Videojuego v3 = new Videojuego();
        v3.mostrarInfo();

        // c) Probar sobrecarga de métodos agregarJugadores
        System.out.println("");
        System.out.println("*************** probar sobrecarga de metodos agregarJugadores ***************");
        v1.agregarJugadores();   // agrega 1
        v2.agregarJugadores(3);

        System.out.println("");
        System.out.println("*************** desde teclado ***************");
        System.out.print("¿Cuántos jugadores quieres agregar a Minecraft?: ");
        int n = sc.nextInt();
        v2.agregarJugadores(n);

        System.out.println("");
        System.out.println("*************** mostrar final ***************");
        v1.mostrarInfo();
        v2.mostrarInfo();

        sc.close();

        System.out.println("");
        System.out.println("==================== Ejercicio 3 ====================");
        // a) Matriz identidad 3x3
        Matriz m1 = new Matriz(3);
        System.out.println("Matriz identidad:");
        m1.mostrar();

        // b) Matriz personalizada
        System.out.println("");
        System.out.println("*************** matriz personalizada ***************");
        float[][] valores = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        Matriz m2 = new Matriz(valores);
        System.out.println("\nMatriz personalizada:");
        m2.mostrar();

        // c) Suma
        System.out.println("");
        System.out.println("*************** suma ***************");
        Matriz suma = m1.sumar(m2);
        System.out.println("\nSuma (m1 + m2):");
        suma.mostrar();

        // c) Resta
        System.out.println("");
        System.out.println("*************** resta ***************");
        Matriz resta = m2.restar(m1);
        System.out.println("\nResta (m2 - m1):");
        resta.mostrar();

        // d) Igualdad
        System.out.println("");
        System.out.println("*************** igualdad ***************");
        System.out.println("\n¿m1 es igual a m2?: " + m1.igual(m2));
        System.out.println("¿m1 es igual a identidad?: " + m1.igual(new Matriz(3)));

        System.out.println("");
        System.out.println("==================== Ejercicio 5 ====================");
        System.out.println("Lo realice en python");
        System.out.println("");
        System.out.println("==================== Ejercicio 7 ====================");

        Parada p1 = new Parada();
        p1.mostrar();

        Parada p2 = new Parada("Parada Central");

        p2.adicionar("Juan Perez");
        p2.adicionar("Maria Lopez");

        p2.adicionar("Toyota Corolla", "Carlos Diaz", "ABC-123");
        p2.adicionar("Nissan Versa", "Luis Romero", "XYZ-789");

        System.out.println("");
        System.out.println("*************** mostrar parada ***************");
        p2.mostrar();

        System.out.println("");
        System.out.println("==================== Ejercicio 11 ====================");
        Pasajero pasa1 = new Pasajero("Juan Vargas", 30, "M");
        Pasajero pasa2 = new Pasajero("Martina Vasques", 25, "F");
        Pasajero pasa3 = new Pasajero("Wilmer Montero", 40, "M");
        Pasajero pasa4 = new Pasajero("Ana Torres", 28, "F");
        Pasajero pasa5 = new Pasajero("Carlos Pérez", 35, "M");

        // Instanciar cruceros
        Crucero c1 = new Crucero("Caribe Express", "Bolivia", "Brasil", 3);
        Crucero c2 = new Crucero("Pacifico Azul", "Chile", "Perú", 3);

        c1.agregarPasajero(pasa1, 502, 500);
        c1.agregarPasajero(pasa2, 603, 1000);
        c1.agregarPasajero(pasa3, 401, 925);

        c2.agregarPasajero(pasa4, 201, 700);
        c2.agregarPasajero(pasa5, 202, 800);

        System.out.println("");
        System.out.println("*************** mostrar datos ***************");
        c1.mostrar();
        c2.mostrar();

        System.out.println("");
        System.out.println("*************** comparar costos totales ***************");
        System.out.println("\n¿Ambos cruceros tienen el mismo costo total? " + c1.mismoCosto(c2));

        System.out.println("");
        System.out.println("*************** comparar numero de pasajeros ***************");
        System.out.println("¿Ambos cruceros tienen el mismo número de pasajeros? " + c1.mismoNumeroPasajeros(c2));

        System.out.println("");
        System.out.println("*************** contar hombres y mujeres ***************");
        c1.contarGenero();
        c2.contarGenero();

        System.out.println("");
        System.out.println("==================== Ejercicio 13 ====================");
        Mp4 mp4 = new Mp4("Sony", 1.0, 100, 50);

        System.out.println("");
        System.out.println("*************** agregar canciones ***************");
        mp4.agregarCancion("Back To Black", "Amy Winehouse", 100);
        mp4.agregarCancion("Lost On You", "LP", 150);

        System.out.println("");
        System.out.println("*************** agregar videos ***************");
        mp4.agregarVideo("Heathens", "twenty one pilots", 50);
        mp4.agregarVideo("Harmonica Andromeda", "KSHMR", 70);
        mp4.agregarVideo("Without Me", "Halsey", 30);

        System.out.println("");
        System.out.println("*************** mostrar datos ***************");
        mp4.mostrar();

        System.out.println("");
        System.out.println("*************** borrar cancion ***************");
        mp4.borrarCancion("Back To Black", "Amy Winehouse");
        mp4.mostrar();

        System.out.println("");
        System.out.println("==================== Ejercicio 15 ====================");
        Laboratorio lasin1 = new Laboratorio("Lasin 1", 10);
        Laboratorio lasin2 = new Laboratorio("Lasin 2", 10);

        // Crear ordenadores
        Ordenador o1 = new Ordenador("SN001", 1, 4, "i3", true);
        Ordenador o2 = new Ordenador("SN002", 2, 16, "i7", true);
        Ordenador o3 = new Ordenador("SN003", 3, 8, "i5", false);
        Ordenador o4 = new Ordenador("SN004", 4, 12, "i5", true);
        Ordenador o5 = new Ordenador("SN005", 5, 6, "Ryzen 3", false);
        Ordenador o6 = new Ordenador("SN006", 6, 32, "Ryzen 9", true);

        lasin1.agregarOrdenador(o1);
        lasin1.agregarOrdenador(o2);
        lasin1.agregarOrdenador(o3);
        lasin1.agregarOrdenador(o4);
        lasin1.agregarOrdenador(o5);
        lasin1.agregarOrdenador(o6);

        System.out.println("");
        System.out.println("*************** mostrar info ***************");
        lasin1.informacion();
        lasin1.informacion(true);
        lasin1.informacion(8);

        System.out.println("");
        System.out.println("*************** trasladar 2 ordenadores a lasin 2 ***************");
        lasin1.trasladar(lasin2, 2);

        System.out.println("");
        System.out.println("*************** estado despues del traslado ***************");
        lasin1.informacion();
        lasin2.informacion();
    }

}
