public class VideoJuego {
    private String nombre;
    private String plataforma;
    private int cantJugadores;

    public VideoJuego(String nombre, String plataforma, int cantJugadores){
        this.nombre=nombre;
        this.plataforma=plataforma;
        this.cantJugadores=cantJugadores;
    }
    public VideoJuego(String nombre, String plataforma) {
    this.nombre = nombre;
    this.plataforma = plataforma;
    this.cantJugadores = 0; 
}
    public void agregarJugadores( ){
        cantJugadores++;
    }
    public void agregarJugadores(int cantidad){
        cantJugadores+=cantidad;
    }
    public void mostrar(){
        System.out.println(nombre+" cantidad de jugadores  "+cantJugadores);
    }

}
