public class Main{
    public static void main(String[] args) {
        VideoJuego v1=new VideoJuego("Call of duty","playstation2",1);
        VideoJuego v2=new VideoJuego("Mario kart", "Nintendo switch");
        v1.agregarJugadores();
        v2.agregarJugadores(4);
        v1.mostrar();
        v2.mostrar();
    }
}