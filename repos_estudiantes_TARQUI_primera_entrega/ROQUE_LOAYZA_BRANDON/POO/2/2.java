public class Bus {
    private int capacidad;
    private int pasajeros;
    private double recaudacion;
    public Bus(int capacidad){
        this.capacidad = capacidad;
        this.pasajeros = 0;
        this.recaudacion = 0.0;
    }
    public int subir(int cantidad){
        int disponibles = capacidad - pasajeros;
        int subir = cantidad <= disponibles ? cantidad : disponibles;
        pasajeros += subir;
        return subir;
    }
    public double cobrarPasaje(){
        double costo = 1.5;
        double total = pasajeros * costo;
        recaudacion += total;
        return total;
    }
    public int asientosDisponibles(){
        return capacidad - pasajeros;
    }
    public static void main(String[] args){
        Bus b = new Bus(40);
        System.out.println(b.subir(25));
        System.out.println(b.cobrarPasaje());
        System.out.println(b.asientosDisponibles());
    }
}
