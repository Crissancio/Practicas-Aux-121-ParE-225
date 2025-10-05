cl
public class Main {
    public static void main(String[] args) {
        Buzon b1 = new Buzon(1);
        Buzon b2 = new Buzon(2);
        Buzon b3 = new Buzon(3);

        Carta c1 = new Carta("C123", "Juan Álvarez", "Peter Chaves", "Querido amigo, espero que estés bien.");
        Carta c2 = new Carta("C456", "Pepe Mujica", "Wilmer Pérez", "Te escribo para hablar del proyecto.");
        Carta c3 = new Carta("C789", "Paty Vasques", "Pepe Mujica",
                "Con mucho cariño y amor te dedico estas palabras.");

        b1.agregarCarta(c1);
        b1.agregarCarta(c2);
        b1.agregarCarta(c3);

        b2.agregarCarta(c1);
        b2.agregarCarta(c2);
        b2.agregarCarta(c3);

        b3.agregarCarta(c1);
        b3.agregarCarta(c2);
        b3.agregarCarta(c3);

        int contador = 0;
        for (Carta c : b1.getCartas()) {
            if (c.getDestinatario().equalsIgnoreCase("Pepe Mujica")) {
                contador++;
            }
        }
        System.out.println("Pepe Mujica recibió " + contador + " cartas.");

        b1.eliminarCarta("C456");
        System.out.println("Cartas restantes en buzón 1: " + b1.getNroC());

        for (Carta c : b1.getCartas()) {
            for (Carta otra : b1.getCartas()) {
                if (c.getRemitente().equalsIgnoreCase(otra.getDestinatario())) {
                    System.out.println("El remitente " + c.getRemitente() +
                            " también recibió una carta de " + otra.getRemitente());
                }
            }
        }

        String clave = "amor";
        for (Carta c : b1.getCartas()) {
            if (c.getDescripcion().toLowerCase().contains(clave.toLowerCase())) {
                System.out.println("Coincidencia encontrada: " +
                        "Código: " + c.getCodigo() +
                        ", Remitente: " + c.getRemitente() +
                        ", Destinatario: " + c.getDestinatario());
            }
        }
    }
}
