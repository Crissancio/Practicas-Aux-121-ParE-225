package PRACTICA1AUXILIATURA.Polimorfismo.Ejercicio7;

public class Parada {
    private String[] admins;      
    private String[][] autos;      // autos[10][3] : [modelo, conductor, placa]
    private String nombreP;
    // a) Constructor por defecto
    public Parada() {
        admins = new String[10];
        autos = new String[10][3];
        nombreP = "SinNombre";
    }
    // a) Constructor pidiendo datos
    public Parada(String nombreP) {
        admins = new String[10];
        autos = new String[10][3];
        this.nombreP = nombreP;
    }
    // b) Método mostrar
    public void mostrar() {
        System.out.println("Nombre de la Parada: " + nombreP);

        System.out.println("Admins: ");
        for (int i = 0; i < admins.length; i++) {
            if (admins[i] != null) {
                System.out.println(" - " + admins[i]);
            }
        }

        System.out.println("Autos: ");
        for (int i = 0; i < autos.length; i++) {
            if (autos[i][0] != null) {
                System.out.println("Modelo: " + autos[i][0] + ", Conductor: " + autos[i][1] + ", Placa: " + autos[i][2]);
            }
        }
    }
    // c) Método adicionar(x) : adicionar un admin
    public void adicionar(String admin) {
        for (int i = 0; i < admins.length; i++) {
            if (admins[i] == null) {
                admins[i] = admin;
                break;
            }
        }
    }
    // d) Método adicionar(x,y,z) : adicionar un auto
    public void adicionar(String modelo, String conductor, String placa) {
        for (int i = 0; i < autos.length; i++) {
            if (autos[i][0] == null) {
                autos[i][0] = modelo;
                autos[i][1] = conductor;
                autos[i][2] = placa;
                break;
            }
        }
    }
    public static void main(String[] args) {
        // Crear objeto usando constructor por defecto
        Parada p1 = new Parada();
        System.out.println("=== Parada 1 Antes: ===");
        p1.mostrar();
        // Crear objeto usando constructor con parámetros
        Parada p2 = new Parada("Parada Central");
        System.out.println();
        System.out.println("=== Parada 2 Antes: ===");
        p2.mostrar();
        System.out.println();
        
        // Adicionar admins
        p1.adicionar("Juan");
        p1.adicionar("María");
        p2.adicionar("Carlos");
        p2.adicionar("Lucía");

        // Adicionar autos (modelo, conductor, placa)
        p1.adicionar("Toyota Corolla", "Pedro", "123ABC");
        p1.adicionar("Nissan Versa", "Ana", "456XYZ");

        p2.adicionar("Honda Civic", "Luis", "789QWE");
        p2.adicionar("Chevrolet Onix", "Laura", "321RTY");

        // Mostrar datos
        System.out.println("=== Datos de Parada 1 ===");
        p1.mostrar();

        System.out.println("\n=== Datos de Parada 2 ===");
        p2.mostrar();
    }
}

