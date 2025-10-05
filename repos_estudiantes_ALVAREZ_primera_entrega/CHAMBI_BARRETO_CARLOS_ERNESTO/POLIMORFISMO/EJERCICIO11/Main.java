package POLIMORFISMO.EJERCICIO11;

public class Main {
    public static void main(String[] args){
        Pasajero p1 = new Pasajero("Juan Vargas ", "H", 502, 500, 30);
        Pasajero p2 = new Pasajero("Martina Vasques", "M", 234, 600, 61);
        Pasajero p3 = new Pasajero("Wilmer Ortuño", "H", 654, 550, 31);
        Pasajero p4 = new Pasajero("Donovan James ", "m", 332, 1, 17);
        Pasajero p5 = new Pasajero("Favri Down", "M", 1, 124, 16);

        Crucero c1 = new Crucero("C barco ", "Bolivia ", "Japon", 3, 100);
        Crucero c2 = new Crucero("C barco dois ", "Cerru ", "China", 3, 100);

        //poner los pasajeros xd
        c1.agregarPasajero(p1, 0, 2);
        c1.agregarPasajero(p2, 0, 3);
        c1.agregarPasajero(p3, 1,
                0);

        c2.agregarPasajero(p4, 0, 1);
        c2.agregarPasajero(p5, 2, 5);

        //mostrar los datos de los cruceros
        c1.mostrarDatos();
        c2.mostrarDatos();

        //El totla de los pasajes acumulado
        System.out.println("TOTAL DE PASAJES crucero 1:v " + c1.totalCostos());
        System.out.println("TOTAL DE PASAJES crucero 2:v " + c2.totalCostos());

        System.out.println("tienen la misma cantidad de pasajeros ? " + c1.mismcaCantidad(c2));

        //Cantidad de generos xd
        System.out.print("Crucero 1 ");
        c1.contarGeneros();
        System.out.print("Crucero 2 ");
        c2.contarGeneros();





    }
}
