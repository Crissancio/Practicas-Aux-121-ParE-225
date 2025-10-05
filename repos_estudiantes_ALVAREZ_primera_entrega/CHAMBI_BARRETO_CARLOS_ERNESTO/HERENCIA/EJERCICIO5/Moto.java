package HERENCIA.EJERCICIO5;

public class Moto extends Vehiculo{
    public int cilindrada;
    public boolean casco;
    public Moto(String conductor, String Placa, int id, int cilindrada, boolean casco){
        super(conductor, Placa, id);
        this.cilindrada=cilindrada;
        this.casco=casco;

    }
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Cilindrada: "+ cilindrada);
        System.out.println("Llevas casco ? " + (casco ?"si" : "no"));
    }
}
