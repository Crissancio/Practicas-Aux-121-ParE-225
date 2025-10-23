package INTRODUCCION_A_POO.EJERCICIO15;

public class Main {
    public static void main(String[] args) {
        // a) Instanciar 3 buzones con al menos 3 cartas cada uno
        Buzon buzon1 = new Buzon(1, 3);
        Buzon buzon2 = new Buzon(2, 3);
        Buzon buzon3 = new Buzon(3, 3);

        // b) Instanciar cartas
        Carta c1 = new Carta("C123", "Carta sobre negocios", "Juan Álvarez", "Peter Chaves");
        Carta c2 = new Carta("C456", "Querido amigo, te escribo para decirte que ella no te ama...", "Pepe Mujica", "Wilmer Pérez");
        Carta c3 = new Carta("C789", "Carta con consejos personales", "Paty Vasques", "Pepe Mujica");

        Carta c4 = new Carta("C101", "Te envío recuerdos con amor", "Luis Soto", "Pepe Mujica");
        Carta c5 = new Carta("C202", "Informe académico", "Carlos Pérez", "Juan Álvarez");
        Carta c6 = new Carta("C303", "Saludos cordiales", "Marta López", "Wilmer Pérez");

        Carta c7 = new Carta("C404", "Carta sobre el futuro", "Ana Díaz", "Peter Chaves");
        Carta c8 = new Carta("C505", "Con cariño y amor eterno", "Pedro Luis", "Paty Vasques");
        Carta c9 = new Carta("C606", "Trabajo pendiente", "Fernando Ruiz", "Pepe Mujica");

        buzon1.agregarCarta(0, c1);
        buzon1.agregarCarta(1, c2);
        buzon1.agregarCarta(2, c3);

        buzon2.agregarCarta(0, c4);
        buzon2.agregarCarta(1, c5);
        buzon2.agregarCarta(2, c6);

        buzon3.agregarCarta(0, c7);
        buzon3.agregarCarta(1, c8);
        buzon3.agregarCarta(2, c9);

        // debe ser un metodo en buzon
        int contador = 0;
        Buzon[] buzones = {buzon1, buzon2, buzon3};
        for (Buzon b : buzones) {
            for (Carta carta : b.cartas) {
                if (carta.destinatario.equals("Pepe Mujica")) {
                    contador++;
                }
            }
        }
        System.out.println("Pepe Mujica recibió " + contador + " cartas.");
        // debe ser un metodo en buzon
        for (Buzon b : buzones) {
            for (int i = 0; i < b.cartas.length; i++) {
                if (b.cartas[i] != null && b.cartas[i].codigo.equals("C456")) {
                    b.cartas[i] = null;
                    System.out.println("La carta con código C456 fue eliminada.");
                }
            }
        }

        // debe ser un metodo en buzon
        String remitenteBuscado = "Pepe Mujica";
        boolean recibio = false;
        for (Buzon b : buzones) {
            for (Carta carta : b.cartas) {
                if (carta != null && carta.destinatario.equals(remitenteBuscado)) {
                    recibio = true;
                    System.out.println(remitenteBuscado + " recibió una carta de " + carta.remitente);
                }
            }
        }
        if (!recibio) {
            System.out.println(remitenteBuscado + " no recibió ninguna carta.");
        }

        // debe ser un metodo para buscar dentro de carta
        String clave = "amor";
        for (Buzon b : buzones) {
            for (Carta carta : b.cartas) {
                if (carta != null && carta.descripcion.toLowerCase().contains(clave)) {
                    System.out.println("Se encontró '" + clave + "' en carta " + carta.codigo);
                }
            }
        }

        // debe ser un metodo en buzon
        for (Buzon b : buzones) {
            for (Carta carta : b.cartas) {
                if (carta != null && carta.descripcion.toLowerCase().contains(clave)) {
                    System.out.println("Coincidencia -> Código: " + carta.codigo +
                            ", Remitente: " + carta.remitente +
                            ", Destinatario: " + carta.destinatario);
                }
            }
        }
    }
}
