package POLIMORFISMO.EJERCICIO13;

public class Main {
    public static void main(String[] args){
        Mp4 mp4 = new Mp4("Sony", 2, 3, 100, 100, 3 );
        //agregar los huaynitos
        mp4.agregarCancion(new Cancion("Back to black ", "Amy Winehouse", 100));
        mp4.agregarCancion(new Cancion("Lost on u", "LP", 150));
        //agregar los videos
        mp4.agregarVideo(new Video("Heathen", "TOP",70 ));
        mp4.agregarVideo(new Video("Harmonica Andromeda", "KSHMR", 70));
        mp4.agregarVideo(new Video("Without Me", "Halsey", 30));

        //mostrar el mp4
        mp4.mostrarEstado();

        //borrar borrar cancion  xd
        mp4.borrarCancion("back to black ", "Amy Winehouse", 100);
        //de nuevo mostrar el mp4
        System.out.println("borrado luego xd ");
        mp4.mostrarEstado();

    }
}
