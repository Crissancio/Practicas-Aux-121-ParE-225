/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo;

/**
 *
 * @author HP-RYZEN 5
 */
//Nicol Yanina Ticona Aduviri
//R.U; 1855987
class Mp4 {

    private String marca;
    private double capacidadGb;
    private int nroCanciones;
    private int nroVideos;
    private String[][] canciones;
    private String[][] videos;

    public Mp4(String marca, double capacidadGb, int maxCanciones, int maxVideos) {
        this.marca = marca;
        this.capacidadGb = capacidadGb;
        this.canciones = new String[maxCanciones][3];
        this.videos = new String[maxVideos][3];
        this.nroCanciones = 0;
        this.nroVideos = 0;
    }

    // --- a) Borrar canción ---
    public void borrarCancion(String nombre, String artista) {
        for (int i = 0; i < nroCanciones; i++) {
            if (canciones[i][0].equalsIgnoreCase(nombre)
                    && canciones[i][1].equalsIgnoreCase(artista)) {
                // Shift para eliminar
                for (int j = i; j < nroCanciones - 1; j++) {
                    canciones[j] = canciones[j + 1];
                }
                nroCanciones--;
                System.out.println("Canción eliminada: " + nombre + " - " + artista);
                return;
            }
        }
        System.out.println("La canción no fue encontrada.");
    }

    // --- b) "Sobrecargar +" (como método en Java) ---
    public void agregarCancion(String nombre, String artista, int pesoKb) {
        if (nroCanciones < canciones.length && espacioDisponibleMb() >= pesoKb / 1024.0) {
            // Verificar que no exista
            for (int i = 0; i < nroCanciones; i++) {
                if (canciones[i][0].equalsIgnoreCase(nombre)
                        && canciones[i][1].equalsIgnoreCase(artista)) {
                    System.out.println("La canción ya existe.");
                    return;
                }
            }
            canciones[nroCanciones][0] = nombre;
            canciones[nroCanciones][1] = artista;
            canciones[nroCanciones][2] = String.valueOf(pesoKb);
            nroCanciones++;
            System.out.println("Canción agregada: " + nombre);
        } else {
            System.out.println("No hay espacio para agregar la canción.");
        }
    }

    // --- c) "Sobrecargar *" (agregar video) ---
    public void agregarVideo(String nombre, String artista, int pesoMb) {
        if (nroVideos < videos.length && espacioDisponibleMb() >= pesoMb) {
            // Verificar que no exista
            for (int i = 0; i < nroVideos; i++) {
                if (videos[i][0].equalsIgnoreCase(nombre)
                        && videos[i][1].equalsIgnoreCase(artista)) {
                    System.out.println("El video ya existe.");
                    return;
                }
            }
            videos[nroVideos][0] = nombre;
            videos[nroVideos][1] = artista;
            videos[nroVideos][2] = String.valueOf(pesoMb);
            nroVideos++;
            System.out.println("Video agregado: " + nombre);
        } else {
            System.out.println("No hay espacio para agregar el video.");
        }
    }

    // --- d) Mostrar capacidad disponible ---
    public double espacioDisponibleMb() {
        double totalMb = capacidadGb * 1024;
        double ocupado = 0;

        for (int i = 0; i < nroCanciones; i++) {
            ocupado += Double.parseDouble(canciones[i][2]) / 1024.0; // Kb a Mb
        }
        for (int i = 0; i < nroVideos; i++) {
            ocupado += Double.parseDouble(videos[i][2]);
        }
        return totalMb - ocupado;
    }

    public void mostrar() {
        System.out.println("\nMP4 Marca: " + marca + " | Capacidad: " + capacidadGb + " GB");
        System.out.println("Canciones:");
        for (int i = 0; i < nroCanciones; i++) {
            System.out.println("- " + canciones[i][0] + " | " + canciones[i][1]
                    + " | " + canciones[i][2] + " Kb");
        }
        System.out.println("Videos:");
        for (int i = 0; i < nroVideos; i++) {
            System.out.println("- " + videos[i][0] + " | " + videos[i][1]
                    + " | " + videos[i][2] + " Mb");
        }
        System.out.println("Espacio disponible: " + espacioDisponibleMb() + " Mb");
    }
}
