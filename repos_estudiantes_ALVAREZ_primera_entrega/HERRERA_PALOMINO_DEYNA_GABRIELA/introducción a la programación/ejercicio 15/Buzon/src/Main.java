public class Main {
    public static void main(String[] args) {
        Carta c1=new Carta("C022", "Entrega de documentos par el Director Lic Carrasco....");
        Carta c2=new Carta("E458", "Invitacion al Matrimonio de Luisa y Juan para la familia Perez");
        Carta c3=new Carta("T025", "Informe 20/12/2024 Informe Anual de registros");
        Carta c4=new Carta("U458", "Memorandum 12/06/2015");
        Carta c5=new Carta("F255", "Invitacion de Cumpleaños ");
        Carta c6=new Carta("H155", "Convocatoria a Reunion 04/08/2025");
        Carta c7=new Carta("A115", "Solicitud de Empleo");
        Carta c8=new Carta("W458", "Renuncia 05/09/2025");
        Carta c9=new Carta("U458", "Pago de deuda");

        Buzon b1=new Buzon(1, 45);
        Buzon b2=new Buzon(2, 10);
        Buzon b3=new Buzon(3, 20);

        b1.agregarCarta(c1, "Maria ","Juan Carrasco");
        b1.agregarCarta(c9, "Diego", "Adele");
        b1.agregarCarta(c8, "Adele", "Juan Carrasco");
        b2.agregarCarta(c2, "Luisa ", "Famailia Perez");
        b3.agregarCarta(c3,"Jaime","Abigail ");
        b1.mostrarCartas();
        b2.mostrarCartas();
        b3.mostrarCartas();
        c1.mostrar();
        c9.mostrar();
        b1.verCantCartDestX("Juan Carrasco");
        b2.eliminarCartaCodigo("E458");
        b1.veriRemiCartaDest("Adele");
    }
    
}
