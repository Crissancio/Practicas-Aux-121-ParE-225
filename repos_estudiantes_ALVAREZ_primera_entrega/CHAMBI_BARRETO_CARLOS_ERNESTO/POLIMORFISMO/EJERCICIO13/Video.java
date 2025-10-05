package POLIMORFISMO.EJERCICIO13;

public class Video {
    public String nombre, artista;
    public int pesoMb;

    public Video(String nombre, String artista, int pesoMb) {
        this.nombre = nombre;
        this.artista = artista;
        this.pesoMb = pesoMb;
    }

    public String getNombre() {
        return nombre;
    }

    public String getArtista() {
        return artista;
    }

    public int getPesoMb() {
        return pesoMb;
    }

    public void mostrar(){
        System.out.println("Nombre: " + nombre + ", Artista: " + artista + ", peso: " + pesoMb);
    }
}
