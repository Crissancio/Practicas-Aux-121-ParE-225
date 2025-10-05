package Ejercicio15;

public class Main {
    public static void main(String[] args) {
        // a) Instanciar 3 buzones con al menos 3 cartas
        Buzon b1 = new Buzon(1);
        Buzon b2 = new Buzon(2);
        Buzon b3 = new Buzon(3);

        Carta c1 = new Carta("C123", "Juan Álvarez", "Peter Chaves",
                "Querido amigo, te escribo con mucho cariño...");
        Carta c2 = new Carta("C456", "Pepe Mujica", "Wilmer Pérez",
                "Te cuento que el amor siempre vence...");
        Carta c3 = new Carta("C789", "Paty Vasques", "Pepe Mujica",
                "Ella no te ama, pero te respeta...");

        Carta c4 = new Carta("C101", "Ana Ruiz", "Carlos López",
                "Hoy te envío una carta llena de amor y esperanza.");
        Carta c5 = new Carta("C202", "Luis García", "Pepe Mujica",
                "Saludos cordiales desde La Paz.");
        Carta c6 = new Carta("C303", "Wilmer Pérez", "Juan Álvarez",
                "Gracias por tu apoyo siempre.");

        b1.agregarCarta(c1);
        b1.agregarCarta(c2);
        b1.agregarCarta(c3);

        b2.agregarCarta(c4);
        b2.agregarCarta(c5);
        b2.agregarCarta(c6);

        b3.agregarCarta(c1);
        b3.agregarCarta(c5);
        b3.agregarCarta(c6);

        // b) Mostrar las cartas (verificación inicial)
        System.out.println("=== Cartas Iniciales ===");
        b1.mostrarCartas();

        // c) Verificar cuántas cartas recibió el destinatario "Pepe Mujica"
        System.out.println("\nCartas recibidas por Pepe Mujica en Buzón 1: " +
                b1.contarCartasPorDestinatario("Pepe Mujica"));

        // d) Eliminar carta cuyo código sea "C456"
        System.out.println("\nEliminando carta con código C456...");
        b1.eliminarCartaPorCodigo("C456");
        b1.mostrarCartas();

        // e) Verificar si un remitente ha enviado alguna carta
        String remitente = "Pepe Mujica";
        if (b1.remitenteHaEnviado(remitente))
            System.out.println("\n" + remitente + " ha enviado cartas en el Buzón 1.");
        else
            System.out.println("\n" + remitente + " no tiene cartas en el Buzón 1.");

        // f) Buscar palabra clave "amor" en las descripciones
        System.out.println("\nBuscando cartas con la palabra 'amor':");
        b2.buscarPorPalabraClave("amor");

        // g) Mostrar coincidencias con código, remitente y destinatario
        System.out.println("\n=== Coincidencias globales ===");
        b1.buscarPorPalabraClave("amor");
        b2.buscarPorPalabraClave("amor");
        b3.buscarPorPalabraClave("amor");
    }
}
