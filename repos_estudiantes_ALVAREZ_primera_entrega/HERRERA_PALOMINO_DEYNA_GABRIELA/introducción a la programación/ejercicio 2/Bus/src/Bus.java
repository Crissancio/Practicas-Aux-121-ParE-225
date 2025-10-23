public class Bus{
    private int pasajeros;
    private int asientos;
    private double dineroRecaudado;
    private double costo=1.50;

    public Bus(int pasajeros, int asientos, double dineroRecaudado){
        this.pasajeros=pasajeros;
        this.asientos=asientos;
        this.dineroRecaudado=dineroRecaudado;
    }
    public void subirPasajeros(int cantidad){
        if (pasajeros+cantidad<=asientos){
            pasajeros+=cantidad;
            System.out.println(cantidad+pasajeros+ " pasajeros");
        }
        else{
            System.out.println("No hay espacio suficiente.");
            asientosDisponibles();
            pasajeros = asientos;
        }
    }
    public void cobrarPasaje(){
        double cobro=pasajeros*costo;
        dineroRecaudado+=cobro;
        System.out.println("Total cobrado: Bs."+cobro);
    }
    public void asientosDisponibles(){
        int disponibles= asientos-pasajeros;
        System.out.println("Asientos disponibles:" +disponibles);
    }
}