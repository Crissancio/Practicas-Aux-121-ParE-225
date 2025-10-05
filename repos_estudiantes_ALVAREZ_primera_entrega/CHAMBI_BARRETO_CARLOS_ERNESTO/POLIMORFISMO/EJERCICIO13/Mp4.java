package POLIMORFISMO.EJERCICIO13;

public class Mp4 {
    public String marca;
    public double capacidadGb;
    public int nroCanciones, nroVideos;
    public Cancion[][] canciones;
    public Video[][] videos;

    public Mp4(String marca, double capacidadGb, int filasCanciones, int colsCanciones, int filasVideos, int colsVideos) {
        this.marca = marca;
        this.capacidadGb = capacidadGb;
        this.canciones = new Cancion[filasCanciones][colsCanciones];
        this.videos = new Video[filasVideos][colsVideos];
    }

    //borrar la cancion xd
    public void borrarCancion(String nombre, String artista, int pesoKb){
        for(int i = 0 ; i < canciones.length; i++){
            for(int j = 0 ; j < canciones[i].length ; j++){
                Cancion c = canciones[i][j];
                if(c != null && c.getNombre().equalsIgnoreCase(nombre)&& c.getArtista().equalsIgnoreCase(artista) && c.getPesokb() ==  pesoKb  ){
                    canciones[i][j] = null;
                    System.out.println("Cancion borrada " + nombre );
                    return;
                }
            }
        }
    }

    //Capacidad disponible

    public double capacidadDisponible(){
        double TotalMb = capacidadGb * 1024;
        double usado =  0;
        for(Cancion[] filas : canciones){
            for(Cancion c : filas){
                if( c!= null){
                    usado += (c.getPesokb()/1024);
                }
            }
        }
        for(Video[] filas : videos){
            for(Video v : filas){
                if(v!= null){
                    usado += (v.getPesoMb()/1024);
                }
            }
        }
        return TotalMb - usado;
    }

    // agregar una cancion
    public void agregarCancion(Cancion c){
        if(capacidadDisponible()< (c.getPesokb()/1024)){
            System.out.println("No hay espacio suficiente :V ");
            return;
        }
        for(int i = 0 ; i < canciones.length ; i++){
            for(int j = 0 ; j < canciones[i].length ; j++){
                if(canciones[i][j] == null){
                    canciones[i][j] = c;
                    System.out.println("C cancion añadida " + c.getNombre());
                    return;
                }
            }
        }
        System.out.println("No hay espacio suficiente en tu mp4 ;v ");
    }

    public void agregarVideo(Video v ){
        if(capacidadDisponible()< (v.getPesoMb())){
            System.out.println("no hay espacio hermanito");
            return;
        }
        for(int i = 0 ; i < videos.length ; i++){
            for(int j = 0 ;  j < videos[i].length ; j++){
                if(videos[i][j] == null){
                    videos[i][j] = v;
                    System.out.println("Video añadido: " + v.getNombre());
                    return;
                }
            }
        }
        System.out.println("Sin espacio lil hermanito");
    }

    public void mostrarEstado() {
        System.out.println("Mp4 marca: " + marca + " Capacidad " + capacidadGb + "GB");
        System.out.println("Capacidad disponible ;V " + capacidadDisponible() + "MB");
        //las canciones xdddxxdxdxdxdxdx
        System.out.println("Canciones: ");
        for(Cancion[] fila : canciones){
            for(Cancion c : fila){
                if(c != null){
                    c.mostrar();
                }
            }
        }


        System.out.println("videos : ");
        for(Video[] fila : videos){
            for(Video v : fila){
                if(v != null){
                    v.mostrar();
                }
            }
        }
    }

}
