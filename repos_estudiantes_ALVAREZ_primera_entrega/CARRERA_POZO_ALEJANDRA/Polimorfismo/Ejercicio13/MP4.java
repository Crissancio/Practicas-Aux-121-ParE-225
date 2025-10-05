package Polimorfismo.Ejercicio13;

public class MP4 {
    private String marca;
    private double capacidadGb;
    private int nroCanciones;
    private String[][] canciones = new String[100][3]; // nombre, artista, peso
    private int nroVideos;
    private String[][] videos = new String[100][3]; // nombre, artista, peso

    public MP4() {
        this.marca = "Sin marca";
        this.capacidadGb = 1.0;
        this.nroCanciones = 0;
        this.nroVideos = 0;
    }

    public MP4(String marca, double capacidadGb) {
        this.marca = marca;
        this.capacidadGb = capacidadGb;
        this.nroCanciones = 0;
        this.nroVideos = 0;
    }

    public void mostrar() {
        System.out.println("MP4 Marca: " + marca);
        System.out.println("Capacidad: " + capacidadGb + " GB");
        System.out.println("Canciones cargadas: " + nroCanciones);
        System.out.println("Videos cargados: " + nroVideos);
    }

    public void borrar(String nombre) {
        for (int i = 0; i < nroCanciones; i++) {
            if (canciones[i][0].equalsIgnoreCase(nombre)) {
                canciones[i] = canciones[nroCanciones - 1];
                nroCanciones--;
                System.out.println("Canción '" + nombre + "' eliminada.");
                return;
            }
        }
        System.out.println("Canción no encontrada.");
    }
    public void borrarPorArtista(String artista) {
        for (int i = 0; i < nroCanciones; i++) {
            if (canciones[i][1].equalsIgnoreCase(artista)) {
                canciones[i] = canciones[nroCanciones - 1];
                nroCanciones--;
                System.out.println("Canciones del artista '" + artista + "' eliminadas.");
            }
        }
    }
    public void borrar(String nombre, int peso) {
        for (int i = 0; i < nroCanciones; i++) {
            if (canciones[i][0].equalsIgnoreCase(nombre)
                    && Integer.parseInt(canciones[i][2]) == peso) {
                canciones[i] = canciones[nroCanciones - 1];
                nroCanciones--;
                System.out.println("Canción '" + nombre + "' con peso " + peso + " eliminada.");
                return;
            }
        }
        System.out.println("Canción no encontrada.");
    }
    public void agregarCancion(String nombre, String artista, int peso) {
        if (nroCanciones < 100) {
            canciones[nroCanciones][0] = nombre;
            canciones[nroCanciones][1] = artista;
            canciones[nroCanciones][2] = String.valueOf(peso);
            nroCanciones++;
            System.out.println("Canción '" + nombre + "' añadida.");
        } else {
            System.out.println("No hay espacio para más canciones.");
        }
    }

    public void agregarVideo(String nombre, String artista, int peso) {
        if (nroVideos < 100) {
            videos[nroVideos][0] = nombre;
            videos[nroVideos][1] = artista;
            videos[nroVideos][2] = String.valueOf(peso);
            nroVideos++;
            System.out.println("Video '" + nombre + "' añadido.");
        } else {
            System.out.println("No hay espacio para más videos.");
        }
    }
    public void mostrarCapacidad() {
        System.out.println("Capacidad total: " + capacidadGb + " GB");
        System.out.println("Canciones almacenadas: " + nroCanciones);
        System.out.println("Videos almacenados: " + nroVideos);
    }
}
