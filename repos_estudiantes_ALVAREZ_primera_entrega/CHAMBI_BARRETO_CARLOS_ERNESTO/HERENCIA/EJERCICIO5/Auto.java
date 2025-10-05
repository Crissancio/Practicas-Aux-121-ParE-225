package HERENCIA.EJERCICIO5;

public class Auto extends Vehiculo{
    public int caballosFuerza;
    public boolean descapotable;
    public Auto(String conductor, String Placa, int id, int caballosFuerza, boolean descapotable){
        super(conductor, Placa, id);
        this.caballosFuerza=caballosFuerza;
        this.descapotable=descapotable;


    }
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Caballos de fuerza: " + caballosFuerza);
        System.out.println("Descapotable?" + (descapotable ? "SI LO ESTA" : "NO LO ESTA XD "));
    }
}
