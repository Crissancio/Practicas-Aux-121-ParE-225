public class Main {
    public static void main(String[] args) {
       
        Pasajero p1 = new Pasajero("Carlos", 30, "M", "H101", 500);
        Pasajero p2 = new Pasajero("Lucía", 25, "F", "H102", 600);
        Pasajero p3 = new Pasajero("Miguel", 40, "M", "H103", 700);
        Pasajero p4 = new Pasajero("Ana", 22, "F", "H104", 550);
        Pasajero p5 = new Pasajero("Sofía", 29, "F", "H105", 650);

        Crucero c1 = new Crucero("Oceania", "España", "Brasil");
        Crucero c2 = new Crucero("Titanic II", "Francia", "Italia");

        c1.incrementar(p1);
        c1.incrementar(p2);
        c1.incrementar(p3);

        c2.incrementar(p4);
        c2.incrementar(p5);

        c1.decrementar();
        c2.decrementar();

        c1.esIgual();
        c2.esIgual();

        c1.compararCruceros(c2);

        c1.contarGenero();
        c2.contarGenero();
    }
}

