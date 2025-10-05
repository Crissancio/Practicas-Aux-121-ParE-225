package PRACTICA1AUXILIATURA.Polimorfismo.Ejercicio13;
//EL UML YA ESTABA DEFINIDO EN EL PDF DE LA PRACTICA
public class Mp4 {
    private String marca;
    private double capacidadGb;
    private int nroCanciones;
    private int nroVideos;

    private String[][] canciones = new String[100][3];
    private String[][] videos = new String[100][3];

    public Mp4(String marca, double capacidadGb) {
        this.marca = marca;
        this.capacidadGb = capacidadGb;
        this.nroCanciones = 0;
        this.nroVideos = 0;
    }

    public void borrarCancion(String nombre) {
        for (int i = 0; i < nroCanciones; i++) {
            if (canciones[i][0].equals(nombre)) {
                eliminarCancion(i);
                break;
            }
        }
    }

    public void borrarCancionPorArtista(String artista) {
        for (int i = 0; i < nroCanciones; i++) {
            if (canciones[i][1].equals(artista)) {
                eliminarCancion(i);
                break;
            }
        }
    }

    public void borrarCancion(String nombre, String peso) {
        for (int i = 0; i < nroCanciones; i++) {
            if (canciones[i][0].equals(nombre) && canciones[i][2].equals(peso)) {
                eliminarCancion(i);
                break;
            }
        }
    }

    private void eliminarCancion(int pos) {
        for (int i = pos; i < nroCanciones - 1; i++) {
            canciones[i] = canciones[i + 1];
        }
        nroCanciones--;
    }

    public static Mp4 operatorPlus(Mp4 mp4, String[] cancion) {
        if (!mp4.existeCancion(cancion[0])) {
            if (mp4.capacidadDisponible() >= Double.parseDouble(cancion[2]) / 1024) {
                mp4.canciones[mp4.nroCanciones++] = cancion;
            } else {
                System.out.println("No hay espacio para añadir la canción.");
            }
        } else {
            System.out.println("La canción ya existe.");
        }
        return mp4;
    }

    public static Mp4 operatorMinus(Mp4 mp4, String[] video) {
        if (!mp4.existeVideo(video[0])) {
            if (mp4.capacidadDisponible() >= Double.parseDouble(video[2]) / 1024) {
                mp4.videos[mp4.nroVideos++] = video;
            } else {
                System.out.println("No hay espacio para añadir el video.");
            }
        } else {
            System.out.println("El video ya existe.");
        }
        return mp4;
    }

    public double capacidadDisponible() {
        double usado = 0;
        for (int i = 0; i < nroCanciones; i++) {
            usado += Double.parseDouble(canciones[i][2]) / 1024; // Kb a Mb
        }
        for (int i = 0; i < nroVideos; i++) {
            usado += Double.parseDouble(videos[i][2]); // ya está en MB
        }
        return capacidadGb * 1024 - usado; // convertir Gb a MB
    }

    private boolean existeCancion(String nombre) {
        for (int i = 0; i < nroCanciones; i++) {
            if (canciones[i][0].equals(nombre)) return true;
        }
        return false;
    }

    private boolean existeVideo(String nombre) {
        for (int i = 0; i < nroVideos; i++) {
            if (videos[i][0].equals(nombre)) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Mp4 mp4 = new Mp4("Sony", 1); 

        String[] cancion1 = {"Back To Black", "Amy Winehouse", "100"}; 
        String[] cancion2 = {"Lost On You", "LP", "150"};

        mp4 = Mp4.operatorPlus(mp4, cancion1);
        mp4 = Mp4.operatorPlus(mp4, cancion2);

        String[] video1 = {"Heathens", "twenty one pilots", "50"}; 
        String[] video2 = {"Harmonica Andromeda", "KSHMR", "70"};
        String[] video3 = {"Without Me", "Halsey", "30"};

        mp4 = Mp4.operatorMinus(mp4, video1);
        mp4 = Mp4.operatorMinus(mp4, video2);
        mp4 = Mp4.operatorMinus(mp4, video3);

        System.out.println("\n--- Probando borrar ---");
        mp4.borrarCancion("Lost On You");
        mp4.borrarCancionPorArtista("Amy Winehouse"); 
        mp4.borrarCancion("Back To Black", "100"); 

        System.out.println("\nCapacidad disponible (MB): " + mp4.capacidadDisponible());
    }
}

