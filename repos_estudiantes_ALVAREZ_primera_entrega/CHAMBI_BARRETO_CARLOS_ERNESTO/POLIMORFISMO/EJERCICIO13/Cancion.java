package POLIMORFISMO.EJERCICIO13;

public class Cancion {
    public String nombre, artista;
    public int pesokb;

    public Cancion(String nombre, String artista, int pesokb){
        this.nombre=nombre;
        this.artista=artista;
        this.pesokb=pesokb;
    }
    public String getNombre(){
        return nombre;
    }
    public String getArtista(){
        return artista;
    }
    public int getPesokb(){
        return pesokb;

    }
    public void mostrar(){
        System.out.println("Nombre: " + nombre + ", Artista: " + artista + ", peso: " + pesokb);
    }
    //mostrar el estado

}
