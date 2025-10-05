import java.util.Scanner;
public class Bus {
    public int asientos=12;
    public int pasajeros;
    public Bus(){
        this.pasajeros=pasajeros;
    }
    public void Pasajeros() {
        Scanner lee=new Scanner(System.in);
        System.out.println("[ Introduzca cuantos pasajeros van a subir, solo hay "+asientos+" asientos :]");
        do {
            int pasajeros= lee.nextInt();
            this.pasajeros = pasajeros;
        }while (this.pasajeros>asientos || this.pasajeros<0);
    }
    public double cobrarPasaje(){
        return this.pasajeros*1.50;
    }
    @Override
    public String toString() {
        return "[ los asientos disponibles son: "+(this.asientos-this.pasajeros) + ", y se cobro: "+ cobrarPasaje()+ " bs ]";
    }
    public static void main(String[] args){
        Bus bus= new Bus();
        bus.Pasajeros();
        System.out.println(bus);
    }
}

