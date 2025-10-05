public class Main {
    public static void main(String[]args){
        System.out.println("----------");
        System.out.println("Vehiculo 1");
        System.out.println("----------");
        Bus bus=new Bus("Ademar Duran","SEG1537",122,20,"La paz");
        System.out.println(bus);
        System.out.println("----------");
        System.out.println("Vehiculo 2");
        System.out.println("----------");
        Auto auto=new Auto( "Alan Chura","KIO0937",190,200,true);
        System.out.println(auto);

        System.out.println("----------");
        System.out.println("Vehiculo 3");
        System.out.println("----------");
        Moto moto=new Moto("Sebastian Zalles","HJKP33A",69,80,false);
        System.out.println(moto);
        moto.cambiarConductor("Marcelo Ticona");
    }
}
