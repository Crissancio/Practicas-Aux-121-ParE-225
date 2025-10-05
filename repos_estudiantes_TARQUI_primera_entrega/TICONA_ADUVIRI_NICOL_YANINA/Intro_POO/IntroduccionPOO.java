/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.introduccionpoo;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author HP-RYZEN 5
 */
//Nicol Yanina Ticona Aduviri
//R.U: 1855987
public class IntroduccionPOO {

    public static void main(String[] args) {
        System.out.println("==================== Introduccion a POO ====================");
        System.out.println("==================== Ejercicio 2 ====================");
        Bus bus = new Bus(50);
        Bus bus2 = new Bus(60);

        System.out.println("");
        System.out.println("*************** primer bus ***************");
        bus.subirPasajeros(15);
        bus.cobrarPasaje();
        System.out.println(bus);
        System.out.println("");
        System.out.println("*************** segundo bus ***************");
        bus2.subirPasajeros(20);
        bus.cobrarPasaje();
        System.out.println(bus2);

        System.out.println("");
        System.out.println("==================== Ejercicio 3 ====================");
        Producto pro1 = new Producto("laptop", 5500, 10);
        Producto pro2 = new Producto("monitor", 2000, 20);

        System.out.println("");
        System.out.println("*************** vender producto 1 ***************");
        System.out.println(pro1);
        pro1.vender(3);
        System.out.println(pro1);

        System.out.println("");
        System.out.println("*************** reabastecer producto 1 ***************");
        pro1.reabastecer(5);
        System.out.println(pro1);

        System.out.println("");
        System.out.println("*************** prueba de stock insuficiente del producto 1 ***************");
        pro1.vender(20);
        System.out.println(pro1);

        System.out.println("");
        System.out.println("*************** vender producto 2 ***************");
        System.out.println(pro2);
        pro2.vender(5);
        System.out.println(pro2);

        System.out.println("");
        System.out.println("*************** reabastecer producto 2 ***************");
        pro2.reabastecer(10);
        System.out.println("");
        System.out.println("*************** prueba de stock insuficiente del producto 2 ***************");
        pro2.vender(15);
        System.out.println(pro2);

        System.out.println("");
        System.out.println("==================== Ejercicio 5 ====================");
        Persona p1 = new Persona("Carlos", "Perez", "Lopez", 20, "1234567");
        Persona p2 = new Persona("Ana", "Perez", "Gomez", 16, "7654321");
        Persona p3 = new Persona("Gabriela", "Chavez", "Torrez", 22, "2342341");
        Persona p4 = new Persona("Martin", "Martinez", "Mendoza", 23, "5674320");

        System.out.println("");
        System.out.println("*************** mostrar datos ***************");
        p1.mostrarDatos();
        p2.mostrarDatos();
        p3.mostrarDatos();
        p4.mostrarDatos();

        System.out.println("");
        System.out.println("*************** mayor de edad ***************");
        System.out.println(p1.mayorDeEdad() ? p1.getPaterno() + " es mayor de edad." : p1.getPaterno() + " es menor de edad.");
        System.out.println(p2.mayorDeEdad() ? p2.getPaterno() + " es mayor de edad." : p2.getPaterno() + " es menor de edad.");
        System.out.println(p3.mayorDeEdad() ? p3.getPaterno() + " es mayor de edad." : p3.getPaterno() + " es menor de edad.");
        System.out.println(p4.mayorDeEdad() ? p4.getPaterno() + " es mayor de edad." : p4.getPaterno() + " es menor de edad.");

        System.out.println("");
        System.out.println("*************** modificar edad ***************");
        p2.modificarEdad(18);
        System.out.println("Edad de " + p2.getPaterno() + " modificada:");
        p2.mostrarDatos();
        p4.modificarEdad(20);
        System.out.println("Edad de " + p4.getPaterno() + " modificada:");
        p4.mostrarDatos();

        System.out.println("");
        System.out.println("*************** comparar apellidos paternos ***************");
        if (p1.getPaterno().equalsIgnoreCase(p2.getPaterno())) {
            System.out.println("Ambas personas tienen el mismo apellido paterno.");
        } else {
            System.out.println("Las personas tienen apellidos paternos diferentes.");
        }

        if (p3.getPaterno().equalsIgnoreCase(p4.getPaterno())) {
            System.out.println("Ambas personas tienen el mismo apellido paterno.");
        } else {
            System.out.println("Las personas tienen apellidos paternos diferentes.");
        }
        System.out.println("");
        System.out.println("==================== Ejercicio 7 ====================");
        Mascota m1 = new Mascota("Firulais", "Perro");
        Mascota m2 = new Mascota("Michi", "Gato");
        Mascota m3 = new Mascota("Bobu", "Perro");
        Mascota m4 = new Mascota("Pelusa", "Gato");

        System.out.println("");
        System.out.println("*************** alimentar***************");
        m1.alimentar();
        m2.alimentar();
        m3.alimentar();
        m4.alimentar();

        System.out.println("");
        System.out.println("*************** hacer jugar ***************");
        m1.jugar();
        m2.jugar();
        m3.jugar();
        m4.jugar();
        
        System.out.println("");
        System.out.println("*************** mostrar energia final ***************");
        m1.mostrarEnergia();
        m2.mostrarEnergia();
        m3.mostrarEnergia();
        m4.mostrarEnergia();

        System.out.println("");
        System.out.println("==================== Ejercicio 11 ====================");
        Cliente cliente1 = new Cliente("Ana", 5);
        Cliente cliente2 = new Cliente("Juan", 10);
        // Crear un pedido
        
        Pedido pedido1 = new Pedido(101, "registrado");
        Pedido pedido2 = new Pedido(123, "no registrado");

        System.out.println("");
        System.out.println("*************** cliente y pedido (1) ***************");
        System.out.println(cliente1);
        System.out.println(pedido1);
        System.out.println("");
        System.out.println("*************** cliente y pedido (2) ***************");
        System.out.println(cliente2);
        System.out.println(pedido2);

        System.out.println("");
        System.out.println("==================== Ejercicio 13 ====================");
        Fruta f1 = new Fruta("Kiwi", "Subtropical", new String[]{"K", "C", "E"});
        Fruta f2 = new Fruta("Naranja", "Cítrica", new String[]{"C", "A"});
        Fruta f3 = new Fruta("Plátano", "Tropical", new String[]{"B6", "C", "A", "E"});

        List<Fruta> frutas = Arrays.asList(f1, f2, f3);

        // b) Fruta con más vitaminas
        Fruta masVitaminas = frutas.get(0);
        for (Fruta f : frutas) {
            if (f.getNroVitaminas() > masVitaminas.getNroVitaminas()) {
                masVitaminas = f;
            }
        }
        System.out.println("Fruta con más vitaminas: " + masVitaminas.getNombre());

        // c) Mostrar vitaminas de una fruta (ejemplo: Kiwi)
        System.out.println("Vitaminas del Kiwi: " + Arrays.toString(f1.getVitaminas()));

        // d) ¿Cuántas vitaminas son cítricas? (ejemplo: contar de la fruta Naranja)
        System.out.println("Vitaminas de la Naranja: " + f2.getNroVitaminas());

        // e) Ordenar las frutas alfabéticamente según el nombre de sus vitaminas
        for (Fruta f : frutas) {
            String[] vitsOrdenadas = f.getVitaminas().clone();
            Arrays.sort(vitsOrdenadas);
            System.out.println("Fruta: " + f.getNombre() + " | Vitaminas ordenadas: " + Arrays.toString(vitsOrdenadas));
        }

        System.out.println("");
        System.out.println("==================== Ejercicio 15 ====================");
        Buzon b1 = new Buzon(1);
        Buzon b2 = new Buzon(2);
        Buzon b3 = new Buzon(3);

        // b) Instanciar 3 cartas
        Carta c1 = new Carta("C123", "Juan Álvarez", "Peter Chaves", "Carta de negocios");
        Carta c2 = new Carta("C456", "Pepe Perez", "Wilmer Pérez", "Querido amigo, te escribo con mucho amor y esperanza");
        Carta c3 = new Carta("C789", "Paty Vasques", "Pepe Mujica", "Feliz cumpleaños, que la alegría te acompañe");

        System.out.println("");
        System.out.println("*************** asignar cartas a buzones ***************");
        b1.agregarCarta(c1);
        b1.agregarCarta(c2);
        b1.agregarCarta(c3);

        System.out.println("");
        System.out.println("*************** verificar cuantas cartas recibio X ***************");
        System.out.println("Cartas recibidas por Pepe Perez: " + b1.contarCartasDestinatario("Pepe Perez"));

        System.out.println("");
        System.out.println("*************** eliminar carta con codigo X ***************");
        b1.eliminarCarta("C123");
        System.out.println("Después de eliminar C123:");
        b1.mostrarCartas();

        System.out.println("");
        System.out.println("*************** verificar si algun remitente tiene carta ***************");
        System.out.println("¿Pepe Perez envió alguna carta? " + b1.remitenteTieneCartas("Pepe Perez"));

        System.out.println("");
        System.out.println("*************** buscar palabra clave en descripciones ***************");
        System.out.println("Buscando la palabra 'amor' en las cartas:");
        b1.buscarPalabraClave("amor");
    }

}
