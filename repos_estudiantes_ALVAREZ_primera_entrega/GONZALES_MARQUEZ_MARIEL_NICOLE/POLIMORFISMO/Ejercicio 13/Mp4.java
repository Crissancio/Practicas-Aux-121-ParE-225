public class Mp4 {
    private String marca;
    private double capacidadGb;
    private int nroCanciones;
    private String[][] canciones = new String[100][3];
    private int nroVideos;
    private String[][] videos = new String[100][3];

    public Mp4() {
        marca = "";
        capacidadGb = 0;
        nroCanciones = 0;
        nroVideos = 0;
    }

    public Mp4(String marca, double capacidadGb) {
        this.marca = marca;
        this.capacidadGb = capacidadGb;
        this.nroCanciones = 0;
        this.nroVideos = 0;
    }

    public void borrar(String nombre) {
        for (int i = 0; i < nroCanciones; i++) {
            if (canciones[i][0].equalsIgnoreCase(nombre)) {
                for (int j = i; j < nroCanciones - 1; j++)
                    canciones[j] = canciones[j + 1];
                nroCanciones--;
                break;
            }
        }
    }

    public void borrarPorArtista(String artista) {
        for (int i = 0; i < nroCanciones; i++) {
            if (canciones[i][1].equalsIgnoreCase(artista)) {
                for (int j = i; j < nroCanciones - 1; j++)
                    canciones[j] = canciones[j + 1];
                nroCanciones--;
                break;
            }
        }
    }

    public void borrarPorPeso(String peso) {
        for (int i = 0; i < nroCanciones; i++) {
            if (canciones[i][2].equalsIgnoreCase(peso)) {
                for (int j = i; j < nroCanciones - 1; j++)
                    canciones[j] = canciones[j + 1];
                nroCanciones--;
                break;
            }
        }
    }

    public void addCancion(String nombre, String artista, String pesoKb) {
        if (nroCanciones < 100) {
            boolean existe = false;
            for (int i = 0; i < nroCanciones; i++) {
                if (canciones[i][0].equalsIgnoreCase(nombre)) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                canciones[nroCanciones][0] = nombre;
                canciones[nroCanciones][1] = artista;
                canciones[nroCanciones][2] = pesoKb;
                nroCanciones++;
            }
        }
    }

    public void addVideo(String nombre, String artista, String pesoMg) {
        if (nroVideos < 100) {
            boolean existe = false;
            for (int i = 0; i < nroVideos; i++) {
                if (videos[i][0].equalsIgnoreCase(nombre)) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                videos[nroVideos][0] = nombre;
                videos[nroVideos][1] = artista;
                videos[nroVideos][2] = pesoMg;
                nroVideos++;
            }
        }
    }

    public double capacidadDisponible() {
        double usadaMB = 0;
        for (int i = 0; i < nroCanciones; i++) {
            usadaMB += Double.parseDouble(canciones[i][2]) / 1024;
        }
        for (int i = 0; i < nroVideos; i++) {
            usadaMB += Double.parseDouble(videos[i][2]);
        }
        double usadaGB = usadaMB / 1024;
        return capacidadGb - usadaGB;
    }

    public void mostrar() {
        System.out.println("MP4 marca: " + marca + " | Capacidad total: " + capacidadGb + " GB");
        System.out.println("\nCANCIONES:");
        for (int i = 0; i < nroCanciones; i++) {
            System.out.println(
                    (i + 1) + ". " + canciones[i][0] + " - " + canciones[i][1] + " (" + canciones[i][2] + " Kb)");
        }
        System.out.println("\nVIDEOS:");
        for (int i = 0; i < nroVideos; i++) {
            System.out.println((i + 1) + ". " + videos[i][0] + " - " + videos[i][1] + " (" + videos[i][2] + " Mb)");
        }
        System.out.printf("\nCapacidad disponible: %.3f GB\n", capacidadDisponible());
    }
}
