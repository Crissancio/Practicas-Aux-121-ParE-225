package IntroduccionPoo.Ejercicio2;

public abstract class BusUrbano  extends Bus {
   
    public BusUrbano(int capacidadTotal) {
        super(capacidadTotal);
    }

    @Override
    public double cobrarPasaje() {
        double total = pasajerosActuales * costoPasaje;
        System.out.println("Se recaudó Bs. " + total + " por los pasajes.");
        return total;
    }
}
