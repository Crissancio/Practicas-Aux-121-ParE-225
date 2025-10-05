public class Bus {
    private int capacidad;
    private int pasajeros;
    private float costo;


    public Bus(int capacidad, float costo) {
        this.capacidad=capacidad;
        this.pasajeros=0;
        this.costo=costo;
    }

    // a) 
    public void subirPasajeros(int cantidad) {
        if (this.pasajeros+cantidad <= this.capacidad) {
            this.pasajeros+=cantidad;
        } else {
            System.out.println("No hay suficientes asientos");
        }
    }

    // b) 
    public float cobrarPasaje() {
        return this.pasajeros*this.costo;
    }

    // c) 
    public int asientosDisponibles() {
        return this.capacidad-this.pasajeros;
    }

    // d) 
    public static void main(String[] args) {
        Bus miBus=new Bus(40,1.5f);
        miBus.subirPasajeros(10); 
        System.out.println("fue cobradooo: "+miBus.cobrarPasaje()+" Bs"); 
        System.out.println("Asientos disponibles: "+miBus.asientosDisponibles()); 
    }
}
