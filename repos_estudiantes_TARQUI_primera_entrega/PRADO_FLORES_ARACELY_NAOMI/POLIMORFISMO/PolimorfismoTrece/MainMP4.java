package PolimorfismoTrece;

public class MainMP4 {
    public static void main(String[] args) {
        MP4 miMP4 = new MP4("Sony", 1.0); 

        miMP4.agregarCancion("Back To Black", "Amy Winehouse", 100);
        miMP4.agregarCancion("Lost On You", "LP", 150);

        miMP4.agregarVideo("Heathens", "twenty one pilots", 50);
        miMP4.agregarVideo("Harmonica Andromeda", "KSHMR", 70);
        miMP4.agregarVideo("Without Me", "Halsey", 30);

        System.out.println("Contenido inicial del MP4:");
        miMP4.mostrarInfo();

        miMP4.borrarCancion("Back To Black"); // por nombre
        miMP4.borrarCancionPorArtista("LP"); // por artista
        miMP4.borrarCancion("Lost On You", 150); // por nombre y peso

        miMP4.agregarCancionSiNoExiste("Shape of You", "Ed Sheeran", 120);

        miMP4.agregarVideoSiNoExiste("Blinding Lights", "The Weeknd", 60);

        System.out.println("\nContenido final del MP4:");
        miMP4.mostrarInfo();

        System.out.printf("\nCapacidad disponible del MP4: %.2f KB\n", miMP4.capacidadDisponible());
    }
}


class MP4 {
    private String marca;
    private double capacidadGB;
    private int nroCanciones;
    private int nroVideos;
    private String[][] canciones; 
    private String[][] videos;    

    public MP4(String marca, double capacidadGB) {
        this.marca = marca;
        this.capacidadGB = capacidadGB;
        canciones = new String[3][3]; 
        videos = new String[100][3];  
        nroCanciones = 0;
        nroVideos = 0;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Canciones:");
        for (int i = 0; i < nroCanciones; i++) {
            System.out.println(" - " + canciones[i][0] + " | " + canciones[i][1] + " | " + canciones[i][2] + " KB");
        }
        System.out.println("Videos:");
        for (int i = 0; i < nroVideos; i++) {
            System.out.println(" - " + videos[i][0] + " | " + videos[i][1] + " | " + videos[i][2] + " MB");
        }
    }

    public void borrarCancion(String nombre) {
        for (int i = 0; i < nroCanciones; i++) {
            if (canciones[i][0].equalsIgnoreCase(nombre)) {
                eliminarCancionIndice(i);
                return;
            }
        }
    }

    public void borrarCancionPorArtista(String artista) {
        for (int i = 0; i < nroCanciones; i++) {
            if (canciones[i][1].equalsIgnoreCase(artista)) {
                eliminarCancionIndice(i);
                return;
            }
        }
    }

    public void borrarCancion(String nombre, int peso) {
        for (int i = 0; i < nroCanciones; i++) {
            if (canciones[i][0].equalsIgnoreCase(nombre) && Integer.parseInt(canciones[i][2]) == peso) {
                eliminarCancionIndice(i);
                return;
            }
        }
    }

    private void eliminarCancionIndice(int index) {
        for (int i = index; i < nroCanciones - 1; i++) {
            canciones[i] = canciones[i + 1];
        }
        canciones[nroCanciones - 1] = null;
        nroCanciones--;
    }

    public void agregarCancionSiNoExiste(String nombre, String artista, int peso) {
        if (nroCanciones >= 3) {
            System.out.println("No hay espacio para más canciones.");
            return;
        }
        for (int i = 0; i < nroCanciones; i++) {
            if (canciones[i][0].equalsIgnoreCase(nombre)) {
                System.out.println("La canción ya existe.");
                return;
            }
        }
        canciones[nroCanciones][0] = nombre;
        canciones[nroCanciones][1] = artista;
        canciones[nroCanciones][2] = String.valueOf(peso);
        nroCanciones++;
    }

    public void agregarVideoSiNoExiste(String nombre, String artista, int peso) {
        if (nroVideos >= 100) {
            System.out.println("No hay espacio para más videos.");
            return;
        }
        for (int i = 0; i < nroVideos; i++) {
            if (videos[i][0].equalsIgnoreCase(nombre)) {
                System.out.println("El video ya existe.");
                return;
            }
        }
        videos[nroVideos][0] = nombre;
        videos[nroVideos][1] = artista;
        videos[nroVideos][2] = String.valueOf(peso);
        nroVideos++;
    }

    public double capacidadDisponible() {
        double usada = 0;
        for (int i = 0; i < nroCanciones; i++) {
            usada += Integer.parseInt(canciones[i][2]);
        }
        for (int i = 0; i < nroVideos; i++) {
            usada += Integer.parseInt(videos[i][2]) * 1024; // MB -> KB
        }
        return capacidadGB * 1024 * 1024 - usada; // capacidad en KB
    }

    public void agregarCancion(String nombre, String artista, int peso) {
        if (nroCanciones < 3) {
            canciones[nroCanciones][0] = nombre;
            canciones[nroCanciones][1] = artista;
            canciones[nroCanciones][2] = String.valueOf(peso);
            nroCanciones++;
        }
    }

    public void agregarVideo(String nombre, String artista, int peso) {
        if (nroVideos < 100) {
            videos[nroVideos][0] = nombre;
            videos[nroVideos][1] = artista;
            videos[nroVideos][2] = String.valueOf(peso);
            nroVideos++;
        }
    }
}
