package POLIMORFISMO.EJERCICIO11;

public class Crucero {
    public String nombre, paisOrigen, paisDestino;
    public Pasajero[][] pasajeros;

    public Crucero(String nombre, String paisOrigen, String paisDestino, int pisos, int habitaciones) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.paisDestino = paisDestino;
        this.pasajeros= new Pasajero[pisos][habitaciones];
    }
    //agregar un pasajero
    public void agregarPasajero(Pasajero p, int piso, int habitacion){
        if (piso >= 0 && piso < pasajeros.length && habitacion>=0 && habitacion < pasajeros[0].length){
            pasajeros[piso][habitacion]=p;
        } else{
            System.out.println("Posicion invalida ;v ");
        }
    }
    //contar los pasajeros xd
    public int getNroPasajeros(){
        int c = 0;
        for(int i = 0 ; i < pasajeros.length ; i++){
            for(int j = 0 ; j < pasajeros[i].length ; j++){
                if(pasajeros[i][j] != null){
                    c++;
                }
            }
        }
        return c;
    }
    // Leer datos
    public void leerDatos() {
        System.out.println("Leyendo datos del crucero xd ");
    }

    //mostrar datos del crucero
    public void mostrarDatos(){
        System.out.println("Crucero " + nombre + " [ " + paisOrigen + " -> " + paisDestino + " ] ");
        for(int i = 0 ; i < pasajeros.length ; i++){
            for(int j = 0 ; j < pasajeros[i].length ; j++){
                if(pasajeros[i][j] != null ){
                    System.out.print("piso " + i + " habitacion " + j + " : ");
                    pasajeros[i][j].mostrarDatos();
                }
            }
        }
    }
    // la suma de los pasajes
    public double totalCostos(){
        double sm = 0;
        for(int i = 0 ; i < pasajeros.length ; i++){
            for(int j = 0 ; j < pasajeros[i].length ; j++){
                if(pasajeros[i][j] != null){
                    sm += pasajeros[i][j].getCostoPasaje();
                }
            }
        }
        return sm;
    }
    public boolean mismcaCantidad(Crucero otro){
        return this.getNroPasajeros() ==  otro.getNroPasajeros();
    }
    //contar generos
    public void contarGeneros(){
        int hombre = 0, mujer = 0;
        for(int i = 0 ; i < pasajeros.length ; i++){
            for(int j = 0 ; j < pasajeros[i].length ; j++){
                if(pasajeros[i][j] != null){
                    if(pasajeros[i][j].getGenero().equalsIgnoreCase("H")) hombre++;
                    else if(pasajeros[i][j].getGenero().equalsIgnoreCase("M")) mujer ++;
                }
            }
        }
        System.out.println("Hombres; " + hombre + ", Mujeres: " + mujer );
    }
    // SE DEBEN SOBRECARG LOS OPREADORES 
}

