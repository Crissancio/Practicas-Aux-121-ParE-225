
public class Main {
    public static void main(String[] args) {
        Pasajero p1 = new Pasajero("Juan Vargas", 30, "Masculino");
        Pasajero p2 = new Pasajero("Martina Vasques", 27, "Femenino");
        Pasajero p3 = new Pasajero("Wilmer Montero", 40, "Masculino");
        Pasajero p4 = new Pasajero("Laura Pérez", 22, "Femenino");
        Pasajero p5 = new Pasajero("Carlos Rojas", 35, "Masculino");

        Crucero c1 = new Crucero("Pacífico", "Chile", "México");
        Crucero c2 = new Crucero("Atlántico", "Brasil", "España");

        c1.adicionar(p1, 500);
        c1.adicionar(p2, 1000);
        c1.adicionar(p3, 925);

        c2.adicionar(p4, 800);
        c2.adicionar(p5, 700);

        c1.inc();
        c1.dec();

        c1.igualA(c2);
        c1.comparar(c2);
        c1.contarGenero();
    }
}
