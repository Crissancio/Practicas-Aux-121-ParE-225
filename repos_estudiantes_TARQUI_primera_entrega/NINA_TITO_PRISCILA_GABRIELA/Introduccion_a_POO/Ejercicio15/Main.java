package PRACTICA1AUXILIATURA.Introduccion_a_POO.Ejercicio15;
//DIAGRAMA UML YA HECHO EN EL PDF DE LA PRACTICA
public class Main {
    public static void main(String[] args) {
        Carta c1 = new Carta("C111","Saludos cordiales");
        Carta c2 = new Carta("C222","Felicitaciones");
        Carta c3 = new Carta("C333","Invitacion a evento");
        Buzon b1 = new Buzon(1);
        b1.agregarCarta(c1.getCodigo(),0,"Juan Perez","Ana Gomez");
        b1.agregarCarta(c2.getCodigo(),1,"Maria Lopez","Luis Torres");
        b1.agregarCarta(c3.getCodigo(),2,"Carlos Sanchez","Laura Martinez");
        b1.mostrarCartas();

        Carta c4 = new Carta("C444","Saludos cordiales");
        Carta c5 = new Carta("C555","Felicitaciones");
        Carta c6 = new Carta("C666","Invitacion a evento");
        Buzon b2 = new Buzon(2);
        b2.agregarCarta(c4.getCodigo(),0,"Ana Gomez","Juan Perez");
        b2.agregarCarta(c5.getCodigo(),1,"Luis Torres","Maria Lopez");
        b2.agregarCarta(c6.getCodigo(),2,"Laura Martinez","Carlos Sanchez");
        b2.mostrarCartas();

        Carta c7 = new Carta("C777","Saludos cordiales");
        Carta c8 = new Carta("C888","Felicitaciones");
        Carta c9 = new Carta("C999","Invitacion a evento");
        Buzon b3 = new Buzon(3);
        b3.agregarCarta(c7.getCodigo(),0,"Pedro Pascal","Sofia Vergara");
        b3.agregarCarta(c8.getCodigo(),1,"Ryan Gosling","Emma Stone");
        b3.agregarCarta(c9.getCodigo(),2,"Robert Downey Jr.","Scarlett Johansson");
        b3.mostrarCartas();

        System.out.println("c)");
        //c) Verificar cuántas cartas recibió el destinatario X
        String destinatarioX = "Maria Lopez";
        int totalCartasDestinatarioX = b1.contarCartasDestinatario(destinatarioX) + b2.contarCartasDestinatario(destinatarioX) + b3.contarCartasDestinatario(destinatarioX);
        System.out.println(destinatarioX + " recibió un total de " + totalCartasDestinatarioX + " cartas.");
        System.out.println("-------------------------");

        System.out.println("d)");
        //d) Eliminar la carta de la matriz cuyo código sea “X”"
        String codigoX = "C555";
        b1.eliminarCarta(codigoX);
        b2.eliminarCarta(codigoX);
        b3.eliminarCarta(codigoX);
        System.out.println("-------------------------");

        System.out.println("e)");
        //e) Verificar si algún remitente ha recibido alguna carta y, en ese caso, indicar de quién.
        String remitenteX = "Maria Lopez";
        b1.remitenteRecibioCarta(remitenteX);
        b2.remitenteRecibioCarta(remitenteX);
        b3.remitenteRecibioCarta(remitenteX);
        System.out.println("-------------------------");

        System.out.println("f) y g)"); 
        //f) Buscar una palabra clave (por ejemplo, "amor") en las descripciones de las cartas instanciadas.
        //g) Por cada coincidencia, mostrar el código, remitente y destinatario correspondientes.
        String palabraClave = "Saludos";
        if (c1.buscarPalabraClave(palabraClave)){
            System.out.println("La carta con codigo " + c1.getCodigo() + " contiene la palabra clave '" + palabraClave + "'");
        }
        if (c2.buscarPalabraClave(palabraClave)){
            System.out.println("La carta con codigo " + c2.getCodigo() + " contiene la palabra clave '" + palabraClave + "'");
        }
        if (c3.buscarPalabraClave(palabraClave)){
            System.out.println("La carta con codigo " + c3.getCodigo() + " contiene la palabra clave '" + palabraClave + "'");
        }
        if (c4.buscarPalabraClave(palabraClave)){
            System.out.println("La carta con codigo " + c4.getCodigo() + " contiene la palabra clave '" + palabraClave + "'");
        }
        if (c5.buscarPalabraClave(palabraClave)){
            System.out.println("La carta con codigo " + c5.getCodigo() + " contiene la palabra clave '" + palabraClave + "'");
        }
        if (c6.buscarPalabraClave(palabraClave)){
            System.out.println("La carta con codigo " + c6.getCodigo() + " contiene la palabra clave '" + palabraClave + "'");
        }
        if (c7.buscarPalabraClave(palabraClave)){
            System.out.println("La carta con codigo " + c7.getCodigo() + " contiene la palabra clave '" + palabraClave + "'");
        }
        if (c8.buscarPalabraClave(palabraClave)){
            System.out.println("La carta con codigo " + c8.getCodigo() + " contiene la palabra clave '" + palabraClave + "'");
        }
        if (c9.buscarPalabraClave(palabraClave)){
            System.out.println("La carta con codigo " + c9.getCodigo() + " contiene la palabra clave '" + palabraClave + "'");
        }
        System.out.println("-------------------------");
    }

}
